package com.tcs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.ecommerce.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	List<Product> findByCategory(String catName);
	List<Product> findByPriceGreaterThan(float priceValue);
	List<Product> findByCategoryAndPriceLessThan(String catName, float price);
	
	//("a%")==>> all prods that start with "a"
	List<Product> findByProductNameLike(String productName);

}
