package com;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.utils.DBConnections;

public class Test {

	public static void main(String[] args) throws SQLException {
		Statement statement=DBConnections.getStatement();
		ResultSet rs=statement.executeQuery("select * from students");
		//meta data
		ResultSetMetaData metaData=rs.getMetaData();
//		System.out.println(metaData.getColumnCount());
//		System.out.println(metaData.getColumnName(1));
//		System.out.println(metaData.getColumnTypeName(1));
//		System.out.println(metaData.getTableName(1));
		
		System.out.println(metaData.getColumnName(1)+" "+metaData.getColumnName(2)+" "+metaData.getColumnName(3));
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"      "+rs.getString(2)+"      "+rs.getInt(3));
		}
	}
}
