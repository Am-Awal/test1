package com.tcs.ecommerce.utlis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

// whenever we will come across the Utility classes then we should mark them with @Component
// singleton

@Component // this anno. is for utility type classes
public class DBUtils {

	public Connection getConnection() {
		
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
		public void closeConnection(Connection connection) {
			
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
