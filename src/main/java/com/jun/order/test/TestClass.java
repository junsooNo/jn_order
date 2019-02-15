package com.jun.order.test;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jun.order.dto.ProductDTO;
import com.jun.order.service.ProductService;
import com.jun.order.util.JunUtilImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/mybatis-context.xml")
public class TestClass {

	@Inject
	private ProductService productService;
	
	private List<ProductDTO> product;
	
	@Inject
	private JunUtilImpl junUtil;
	
	
	@Before
	public void setUp() {
		product = Arrays.asList(new ProductDTO(1,"아이스 아메리카노",3000,null,null,"ice_americano.png",3),new ProductDTO(1,"카페라떼",4000,null,null,"cafe_latte.jpg",2),
				new ProductDTO(1,"녹차라떼",4000,null,null,"green_tea_latte.jpg",2),new ProductDTO(1,"에스프레소",2500,null,null,"espresso.jpg",2));
	}
	
	@Test
	public void crudTest() {
		//productService.deleteProduct(new ProductDTO());
		for(ProductDTO dto : product) {
			productService.insertProduct(dto);
		}
		ProductDTO productDTO = new ProductDTO();
		productDTO.setProduct_nm("아이스 아메리카노");
		List<ProductDTO> list = productService.selectListProduct(productDTO);
		for(ProductDTO dto : list) {
			System.out.println(dto.getProduct_image());
		}
	}
}
