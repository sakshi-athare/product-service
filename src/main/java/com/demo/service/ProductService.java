package com.demo.service;

import java.util.Optional;

import com.demo.entity.Product;

public interface ProductService {
	
	public Product addProduct(Product product);
	public Optional<Product> getProductById(int id);

}
