package com.rohan.SpringBootJDBC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.rohan.SpringBootJDBC.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	 private JdbcTemplate temp;
	
	public String addProduct(ProductRepository product)
	{
		String sql="Insert into product(id,name,price) values(?,?,?)" ;
		
		temp.update(sql,product.getId(),product.getName(),product.getPrice());
		
		return "product added succesfully";
		
	}
	
	
}
