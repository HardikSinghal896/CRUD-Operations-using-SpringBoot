package com.javarechie.springbootcrudexample2.repository;

import com.javarechie.springbootcrudexample2.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

    Product findByName(String name);
}
