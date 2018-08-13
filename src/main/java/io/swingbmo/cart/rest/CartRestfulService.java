package io.swingbmo.cart.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartRestfulService {
	
	@GetMapping("/test")
	public String test() {
		return "hello spring boot!";
	}
}
