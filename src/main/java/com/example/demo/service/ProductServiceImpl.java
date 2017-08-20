package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ProductDao;
import com.example.demo.model.Product;
import com.google.common.collect.Lists;

@Service
public class ProductServiceImpl implements ProductService {

	
	@Autowired
	ProductDao productDao;
	
	@Override
	@Transactional
	public Product saveNewProduct(Product p) {
		return productDao.save(p);
	}

	@Override
	public Product findByProduct(String product) {
		return productDao.findByProduct(product);
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return Lists.newArrayList(productDao.findAll());
	}

}
