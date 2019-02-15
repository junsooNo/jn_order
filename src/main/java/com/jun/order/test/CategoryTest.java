package com.jun.order.test;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jun.order.dto.CategoryDTO;
import com.jun.order.service.CategoryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/mybatis-context.xml")
public class CategoryTest {
	
	@Inject
	private CategoryService categoryService;
	
	List<CategoryDTO> category;
	
	@Before
	public void setUp() {
		category = Arrays.asList(new CategoryDTO(1,"HOT",null,"Y"),new CategoryDTO(1,"ICE",null,"Y"),new CategoryDTO(1,"ADE",null,"Y"),
				new CategoryDTO(1,"BREAD",null,"Y"),new CategoryDTO(1,"DESERT",null,"Y"));
	}

	
	@Test
	public void cateTest() {
		for(CategoryDTO dto : category) {
			categoryService.insertCategory(dto);
		}
		List<CategoryDTO> cateList = categoryService.selectListCategory(new CategoryDTO());
		for(CategoryDTO dto : cateList) {
			System.out.println(dto.getCate_nm());
		}
	}
}
