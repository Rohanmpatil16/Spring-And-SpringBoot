package com.rohan.SpringBootJDBC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rohan.SpringBootJDBC.repository.ProductRepository;
import com.rohan.SpringBootJDBC.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
	@PostMapping("/add")
	
	public String addProduct(@RequestBody ProductRepository product)
	{
		return service.addProduct(product);
	}
	
	 @GetMapping("/products")
	 public List<ProductRepository> getProducts() {

	        return service.getProducts();
	    }
	
}
