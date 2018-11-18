package io.swingbmo.cart.repo;

import io.swingbmo.cart.model.CartInfo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CartInfoRepository extends JpaRepository<CartInfo, Integer>{

	List<CartInfo> findByIsActive(String isActive);
}
