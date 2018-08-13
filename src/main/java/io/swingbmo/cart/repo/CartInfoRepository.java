package io.swingbmo.cart.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import io.swingbmo.cart.model.CartInfo;

public interface CartInfoRepository extends JpaRepository<CartInfo, Integer>{

}
