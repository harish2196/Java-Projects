package com.chainsys.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Crud {

	public static void insertData(FormData formData) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection= ServletConnection.getConnection();

		String insertRating = "INSERT INTO servlet (name,email,phonenumber,active) VALUES (?,?,?,1)";
		PreparedStatement preparedStatement = connection.prepareStatement(insertRating);
		preparedStatement.setString(1, formData.getName());
		preparedStatement.setString(2, formData.getEmail());
		preparedStatement.setLong(3, formData.getPhonenumber());


		preparedStatement.executeUpdate();
		System.out.println("Data inserted successfully.");
	} 

	public static ArrayList<FormData> getAllData() throws SQLException, ClassNotFoundException {
		Connection connection = ServletConnection.getConnection();
		String viewQuery = "SELECT id, name, email, phonenumber FROM servlet WHERE active ='1'ORDER BY name ASC";
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
		String query = "UPDATE servlet SET active='0' WHERE	id=?";
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

	public ArrayList<FormData> searchProduct(String str) throws ClassNotFoundException, SQLException {
		ArrayList<FormData> formData = new ArrayList<>();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = ServletConnection.getConnection();
		String query = "SELECT name, email, phonenumber FROM servlet WHERE name LIKE ?";
		PreparedStatement prepareStatement = connection.prepareStatement(query);
		prepareStatement.setString(1, str);
		ResultSet resultSet = prepareStatement.executeQuery();
		while (resultSet.next()) {
			FormData data = new FormData();

			data.setName(resultSet.getString("name"));
			data.setEmail(resultSet.getString("email"));
			data.setPhonenumber(resultSet.getLong("phonenumber"));
			formData.add(data);
		}
		return formData;
	}

	public ArrayList<FormData> filterPrice(double minPrice,double maxPrice) throws ClassNotFoundException, SQLException {
		ArrayList<FormData> formData = new ArrayList<>();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = ServletConnection.getConnection();
		String filterPrice = "SELECT name, email, phonenumber FROM servlet WHERE phonenumber BETWEEN ? AND ?";
		PreparedStatement statement = connection.prepareStatement(filterPrice);
		statement.setDouble(1, minPrice);
		statement.setDouble(2, maxPrice);

		ResultSet   resultSet = statement.executeQuery();
		while (resultSet.next()) {
			FormData data = new FormData();
			data.setName(resultSet.getString("name"));
			data.setEmail(resultSet.getString("email"));
			data.setPhonenumber(resultSet.getLong("phonenumber"));
			formData.add(data);
		}
		return formData;
	}

	

}