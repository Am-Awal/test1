package com.tcs.ecommerce;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tcs.ecommerce.config.DBConfig;
import com.tcs.ecommerce.model.Product;
import com.tcs.ecommerce.service.ProductService;

public class MainSpring {
	
	// (BTW) beans are nothing but Objects
	// will load all beans in early way minus the beans which are marked @lazy
	public static void main(String[] args) {
		
		System.out.println("Before object creating");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
		System.out.println("after context creation");
		
		ProductService productService = context.getBean(ProductService.class);
//		ProductService productService2 = context.getBean(ProductService.class);
//		
//		Product product = new Product(1, "laptop", "i5 10th gen", 1003.0f, "laptop");
//		String result = productService.createProduct(product);
		
//		String result1 = productService.createProduct(new Product(1, "laptop", "i5 10th gen", 1003.0f, "mac laptop"));
//		String result2 = productService.createProduct(new Product(2, "laptop", "i5 10th gen", 2003.0f, "laptop"));
//		String result3 = productService.createProduct(new Product(3, "laptop", "i5 10th gen", 3003.0f, "mac laptop"));
//		String result4 = productService.createProduct(new Product(4, "laptop", "i5 10th gen", 4003.0f, "laptop"));
//		String result5 = productService.createProduct(new Product(5, "laptop", "i5 10th gen", 5003.0f, "mac laptop"));
//		String result6 = productService.createProduct(new Product(6, "laptop", "i5 10th gen", 6003.0f, "laptop"));
//		String result7 = productService.createProduct(new Product(7, "laptop", "i5 10th gen", 7003.0f, "laptop"));
//		String result10 = productService.createProduct(new Product(10, "laptop", "i5 10th gen", 8003.0f, "laptop"));
//		String result9 = productService.createProduct(new Product(9, "laptop", "i5 10th gen", 9003.0f, "laptop"));
//		
//		System.out.println(result1);
//		System.out.println(result2);
//		System.out.println(result3);
//		System.out.println(result4);
//		System.out.println(result5);
//		System.out.println(result6);
//		System.out.println(result7);
//		System.out.println(result10);
//		System.out.println(result9);
//		
//		System.out.println(productService.equals(productService2));
//		System.out.println(productService == productService2);
		
		Optional<List<Product>> optional = productService.findByPriceGreaterThan(5000.0f);
		
		if(optional.isPresent()) {
			List<Product> products = optional.get();
			products.forEach(p-> {System.out.println(p);} );
			
		}else {
			System.out.println("problem");
		}
		
//		Optional<List<Product>> prods = productService.getProducts();
//		//prodIter = new Iterator
//				
//
//			System.out.println(prods);
//		
//		if(productService.getProductById(5).isPresent()) {
//			System.out.println("product exists ");
//			//productService.getProducts();
//			//productService.deleteproduct(5);
//		}else {
//			System.out.println("Not available");
//		}
		
		context.close();
	}


}