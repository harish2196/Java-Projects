package com.chainsys.demo;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Base64;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class ProjectDemo
 */
@WebServlet("/ProjectDemo")
@MultipartConfig
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
	    InputStream inputStream = null;
	    Part filePart = request.getPart("image");
	    if (filePart != null) {
	        inputStream = filePart.getInputStream();
	    }

	    byte[] imageBytes = null;
	    if (inputStream != null) {
	        try {
	            imageBytes = inputStream.readAllBytes();
	        } finally {
	            inputStream.close(); 
	        }
	    }

	    User user = new User();
	    user.setName(request.getParameter("name"));
	    user.setEmail(request.getParameter("email"));
	    user.setPassword(request.getParameter("pass"));
	    user.setMobile(request.getParameter("contact"));
	    user.setImageData(imageBytes);

	    Connection connection = null;
	    PreparedStatement preparedStatement = null;
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "root");
	        String insertQuery = "INSERT INTO Employee_details (username, useremail, userpassword, usermobile, image, emp_code) VALUES (?, ?, ?, ?, ?, ?)";
	        preparedStatement = connection.prepareStatement(insertQuery);
	        preparedStatement.setString(1, user.getName());
	        preparedStatement.setString(2, user.getEmail());
	        preparedStatement.setString(3, user.getPassword());
	        preparedStatement.setString(4, user.getMobile());
	        preparedStatement.setBytes(5, user.getImageData());

	        int randomNumber = 1000 + (int) (Math.random() * 9000);
	        preparedStatement.setInt(6, randomNumber);

	        int rowCount = preparedStatement.executeUpdate();
	        if (rowCount > 0) {
	            request.setAttribute("status", "success");
	            request.setAttribute("randomNumber", randomNumber);
	        } else {
	            request.setAttribute("status", "failed");
	        }
	    } catch (ClassNotFoundException | SQLException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (preparedStatement != null) {
	                preparedStatement.close();
	            }
	            if (connection != null) {
	                connection.close();
	            }
	            if (filePart != null) {
	                filePart.delete(); 
	            }
	        } catch (IOException e) {
	           
	            e.printStackTrace();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    request.getRequestDispatcher("registration.jsp").forward(request, response);
	}

}
