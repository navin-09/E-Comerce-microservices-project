package com.example.product_catalog_service.services;

import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.product_catalog_service.dtos.FakeStoreDto;
import com.example.product_catalog_service.dtos.ProductDto;
import com.example.product_catalog_service.models.Cateogry;
import com.example.product_catalog_service.models.Product;

@Service
public class ProductService implements IProductService {

    private RestTemplateBuilder restTemplateBuilder;

    public ProductService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }

    @Override
    public List<Product> getAllProducts() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllProducts'");
    }

    @Override
    public Product getProduct(Long productId) {
        RestTemplate restTemplate = restTemplateBuilder.build();
        FakeStoreDto fakeStoreDto = restTemplate
                .getForEntity("https://fakestoreapi.com/products/{id}", FakeStoreDto.class, productId).getBody();
        return getProduct(fakeStoreDto);
    }

    public Product getProduct(FakeStoreDto fakeStoreDto) {
        Product product = new Product();
        Cateogry category = new Cateogry();
        category.setName(fakeStoreDto.getCategory());
        product.setId(fakeStoreDto.getId());
        product.setCategory(category);
        product.setDescription(fakeStoreDto.getDescription());
        product.setImageUrl(fakeStoreDto.getImage());
        product.setName(fakeStoreDto.getTitle());

        return product;

    }

    @Override
    public ProductDto createProduct(ProductDto productDto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createProduct'");
    }

}
