package io.swingbmo.cart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CartController {

	
	@GetMapping({ "/", "index" })
	public String index(Model model) {
		model.addAttribute("title", "attributeValue");
		return "index";
	}
	
	@GetMapping({ "/product/{catg}" })
	public String prodCatg1(Model model, @PathVariable String catg) {
		model.addAttribute("title", "Product - " + catg);
		model.addAttribute("catg", catg);
		return "catg";
	}
	

}
