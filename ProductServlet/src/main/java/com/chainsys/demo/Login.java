package com.chainsys.demo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Login")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Login() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String uname = request.getParameter("username");
        String upassword = request.getParameter("password");
        HttpSession session = request.getSession();
        RequestDispatcher dispatcher = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root","root"); 
            String viewQuery = "SELECT * FROM pricingdemo WHERE uname=? AND upassword=?";
            PreparedStatement preparedStatement = connection.prepareStatement(viewQuery);
           
            preparedStatement.setString(1, uname);
            preparedStatement.setString(2, upassword);

            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                session.setAttribute("name", rs.getString("uname"));
                dispatcher = request.getRequestDispatcher("index.jsp");
            }
            else {
                request.setAttribute("status", "failed");
                dispatcher = request.getRequestDispatcher("login.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
     
        if (dispatcher != null) {
            dispatcher.forward(request, response);
        }
    }
}