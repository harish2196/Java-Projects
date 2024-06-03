package com.chainsys.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
