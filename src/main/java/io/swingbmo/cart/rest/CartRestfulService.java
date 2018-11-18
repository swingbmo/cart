package io.swingbmo.cart.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartRestfulService {

	@GetMapping("/test")
	public ReturnObj test() {
		ReturnObj o = new ReturnObj();
		o.setCode("000");
		o.setMsg("success");
		return o;
	}

	@GetMapping("/admin/hello")
	public String hello() {
		return "hello";

	}

	class ReturnObj {
		private String msg;
		private String code;

		public String getMsg() {
			return msg;
		}

		public void setMsg(String msg) {
			this.msg = msg;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}
	}
}
