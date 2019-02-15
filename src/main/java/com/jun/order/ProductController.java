package com.jun.order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jun.order.dto.ProductDTO;

@Controller
public class ProductController extends ObjectController {

	@RequestMapping(value="selectListProduct",produces="application/text; charset=utf-8")
	@ResponseBody
	public String selectListProduct(ProductDTO productDTO) {
		Map<String,Object> map = new HashMap<String,Object>();
		List<ProductDTO> productList = productService.selectListProduct(productDTO);
		map.put("productList", productList);
		return junUtil.getJson(map);
	}
	
	@RequestMapping(value="selectOneProduct",produces="application/text; charset=utf-8")
	@ResponseBody
	public String selectOneProduct(ProductDTO productDTO) {
		Map<String,Object> map = new HashMap<String,Object>();
		ProductDTO productInfo = productService.selectOneProduct(productDTO);
		map.put("productInfo",productInfo);
		return junUtil.getJson(map);
	}
	
}
