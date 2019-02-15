package com.jun.order.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.jun.order.dao.CategoryDAO;
import com.jun.order.dto.CategoryDTO;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Inject
	private CategoryDAO categoryDAO;
	
	@Override
	public void insertCategory(CategoryDTO categoryDTO) {
		// TODO Auto-generated method stub
		categoryDAO.insertCategory(categoryDTO);
	}

	@Override
	public CategoryDTO selectOneCategory(CategoryDTO categoryDTO) {
		// TODO Auto-generated method stub
		return categoryDAO.selectOneCategory(categoryDTO);
	}

	@Override
	public List<CategoryDTO> selectListCategory(CategoryDTO categoryDTO) {
		// TODO Auto-generated method stub
		return categoryDAO.selectListCategory(categoryDTO);
	}

	@Override
	public void deleteCategory(CategoryDTO categoryDTO) {
		// TODO Auto-generated method stub
		categoryDAO.deleteCategory(categoryDTO);
	}

	@Override
	public void updateCategory(CategoryDTO categoryDTO) {
		// TODO Auto-generated method stub
		categoryDAO.updateCategory(categoryDTO);
	}

}
