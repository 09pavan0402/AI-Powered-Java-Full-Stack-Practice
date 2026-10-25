package com.dqloperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectOperations {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/Jdbc";
			String userName="root";
			String password="root";
		    Connection connection=DriverManager.getConnection(url, userName, password);
		    
		    String selectQuery= "select * from students";
		   
		    Statement statement =connection.createStatement();
		    
		    ResultSet rs =statement.executeQuery(selectQuery);//executeQuery() used at DQL Operations
		    while(rs.next()) {
		    	int id=rs.getInt(1);
		    	String name=rs.getString(2);
		    	int marks=rs.getInt(3);
		    	
		    	System.out.println(id+" "+name+" "+marks);
		    }
		    
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
