package com.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Product;
import com.demo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping
	public String addProduct(@RequestBody Product product) {
		productService.addProduct(product);

		return "Product added succsessfully!!";
	}

	
	
	@GetMapping
	public Optional<Product> getProductById(@RequestParam int id) {
		return productService.getProductById(id);
	}
}
