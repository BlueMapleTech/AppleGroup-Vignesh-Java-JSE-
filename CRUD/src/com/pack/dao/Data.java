package com.pack.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Data {
	private static final Connection conn = null;

	public  Connection getConnection() throws SQLException {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn= (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/crudoperation1", "root", "admin");

			return conn;
		
		} catch (ClassNotFoundException ex) {
			System.out.print(ex);
		}
		
			conn.close();
		return conn;

}
}
