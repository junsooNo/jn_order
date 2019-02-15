package com.jun.order.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jun.order.dto.CategoryDTO;

@Repository
public class CategoryDAOImpl implements CategoryDAO {

	@Inject
	private SqlSession sqlSession;
	
	private String namespace = "com.jun.order.dao.CategoryDAO.";
	
	@Override
	public void insertCategory(CategoryDTO categoryDTO) {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace+"insertCategory",categoryDTO);
	}

	@Override
	public CategoryDTO selectOneCategory(CategoryDTO categoryDTO) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace+"selectOneCategory",categoryDTO);

	}

	@Override
	public List<CategoryDTO> selectListCategory(CategoryDTO categoryDTO) {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+"selectListCategory",categoryDTO);
	}

	@Override
	public void deleteCategory(CategoryDTO categoryDTO) {
		// TODO Auto-generated method stub
		sqlSession.delete(namespace+"deleteCategory",categoryDTO);
	}

	@Override
	public void updateCategory(CategoryDTO categoryDTO) {
		// TODO Auto-generated method stub
		sqlSession.update(namespace+"updateCategory",categoryDTO);
	}

}
