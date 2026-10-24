package com.dmloperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertOperations {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // Register a Driver
		System.out.println("Starting to Register a Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Registered");
		
		//Establish a Connection
		String url="jdbc:mysql://localhost:3306/Jdbc";
		String userName="root";
		String password="root";
		
		Connection connection=DriverManager.getConnection(url, userName, password);
		System.out.println("Connection Established");
		
		//Prepare SQL Query
		String insertQuery="insert into students values(7,'manikanta',86);";
		
		
		//create a statement
		Statement statement=connection.createStatement();
		
		//execute statement
		statement.executeUpdate(insertQuery);
		
		//close the resources
		connection.close();
		statement.close();
		System.out.println("Inserted Data");
	}
}
