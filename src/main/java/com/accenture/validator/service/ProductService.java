package com.accenture.validator.service;

import com.accenture.validator.entity.ProductRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<ProductRequest> findAll();

    ProductRequest getProductById(long id);

    void setProductName(ProductRequest productRequest);

    //product name validation
    void validateProduct (ProductRequest productRequest);

}
