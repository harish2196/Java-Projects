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

        User user = new User();
        user.setName(request.getParameter("username"));
        user.setPassword(request.getParameter("password"));

        HttpSession session = request.getSession();
        RequestDispatcher dispatcher = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
            String viewQuery = "SELECT * FROM Pricing_demo WHERE username=? AND userpassword=?";
            PreparedStatement preparedStatement = connection.prepareStatement(viewQuery);

            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getPassword());

            ResultSet rs = preparedStatement.executeQuery();
            if (rs.next()) {
                session.setAttribute("name", rs.getString("username"));
                int empCode = rs.getInt("emp_code");
                session.setAttribute("emp_code", empCode);  
                dispatcher = request.getRequestDispatcher("index.jsp");

                
                insertCheckInTime(connection, empCode);
            } else {
                request.setAttribute("status", "failed");
                dispatcher = request.getRequestDispatcher("login.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("status", "error");
            dispatcher = request.getRequestDispatcher("login.jsp");
        }

        if (dispatcher != null) {
            dispatcher.forward(request, response);
        }
    }

    private void insertCheckInTime(Connection connection, int emp_code) {
        try {
            String insertCheckInQuery = "INSERT INTO check_ins (emp_code, checkin_time) VALUES (?, NOW())";
            PreparedStatement insertCheckInStatement = connection.prepareStatement(insertCheckInQuery);
            insertCheckInStatement.setInt(1, emp_code);
            insertCheckInStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
