package com.jun.order.service;

import java.util.List;

import com.jun.order.dto.CategoryDTO;

public interface CategoryService {
	public void insertCategory(CategoryDTO categoryDTO);
	public CategoryDTO selectOneCategory(CategoryDTO categoryDTO);
	public List<CategoryDTO> selectListCategory(CategoryDTO categoryDTO);
	public void deleteCategory(CategoryDTO categoryDTO);
	public void updateCategory(CategoryDTO categoryDTO);
}
