package com.accenture.validator.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "product_request_counter")
public class ProductRequestCounter {

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "valid_counter")
    private double valid;

    @Column(name = "invalid_counter")
    private double invalid;

    public ProductRequestCounter(long id, double valid, double invalid) {
        this.id = id;
        this.valid = valid;
        this.invalid = invalid;
    }

}
