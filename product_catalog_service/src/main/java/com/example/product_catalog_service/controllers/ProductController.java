package com.example.product_catalog_service.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.product_catalog_service.dtos.ProductDto;
import com.example.product_catalog_service.models.Product;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping
    public List<Product> getAllProducts() {
        return null;
    }

    @GetMapping("/{id}")
    public Product getMethodName(@PathVariable("id") Long productId) {
        Product product = new Product();
        product.setId(productId);
        product.setName("TV5");
        product.setPrice(1000.0);

        return product;
    }

    @PostMapping
    public ProductDto createProduct(@RequestBody ProductDto productDto) {
        System.out.println("*******===>"+productDto);
        return productDto;

    }

}
