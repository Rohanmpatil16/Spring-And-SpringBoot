package com.rohan.SpringBootWeb.service1;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.stereotype.Service;
import com.rohan.SpringBootWeb.model1.ProductModel;

@Service
public class ProductService {
    
    // Initialized inside an ArrayList wrapper so it's mutable (can add items later)
    private List<ProductModel> p = new ArrayList<>(Arrays.asList(
            new ProductModel(101, "Iphone", 5000),
            new ProductModel(102, "Samsung", 1000),
            new ProductModel(103, "Apple", 3000),
            new ProductModel(104, "Vivo", 4000)
    ));
    
    // GET All Products
    public List<ProductModel> getProduct() {
        return p;
    }
	
    // GET Product by ID using Java Streams
    public ProductModel getProductById(int id) {
        return p.stream()
                .filter(product -> product.getId() == id)
                .findFirst()
                .orElse(null);
    }
	
    // POST (Add) a New Product
    public void addProduct(ProductModel newProduct) {
        p.add(newProduct);
    }
    
 // PUT - Update an existing product
    public ProductModel updateProduct(ProductModel updatedProduct) {
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i).getId() == updatedProduct.getId()) {
                p.set(i, updatedProduct); // Replace the old product with the updated one
                return updatedProduct;
            }
        }
        return null; // Return null if the product ID wasn't found
    }
    
    public boolean deleteProduct(int id) {
        // removeIf returns true if an element was removed
        return p.removeIf(product -> product.getId() == id);
    }
}
