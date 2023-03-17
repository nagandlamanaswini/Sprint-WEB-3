package com.SpringDataJPA.springdatajpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.SpringDataJPA.springdatajpa.data.entity.Products;

public interface ProductsRepository extends CrudRepository<Products, Long> {
}
