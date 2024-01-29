package com.accenture.validator.repository;

import com.accenture.validator.entity.ProductRequest;
import com.accenture.validator.service.ProductService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductRequest, Long> {
    List<ProductRequest> findAll();
}
