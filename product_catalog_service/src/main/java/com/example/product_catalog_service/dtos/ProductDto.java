package com.example.product_catalog_service.dtos;

import com.example.product_catalog_service.models.Cateogry;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
    private String name;

    private String description;

    private String imageUrl;

    private Double price;

    private Cateogry category;

}