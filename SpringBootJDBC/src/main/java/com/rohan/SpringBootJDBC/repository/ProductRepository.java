package com.rohan.SpringBootJDBC.repository;



import org.springframework.stereotype.Component;


public class ProductRepository {
	
	private int id;
	@Override
	public String toString() {
		return "ProductModel [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	private String name;
	private int price;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
