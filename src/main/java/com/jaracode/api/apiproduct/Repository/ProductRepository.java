package com.jaracode.api.apiproduct.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaracode.api.apiproduct.Entities.Product;

public interface ProductRepository extends JpaRepository <Product, Long> {

}
