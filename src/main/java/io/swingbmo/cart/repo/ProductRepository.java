package io.swingbmo.cart.repo;

import io.swingbmo.cart.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String>{

}
