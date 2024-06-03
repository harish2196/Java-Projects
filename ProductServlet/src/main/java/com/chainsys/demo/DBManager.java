package com.chainsys.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

	  public static Connection getConnection() throws SQLException {
	        

	        String URL = "jdbc:mysql://localhost:3306/demo";
	        String USER = "root";
	        String PASSWORD = "root";

	        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
	        return connection;
	    
	    }
}
