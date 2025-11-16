package com.example.product_catalog_service.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.example.product_catalog_service.dtos.ProductDto;
import com.example.product_catalog_service.models.Product;
import com.example.product_catalog_service.services.IProductService;
import com.example.product_catalog_service.services.ProductService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/products")
public class ProductController {

    private IProductService productService;

    public ProductController(IProductService productService) {
        this.productService = productService;

    }

    @GetMapping
    public List<Product> getAllProducts() {
        return null;
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") Long productId) {
        return productService.getProduct(productId);
        
    }

    @PostMapping
    public ProductDto createProduct(@RequestBody ProductDto productDto) {
        System.out.println("*******===>" + productDto);
        return productDto;

    }

}
