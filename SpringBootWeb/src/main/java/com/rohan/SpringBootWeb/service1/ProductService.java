package com.rohan.SpringBootWeb.service1;

import java.util.List;

import java.util.Arrays; // FIX 1: Added import
import org.springframework.stereotype.Service;
import com.rohan.SpringBootWeb.model1.ProductModel;

@Service
public class ProductService {
    // FIX 2: Removed the trailing comma after the Samsung object
    List<ProductModel> p = Arrays.asList(
            new ProductModel(101, "Iphone", 5000),
            new ProductModel(102, "Samsung", 1000),
            new ProductModel(103,"Apple",3000),
            new ProductModel(103,"Vivo",4000)
    ); 
    
    public List<ProductModel> getProduct() {
        return p;
    }
}