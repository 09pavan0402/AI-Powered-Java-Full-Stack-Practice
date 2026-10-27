package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.utils.DBConnections;

public class BatchOperations {

	public static void main(String[] args) {
		Connection connection=DBConnections.createConnection();
		try {
			PreparedStatement ps=connection.prepareStatement("Insert into students values(?,?,?)");
			ps.setInt(1, 6);
			ps.setString(2, "Murali");
			ps.setInt(3, 24);
			
			ps.addBatch();
			
			ps.setInt(1, 7);
			ps.setString(2, "sudheer");
			ps.setInt(3, 44);
			
			ps.addBatch();
			
			ps.setInt(1, 8);
			ps.setString(2, "somya");
			ps.setInt(3, 54);
			
			ps.addBatch();
			ps.executeBatch();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
