package com.jun.order;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jun.order.service.ProductService;

@Controller
public class MainController {

	@Inject
	private ProductService productService;
	
	@RequestMapping(value="main")
	public String main(Model model) {
		
		return "main"; 
	}
	
}
