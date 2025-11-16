package com.example.product_catalog_service.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreDto {
    private Long id;

    private String title;

    private Double price;

    private String description;

    private String category;

    private String image;

    private RatingDto rating;

}
