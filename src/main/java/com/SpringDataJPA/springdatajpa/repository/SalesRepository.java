package com.SpringDataJPA.springdatajpa.repository;

import org.springframework.data.repository.CrudRepository;

import com.SpringDataJPA.springdatajpa.data.entity.Sales;


public interface SalesRepository extends CrudRepository<Sales, Long> {
}