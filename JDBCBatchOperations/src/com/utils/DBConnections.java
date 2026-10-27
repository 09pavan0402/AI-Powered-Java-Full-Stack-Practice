package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.constants.DBConstants;

public class DBConnections {
	
	public static Connection createConnection() {
		Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                DBConstants.DB_URL,
                DBConstants.DB_USER_NAME,
                DBConstants.DB_PASSWORD
            );
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
	}
}