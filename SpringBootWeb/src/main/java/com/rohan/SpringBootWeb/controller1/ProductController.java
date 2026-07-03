package com.rohan.SpringBootWeb.controller1;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rohan.SpringBootWeb.model1.ProductModel;
import com.rohan.SpringBootWeb.service1.ProductService;

@RestController
public class ProductController {
    
    @Autowired
    private ProductService service;
    
    // 1. Fetch all products
    @GetMapping("/product")
    public List<ProductModel> getProduct() {
        return service.getProduct();
    }
    
    // 2. Fetch product by path variable id
    @GetMapping("/product/{id}")
    public ProductModel getProductById(@PathVariable int id) {
        return service.getProductById(id);
    }
    
    // 3. Add a brand new product
    @PostMapping("/product")
    public String addProduct(@RequestBody ProductModel dynamicProduct) {
        service.addProduct(dynamicProduct);
        return "Product added successfully!";
    }
    
 // 4. Update an existing product
    @PutMapping("/product")
    public String updateProduct(@RequestBody ProductModel dynamicProduct) {
        ProductModel updated = service.updateProduct(dynamicProduct);
        if (updated != null) {
            return "Product updated successfully!";
        } else {
            return "Product not found!";
        }
    }
    
    @DeleteMapping("/product/{id}")
    public String deleteProduct(@PathVariable int id) {
        boolean isDeleted = service.deleteProduct(id);
        if (isDeleted) {
            return "Product deleted successfully!";
        } else {
            return "Product not found!";
        }
    }
}