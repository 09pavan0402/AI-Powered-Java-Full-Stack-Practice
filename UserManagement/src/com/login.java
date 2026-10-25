package com;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.utils.DBConnections;

public class login {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your user name");
		String userName=sc.nextLine();
		System.out.println("Enter password");
		String userPassword=sc.nextLine();
		
		Statement statement=DBConnections.getStatement();
		try {
			ResultSet rs=statement.executeQuery("select * from users where user_name='"+userName+"' and user_password ='"+userPassword+"'");
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
