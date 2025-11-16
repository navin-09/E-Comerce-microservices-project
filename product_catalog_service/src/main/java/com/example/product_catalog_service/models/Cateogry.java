package com.example.product_catalog_service.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cateogry extends BaseModel{
    private String name;

    private String Description;
    
    private List<Product> products;
    
    
}
