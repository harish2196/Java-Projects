package com.chainsys.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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

}
