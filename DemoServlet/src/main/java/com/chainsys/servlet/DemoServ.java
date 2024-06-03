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
	ArrayList<FormData> formDataList = new ArrayList<>();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phoneNo = request.getParameter("phonenumber");
		long phoneNumber = Long.parseLong(phoneNo);

		FormData formData = new FormData();
		formData.setName(name);
		formData.setEmail(email);
		formData.setPhonenumber(phoneNumber);


		try {
			Crud.insertData(formData);
			ArrayList<FormData> allFormDataList = Crud.getAllData();
			ArrayList<FormData> formDataListById = Crud.retrieveData(3);
			request.setAttribute("allFormDataList", allFormDataList);
			request.setAttribute("formDataListById", formDataListById);
			request.getRequestDispatcher("table.jsp").forward(request, response);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();

		}


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int id=Integer.parseInt(request.getParameter("id"));
	
		String choice= request.getParameter("action");
		 
	    
		switch(choice){
		case "delete":	
		try {
			ArrayList<FormData> deleteData = Crud.deleteData(id);
			ArrayList<FormData> allFormDataList = Crud.getAllData();
			request.setAttribute("allFormDataList", allFormDataList);
			request.getRequestDispatcher("table.jsp").forward(request, response);

		} catch (SQLException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		case "update":
			Crud crud =new Crud();
			 String name= request.getParameter("name");
		     long phoneNo = Long.parseLong(request.getParameter("phonenumber"));
		     String email = request.getParameter("email");
			
			FormData data = new FormData();
			data.setName(name);
			data.setPhonenumber(phoneNo);
			data.setEmail(email);
			data.setId(id);
			
			try {
				
				crud.updateData(data);
				ArrayList<FormData> allFormDataList = Crud.getAllData();
				request.setAttribute("allFormDataList", allFormDataList);
				request.getRequestDispatcher("table.jsp").forward(request, response);

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
}
	



