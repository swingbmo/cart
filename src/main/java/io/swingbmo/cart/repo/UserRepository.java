package io.swingbmo.cart.repo;

import io.swingbmo.cart.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String>{

}
