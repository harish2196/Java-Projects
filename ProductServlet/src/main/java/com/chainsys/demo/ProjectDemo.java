package com.chainsys.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProjectDemo
 */
@WebServlet("/ProjectDemo")
public class ProjectDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ProjectDemo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
        user.setName(request.getParameter("name"));
        user.setEmail(request.getParameter("email"));
        user.setPassword(request.getParameter("pass"));
        user.setMobile(request.getParameter("contact"));
	    
	    RequestDispatcher dispatcher = null;
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
	        String insertQuery = "INSERT INTO Employee_details (username, useremail, userpassword, usermobile, emp_code) VALUES (?, ?, ?, ?, ?)";
	       PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.setString(4, user.getMobile());
	        
	     
	        int randomNumber = 1000 + (int) (Math.random() * 9000);
	        preparedStatement.setInt(5, randomNumber); 
	   
	        request.setAttribute("randomNumber", randomNumber);

	        int rowCount = preparedStatement.executeUpdate();
	        dispatcher = request.getRequestDispatcher("registration.jsp");
	        if (rowCount > 0) {
	            request.setAttribute("status", "success");
	        } else {
	            request.setAttribute("status", "failed");
	        }
	        dispatcher.forward(request, response);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	}

}
