package com.dmloperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteOperations {

	public static void main(String[] args) {
		try {
			//Rigister a Driver
			System.out.println("Starting to Register a Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Registered");
			
			//Establish Connection
			String url="jdbc:mysql://localhost:3306/Jdbc";
			String userName="root";
			String password="root";
			Connection connection=DriverManager.getConnection(url, userName, password);
			System.out.println("Connection Established");
			
			//prepare sql query
			String deleteQuery="delete from students where stu_id=7";
			
			//create statement
			Statement statement=connection.createStatement();
			
		    //execute statement
		    statement.execute(deleteQuery);
			
		    statement.close();
		    connection.close();
		    System.out.println("Deleted Data");
		    
		}catch(ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
