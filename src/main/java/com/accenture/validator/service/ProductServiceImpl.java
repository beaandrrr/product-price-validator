package com.accenture.validator.service;

import com.accenture.validator.entity.ProductRequest;
import com.accenture.validator.exception.InvalidProductNameException;
import com.accenture.validator.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;


// all validations
@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepo;

    @Override
    public List<ProductRequest> findAll() {
        return productRepo.findAll();
    }

    @Override
    public ProductRequest getProductById(long id) {
        return productRepo.findById(id).orElse(null);
    }
    @Override
    public void setProductName(ProductRequest productRequest) {
        productRepo.save(productRequest);
    }

    @Override
    public void validateProduct(ProductRequest productRequest) {
        productRequest.getProductName();
    }


}
