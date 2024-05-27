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

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    String uname = request.getParameter("username");
	    String upassword = request.getParameter("password");
	    HttpSession session = request.getSession();
	    RequestDispatcher dispatcher = null;

	    if (session.getAttribute("uname") == null) {
	        response.sendRedirect("login.jsp");
	        return; // Stop further execution
	    }

	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root")) {
	            String viewQuery = "SELECT * FROM pricingdemo WHERE uname=? and upassword=?";
	            try (PreparedStatement preparedStatement = connection.prepareStatement(viewQuery)) {
	                preparedStatement.setString(1, uname);
	                preparedStatement.setString(2, upassword);

	                try (ResultSet rs = preparedStatement.executeQuery()) {
	                    if (rs.next()) {
	                        session.setAttribute("name", rs.getString("uname"));
	                        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
	                        response.setHeader("Pragma", "no-cache");
	                        response.setHeader("Expires", "0");
	                        response.sendRedirect("index.jsp");
	                        return; // Stop further execution
	                    } else {
	                        request.setAttribute("status", "failed");
	                        dispatcher = request.getRequestDispatcher("login.jsp");
	                    }
	                }
	            }
	        }
	    } catch (Exception e) {
	        e.printStackTrace(); // Log the error or display a generic error message
	    }

	    if (dispatcher != null) {
	        dispatcher.forward(request, response);
	    }
	}


}
