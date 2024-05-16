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
	  ArrayList<FormData> formList = new ArrayList<>();
       
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
        String name = request.getParameter("username");
        String email = request.getParameter("email");
        String dob = request.getParameter("date");
        String pass = request.getParameter("password");

        FormData formData = new FormData(name, email, dob, pass);

      
        formList.add(formData);
        System.out.println(formList);

        request.setAttribute("formList", formList);

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
