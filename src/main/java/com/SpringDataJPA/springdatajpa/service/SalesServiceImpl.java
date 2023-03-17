package com.SpringDataJPA.springdatajpa.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.SpringDataJPA.springdatajpa.data.entity.Sales;
import com.SpringDataJPA.springdatajpa.repository.SalesRepository;

@Service
public class SalesServiceImpl implements SalesService {
	private final SalesRepository salesRepository;
	

	public SalesServiceImpl(SalesRepository salesRepository) {
		this.salesRepository = salesRepository;
	}

	@Override
	public Sales getSale(int id) {
		Optional<Sales> sale = salesRepository.findById((long) id);
		return sale.orElse(null);
	}
}