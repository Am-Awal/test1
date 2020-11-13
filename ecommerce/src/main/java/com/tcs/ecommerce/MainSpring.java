package com.tcs.ecommerce;

import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tcs.ecommerce.config.DBConfig;

public class MainSpring {
	
	// (BTW) beans are nothing but Objects
	// will load all beans in early way minus the beans which are marked @lazy
	public static void main(String[] args) {
		
	AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(DBConfig.class);
//	
//	// DataSource.class used for implicit casting
//	DataSource dataSource= context.getBean("mysqlDataSource",DataSource.class);
//	// otherwise:
//	// DataSource dataSource2 = context.getBean("mysqlDataSource",DataSource);
//	
//	System.out.println(dataSource);
	context.close();

	}

}