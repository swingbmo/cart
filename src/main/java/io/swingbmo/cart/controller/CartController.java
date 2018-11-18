package io.swingbmo.cart.controller;

import io.swingbmo.cart.model.CartInfo;
import io.swingbmo.cart.model.Product;
import io.swingbmo.cart.repo.CartInfoRepository;
import io.swingbmo.cart.repo.ProductRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CartController {

	@Autowired
	CartInfoRepository cartInfoRepository;

	@Autowired
	ProductRepository productRepository;
	
	@GetMapping({ "/", "index" })
	public String index(Model model) {
		List<CartInfo> infos = cartInfoRepository.findByIsActive("Y");
		String title = null;
		if(CollectionUtils.isEmpty(infos))
		{
			title = "HOME";
		}
		else
		{
			title = infos.get(0).getTitle();
		}
		model.addAttribute("title", title);
		return "index";
	}

	@GetMapping({ "/product/{id}" })
	public String productDetail(Model model, @PathVariable String id) {
		
		Product product = productRepository.getOne(id);
		model.addAttribute("title", "Product - " + product.getTitle());
		model.addAttribute("product", product);
		return "product-detail";
	}

	@GetMapping("/product")
	public String product(Model model) {
		
		List<Product> products = productRepository.findAll();		
		model.addAttribute("products", products);
		model.addAttribute("title", "Products");
		return "product";
	}

}
