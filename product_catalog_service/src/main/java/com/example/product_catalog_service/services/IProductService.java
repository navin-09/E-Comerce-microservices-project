package com.example.product_catalog_service.services;

import java.util.List;

import com.example.product_catalog_service.dtos.ProductDto;
import com.example.product_catalog_service.models.Product;

public interface IProductService {

    public List<Product> getAllProducts();

    public Product getProduct(Long productId);

    public Product createProduct(ProductDto productDto);

}
