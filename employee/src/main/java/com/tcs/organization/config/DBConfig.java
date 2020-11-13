package com.tcs.organization.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:db.properties")
@ComponentScan("com.tcs.organization")
//@PropertySource("file://location")
public class DBConfig {
	
	@Autowired // this informs spring that here is where we need the env. obj.
	private Environment environment; // this is a bootstrap obj. already available with Spring

	// This annotation will create a singleton object for you.
	// either give been name
	//@Bean("mysqlDataSource")
	// or use default method name getMySQLDataSource in main class
	@Bean // this is a method-level annotation
	//@Lazy
	public BasicDataSource getMySQLDataSource() {
		
		//System.out.println("Hello from Abhi early loading");
		BasicDataSource dataSource = new BasicDataSource();
		
		dataSource.setDriverClassName(environment.getProperty("db.driver"));
		dataSource.setUrl(environment.getProperty("db.url"));
		dataSource.setUsername(environment.getProperty("db.username"));
		dataSource.setPassword(environment.getProperty("db.password"));
		return dataSource;
		
	}

}
