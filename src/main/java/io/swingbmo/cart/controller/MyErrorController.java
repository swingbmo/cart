package io.swingbmo.cart.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyErrorController implements ErrorController {

	@RequestMapping("/error")
	public String handleError(HttpServletRequest request, Model model) {
		Object status = request
				.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

		if (status != null) {
			Integer statusCode = Integer.valueOf(status.toString());

			if (statusCode == HttpStatus.NOT_FOUND.value()) {
				model.addAttribute("errorMsg", "PAGE NOT FOUND");
				model.addAttribute("title", "PAGE NOT FOUND");
			} else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
				model.addAttribute("errorMsg", "INTERNAL SERVER ERROR");
				model.addAttribute("title", "INTERNAL SERVER ERROR");
			}
			else {
				model.addAttribute("title", "OTHER ERROR");
				model.addAttribute("errorMsg", "OTHER ERROR");

			}
		}		
		
		return "errorPage";
	}

	@Override
	public String getErrorPath() {
		return "/error";
	}
}