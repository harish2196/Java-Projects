package com.chainsys.servlet;

import java.io.IOException;
import com.chainsys.servlet.Crud; 
import com.chainsys.servlet.FormData;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;

/**
 * Servlet implementation class DemoServ
 */
@WebServlet("/DemoServ")
public class DemoServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	FormData formData=new FormData();


	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DemoServ() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phoneNo=request.getParameter("phonenumber");
		long phoneNumber = Long.parseLong(phoneNo);
		
		formData.setName(name);
		formData.setEmail(email);
		formData.setPhonenumber(phoneNumber);
		
		try {
			Crud.insertData(formData);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		 request.setAttribute("formData", formData);

	        request.getRequestDispatcher("table.jsp").forward(request, response);
		


	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	

}
