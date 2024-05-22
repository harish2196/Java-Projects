package com.chainsys.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Crud {

	public static void insertData(FormData formData) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection= ServletConnection.getConnection();

		String insertRating = "INSERT INTO servlet (name,email,phonenumber) VALUES (?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(insertRating);
		preparedStatement.setString(1, formData.getName());
		preparedStatement.setString(2, formData.getEmail());
		preparedStatement.setLong(3, formData.getPhonenumber());


		preparedStatement.executeUpdate();
		System.out.println("Data inserted successfully.");
	} 

	public static ArrayList<FormData> getAllData() throws SQLException, ClassNotFoundException {
		Connection connection = ServletConnection.getConnection();
		String viewQuery = "SELECT id, name, email, phonenumber FROM servlet";
		PreparedStatement preparedStatement = connection.prepareStatement(viewQuery);
		ResultSet resultSet = preparedStatement.executeQuery();

		ArrayList<FormData> formDataList = new ArrayList<>();

		while (resultSet.next()) {
			FormData formData = new FormData();
			formData.setId(resultSet.getInt("id"));
			formData.setName(resultSet.getString("name"));
			formData.setEmail(resultSet.getString("email"));
			formData.setPhonenumber(resultSet.getLong("phonenumber"));
			formDataList.add(formData);
		}

		connection.close();
		return formDataList;
	}

	public static ArrayList<FormData> retrieveData(int id) throws SQLException {
		Connection connection = ServletConnection.getConnection();
		String query = "SELECT id, name, email, phonenumber FROM servlet WHERE id=?";
		PreparedStatement statement = connection.prepareStatement(query);
		statement.setInt(1, id);
		ResultSet resultSet = statement.executeQuery();

		ArrayList<FormData> formDataList = new ArrayList<>();

		while (resultSet.next()) {
			FormData formData = new FormData();
			formData.setName(resultSet.getString("name"));
			formData.setEmail(resultSet.getString("email"));
			formData.setPhonenumber(resultSet.getLong("phonenumber"));
			formDataList.add(formData);
		}

		return formDataList;
	}

	public static ArrayList<FormData> deleteData(int id) throws SQLException {
		Connection connection = ServletConnection.getConnection();

		ArrayList<FormData> deletedFormDataList = new ArrayList<>();
		String query = "DELETE FROM servlet WHERE id=?";
		PreparedStatement  statement = connection.prepareStatement(query);
		statement.setInt(1, id);
		int rowsAffected = statement.executeUpdate();

		if (rowsAffected > 0) {	   
			deletedFormDataList.add(new FormData()); 
		}

		return deletedFormDataList;
	}

	public static boolean updateData(FormData formData) throws SQLException {
		boolean success = false;
		Connection connection = ServletConnection.getConnection();
			String query = "UPDATE servlet SET name=?, email=?, phonenumber=? WHERE id=?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, formData.getName());
			statement.setString(2, formData.getEmail());
			statement.setLong(3, formData.getPhonenumber());
			statement.setInt(4, formData.getId());

			int rowsUpdated = statement.executeUpdate();
			success = (rowsUpdated > 0);

		return success;
	}


}