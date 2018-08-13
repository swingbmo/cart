package io.swingbmo.cart.repo;

import io.swingbmo.cart.model.CartUser;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CartUserRepository extends JpaRepository<CartUser, String>{

}
