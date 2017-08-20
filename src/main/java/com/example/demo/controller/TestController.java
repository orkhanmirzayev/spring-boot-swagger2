package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.*;


@RestController
@Api(value="TestController",description="Product Operations")
public class TestController {

	@Autowired
	ProductService productService;
	
	@GetMapping(value="/find-all",produces= MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value="Will show All Products",nickname="allUsers")
	@ApiResponses(value={
			@ApiResponse(code=200,message="Successfull response send"),
			@ApiResponse(code=404,message="Products Not Found")
			})
	public List<Product> findAll(){
		
		return productService.findAll();
	}
	
	@PostMapping(value="/add-new-product",produces= MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses(value={
			@ApiResponse(code=200,message="Successfull Product Added"),
			@ApiResponse(code=400,message="You included worng type argument!!")
			})
	@ApiOperation(value="Will save a new product",nickname="addNewProduct")
	public Product saveNewProduct(@ApiParam(name="product", value="String to the application",required=true) @RequestParam("product") String product,
		                         @ApiParam(name="price", value="Double to the application",required=true) @RequestParam("price") Double price){
		
		return productService.saveNewProduct(new Product(product,price));
	}
	
}
