package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Product;

public interface ProductDao extends CrudRepository<Product,Long> {

	
	Product findByProduct(String product);
	
}
