package com.rohan.SpringBootWeb.controller1;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// FIX: Added '1' to the package names so they match your folders exactly
import com.rohan.SpringBootWeb.model1.ProductModel;
import com.rohan.SpringBootWeb.service1.ProductService;

@RestController
public class ProductController {
    
    @Autowired
    ProductService service;
    
    @RequestMapping("/product")
    public List<ProductModel> getProduct() {
        return service.getProduct();
    }
}