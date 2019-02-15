package com.jun.order;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;

import com.jun.order.service.CategoryService;
import com.jun.order.service.ProductService;
import com.jun.order.util.JunUtilImpl;

@Controller
public class ObjectController {

	@Inject
	protected JunUtilImpl junUtil;
	@Inject
	protected Map<String,Object> map;
	@Inject
	protected ProductService productService;
	@Inject
	protected CategoryService categoryService;
}
  