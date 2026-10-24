package com.dmloperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateOperations {

	public static void main(String[] args) {
		
		try {
			//Register a Driver
			System.out.println("Starting to Register a Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Registered");
			
			//Establish connection
			String url="jdbc:mysql://localhost:3306/Jdbc";
			String userName="root";
			String password="root";
			Connection connection=DriverManager.getConnection(url, userName, password);
			System.out.println("Connection Established");
			
			//prepare sql query
			String updateQuery=" update students set marks=99 where stu_id=4;";
			
			//create statement
			Statement statement=connection.createStatement();
			
			//execute statement
			statement.execute(updateQuery);
			
			connection.close();
			statement.close();
			
			System.out.println("Updated Data");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
