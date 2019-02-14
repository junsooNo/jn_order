package com.jun.order.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.jun.order.dto.ProductDTO;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Inject
	private SqlSession sqlSession;
	
	private String namespace = "com.jun.order.dao.ProductDAO.";
	
	@Override
	public void insertProduct(ProductDTO productDTO) {
		// TODO Auto-generated method stub
		sqlSession.insert(namespace+"insertProduct",productDTO);
	}

	@Override
	public ProductDTO selectOneProduct(ProductDTO productDTO) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace+"selectOneProduct",productDTO);
	}

	@Override
	public List<ProductDTO> selectListProduct(ProductDTO productDTO) {
		// TODO Auto-generated method stub
		return sqlSession.selectList(namespace+"selectListProduct",productDTO);
	}

	@Override
	public void deleteProduct(ProductDTO productDTO) {
		// TODO Auto-generated method stub
		sqlSession.delete(namespace+"deleteProduct",productDTO);
	}

	@Override
	public void updateProduct(ProductDTO productDTO) {
		// TODO Auto-generated method stub
		sqlSession.update(namespace+"updateProduct",productDTO);
	}

}
