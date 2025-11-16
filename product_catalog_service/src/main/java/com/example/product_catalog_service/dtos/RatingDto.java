package com.example.product_catalog_service.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RatingDto {
    private Double rate;
    private Long count;
    
}
