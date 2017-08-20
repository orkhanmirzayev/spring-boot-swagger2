package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductService {

	Product saveNewProduct(Product p);
	Product findByProduct(String product);
	List<Product> findAll();
}
