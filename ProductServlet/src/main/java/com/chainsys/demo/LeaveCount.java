package com.chainsys.demo;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LeaveCount
 */
@WebServlet("/LeaveCount")
public class LeaveCount extends HttpServlet {
	private static final long serialVersionUID = 1L;
	User user=new User();
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LeaveCount() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    HttpSession session = request.getSession();
	    String empCode = (String) session.getAttribute("emp_code");

	    String status = request.getParameter("action");
	    try {
	        if (status != null) {
	            QueryManager.updateLeaveStatus(empCode, status);
	        }
	    } catch (ClassNotFoundException | SQLException e) {
	        e.printStackTrace();
	      
	    }

	    try {
	        int totalLeaveDays = QueryManager.getTotalLeaveDays(empCode);
	        User user = new User(); 
	        user.setTotal_days(totalLeaveDays);
	        QueryManager.insertTotalLeaveDays(empCode, totalLeaveDays);
	        ArrayList<User> userList = QueryManager.getEmpLeaveCount(empCode);
	        request.setAttribute("userList", userList);
	        request.getRequestDispatcher("LeaveSummary.jsp").forward(request, response);
	    } catch (SQLException | ClassNotFoundException e) {
	        e.printStackTrace();
	       
	    }
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		String empCode = (String) session.getAttribute("emp_code");

		try {
			int totalLeaveDays = QueryManager.getTotalLeaveDays(empCode);	
			user.setTotal_days(totalLeaveDays);			
			QueryManager.insertTotalLeaveDays(empCode, totalLeaveDays);
			 ArrayList<User> userList = QueryManager.getEmpLeaveCount(empCode);
			
	            request.setAttribute("userList", userList);

			request.getRequestDispatcher("LeaveSummary.jsp").forward(request, response);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();

		}
	}

}
