package com.example.product_catalog_service.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product extends BaseModel {
    private String name;

    private String description;

    private String imageUrl;

    private Double price;

    private Cateogry category;

}
