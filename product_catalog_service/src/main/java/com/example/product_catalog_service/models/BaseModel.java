package com.example.product_catalog_service.models;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BaseModel {
    private Long id;

    private Date created_by;

    private Date updated_by;

    private Status status;
}
