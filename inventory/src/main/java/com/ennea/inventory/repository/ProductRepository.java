package com.ennea.inventory.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ennea.inventory.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

	List<Product> findBysupllier(String sup);

	List<Product> findBycompany(String sup);

	
}
