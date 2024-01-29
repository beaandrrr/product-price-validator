package com.accenture.validator.controller;

import com.accenture.validator.entity.ProductRequest;
import com.accenture.validator.repository.ProductRepository;
import com.accenture.validator.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController {
    private final ProductRepository productRepo;
    private final ProductService productService;

    @Autowired
    public APIController(ProductService productService, ProductRepository productRepo) {
        this.productRepo = productRepo;
        this.productService = productService;
    }

    @PostMapping("/createRequest")
    public ProductRequest addProduct (@RequestBody ProductRequest productRequest) {
        return productRepo.save(productRequest);
    }


}
