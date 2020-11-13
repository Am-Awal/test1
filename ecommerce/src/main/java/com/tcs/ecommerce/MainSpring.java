package com.tcs.ecommerce;

import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tcs.ecommerce.config.DBConfig;
import com.tcs.ecommerce.model.Product;
import com.tcs.ecommerce.service.ProductService;

public class MainSpring {
	
	// (BTW) beans are nothing but Objects
	// will load all beans in early way minus the beans which are marked @lazy
	public static void main(String[] args) {
		
		System.out.println("Before creating object: ");
	AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(DBConfig.class);
	
	
	// DataSource.class used for implicit casting
	
	ProductService productService = context.getBean(ProductService.class);
	ProductService productService2 = context.getBean(ProductService.class);
	Product product = new Product(1,"laptop","i5 10th gen",123.0f,"laptop");
	String result = productService.createProduct(product);
	
	System.out.println(result);
	System.out.println("After creating object: ");
	System.out.println(productService.equals(productService2));
	System.out.println(productService2.equals(productService));
	context.close();

	}

}