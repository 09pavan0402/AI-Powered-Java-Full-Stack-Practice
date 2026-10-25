package com;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.utils.DBConnections;

public class SignUp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your new user name");
		String userName=sc.nextLine();
		System.out.println("Enter password");
		String userPassword=sc.nextLine();
		
		Statement statement=DBConnections.getStatement();
		try {
			statement.executeUpdate("insert into users(user_name,user_password) values('"+userName+"','"+userPassword+"')");
			System.out.println("Congrats User SignedUp Successfully!!!");
		} catch (SQLException e) {
			System.out.println("Username already exists try new one");
		}
		sc.close();
	}
}
