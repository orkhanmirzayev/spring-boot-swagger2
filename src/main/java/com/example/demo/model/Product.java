package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Component
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6825884295044627239L;

	@Id
	@GeneratedValue
	private long id;
	private String product;
	private double price;
	
	
	public Product() {
		super();
	}
	public Product(String product, double price) {
		super();
		this.product = product;
		this.price = price;
	}
	@ApiModelProperty(value="Product Id", position=1,required=true)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@ApiModelProperty(value="Product Id", position=2,required=true)
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	@ApiModelProperty(value="Product Price", position=3,required=true)
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
