package io.swingbmo.cart.repo;

import io.swingbmo.cart.model.CartAdmin;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CartAdminRepository extends JpaRepository<CartAdmin, String>{

}
