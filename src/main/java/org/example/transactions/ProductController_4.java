package org.example.transactions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController_4 {

    @GetMapping("/products/{id}")
    public Product_5 getProductById(@PathVariable String id) {
        // Logic to fetch product by id
        // If product not found, throw ProductNotFoundException

        //Long longId = getProductId();
        //id= String.valueOf(Long.valueOf(id));
        throw new ProductNotFoundException_1("Product not found with id: " + id);
    }
    Long getProductId(){
        Product_5 product= new Product_5();
        product.setId((long) 1.0);
         return product.getId();
    }
}
