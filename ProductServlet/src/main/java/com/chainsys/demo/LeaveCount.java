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

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LeaveCount() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user=new User();
		HttpSession session = request.getSession();
		String empCode = (String) session.getAttribute("emp_code");

		try {
			int totalLeaveDays = QueryManager.getTotalLeaveDays(empCode);	
			user.setTotal_days(totalLeaveDays);
			//request.setAttribute("totalLeaveDays", totalLeaveDays);
			QueryManager.insertTotalLeaveDays(empCode, totalLeaveDays);
			 ArrayList<User> userList = QueryManager.getEmpLeaveCount(empCode);
			
	            request.setAttribute("userList", userList);

			request.getRequestDispatcher("LeaveSummary.jsp").forward(request, response);
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();

		}
	}

}
