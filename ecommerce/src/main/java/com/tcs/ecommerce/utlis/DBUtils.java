package com.tcs.ecommerce.utlis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class DBUtils {
	
	
	@Autowired
	public static Environment environment;
	public static Connection getConnection() {
		
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
				connection = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/TCS?useSSL=false", "root", "MYSQL123$");
				connection.setAutoCommit(false);
				return connection;
				
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
		public static void closeConnection(Connection connection) {
			
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
