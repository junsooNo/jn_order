package com.jun.order;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jun.order.dto.CategoryDTO;

@Controller
public class MainController extends ObjectController {
	
	@RequestMapping(value="main")
	public String main(Model model, CategoryDTO categoryDTO) {
		categoryDTO.setUse_yn("Y");
		List<CategoryDTO> categoryList = categoryService.selectListCategory(categoryDTO);
		model.addAttribute("categoryList",categoryList);
		return "main"; 
	}
	
}
