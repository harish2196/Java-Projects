package com.chainsys.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("get");
		String name=request.getParameter("username");
		String email=request.getParameter("email");
		String dob = request.getParameter("date");
		//String gender=request.getParameter("gender");
		String pass=request.getParameter("password");
		//int phoneNo=Integer.parseInt(request.getParameter("age"));
		PrintWriter out=response.getWriter();
		out.println(name);
		out.println(email);
		out.println(dob);
		//out.println(gender);
		out.println(pass);
		ArrayList<String> form= new ArrayList<String>();
		form.add(name);
		form.add(email);
		form.add(dob);
		//form.add(gender);
		form.add(pass);
		System.out.println(form);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
