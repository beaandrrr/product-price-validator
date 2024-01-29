package com.accenture.validator.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "product_request")
public class ProductRequest {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @NotNull
    @Column(name = "product_name")
    private String productName;

    @Column(name = "suggested_retail_price")
    private double suggestedRetail;

    @Column(name = "target_sales_price")
    private double targetSales;

    public ProductRequest(long id, String productName, double suggestedRetail, double targetSales) {
        this.id = id;
        this.productName = productName;
        this.suggestedRetail = suggestedRetail;
        this.targetSales = targetSales;
    }
}
