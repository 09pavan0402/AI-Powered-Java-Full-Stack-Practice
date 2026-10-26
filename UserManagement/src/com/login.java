package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.utils.DBConnections;

public class login {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your user name");
		String userName=sc.nextLine();
		System.out.println("Enter password");
		String userPassword=sc.nextLine();
		
		Connection connection=DBConnections.createConnection();
		
		try {
			PreparedStatement prepareStatement=connection.prepareStatement("select * from users where user_name=? and user_password =?");
			prepareStatement.setString(1, userName);
			prepareStatement.setString(2, userPassword);
			ResultSet rs=prepareStatement.executeQuery();
			if(rs.next()) {
				System.out.println("You're login");
			}else {
				System.out.println("Invalid credtials");
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}

