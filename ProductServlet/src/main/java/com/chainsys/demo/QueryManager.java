package com.chainsys.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.Session;

public class QueryManager {
	public static void insertData(User user, String empCode) throws SQLException, ClassNotFoundException {


		Connection   connection = DBManager.getConnection();
		String leaveInserting = "INSERT INTO Leave_report (emp_code, name, from_date, to_date, leave_type) VALUES (?, ?, ?, ?, ?)";
		PreparedStatement   preparedStatement = connection.prepareStatement(leaveInserting);

		preparedStatement.setString(1, empCode);
		preparedStatement.setString(2, user.getName());
		preparedStatement.setString(3, user.getFromDate());
		preparedStatement.setString(4, user.getToDate());
		preparedStatement.setString(5, user.getLeaveType());

		int rowCount = preparedStatement.executeUpdate();
		if (rowCount > 0) {
			System.out.println("Data inserted successfully.");
		} else {
			System.out.println("Data insertion failed.");
		}

	}

	public static ArrayList<User> getEmpData(String empCode) throws SQLException, ClassNotFoundException {
		Connection connection = DBManager.getConnection();
		ArrayList<User> userList = new ArrayList<>();
		String query = "SELECT * FROM Leave_report WHERE emp_code = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, empCode);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			User user = new User();
			user.setEmpCode(resultSet.getString("emp_code"));
			user.setName(resultSet.getString("name"));
			user.setFromDate(resultSet.getString("from_date"));
			user.setToDate(resultSet.getString("to_date"));
			user.setLeaveType(resultSet.getString("leave_type"));
			userList.add(user);
		} 
		return userList;
	}

	public static int getTotalLeaveDays(String empCode) throws SQLException, ClassNotFoundException {

		int totalLeaveDays = 0;
		User user = new User();
		Connection  connection = DBManager.getConnection();
		String query = "SELECT SUM(DATEDIFF(to_date, from_date)) AS total_days FROM Leave_report WHERE emp_code = ?";
		PreparedStatement  preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, empCode);
		ResultSet  resultSet = preparedStatement.executeQuery();

		while(resultSet.next()) {
			totalLeaveDays = resultSet.getInt("total_days");
			user.setTotal_days(totalLeaveDays);
		}

		return totalLeaveDays;

	}

	public static boolean insertTotalLeaveDays(String empCode, int totalLeaveDays) throws SQLException, ClassNotFoundException {
	    Connection connection = DBManager.getConnection();
	    String query = "UPDATE Leave_report SET leave_Count = ? WHERE emp_code = ?";
	    PreparedStatement preparedStatement = connection.prepareStatement(query);
	    
	    preparedStatement.setInt(1, totalLeaveDays);
	    preparedStatement.setString(2, empCode);
	        
	    int rowCount = preparedStatement.executeUpdate();
	    
	    if (rowCount > 0) {
	        System.out.println("Data inserted successfully.");
	        return true;
	    } else {
	        System.out.println("Data insertion failed.");
	        return false;
	    }
	}

}





