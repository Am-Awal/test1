package com.tcs.department.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DBUtils {
	
	@PostConstruct
	public void init() {
		
	}
	
	@PreDestroy
	public void destroy() {
		
	}
	
	@Autowired
	DataSource dataSource;
	
	public Connection getConnection() {
		
		Connection connection = null;
		try {			
				connection = dataSource.getConnection();
				connection.setAutoCommit(false);
				return connection;
				
		} catch ( SQLException e) {
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
