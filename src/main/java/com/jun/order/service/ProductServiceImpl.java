package com.jun.order.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.jun.order.dao.ProductDAO;
import com.jun.order.dto.ProductDTO;

@Service
public class ProductServiceImpl	implements ProductService {

	@Inject
	private ProductDAO productDAO;
	
	@Override
	public void insertProduct(ProductDTO productDTO) {
		// TODO Auto-generated method stub
		productDAO.insertProduct(productDTO);
	}

	@Override
	public ProductDTO selectOneProduct(ProductDTO productDTO) {
		// TODO Auto-generated method stub
		return productDAO.selectOneProduct(productDTO);
	}

	@Override
	public List<ProductDTO> selectListProduct(ProductDTO productDTO) {
		// TODO Auto-generated method stub
		return productDAO.selectListProduct(productDTO);
	}

	@Override
	public void deleteProduct(ProductDTO productDTO) {
		// TODO Auto-generated method stub
		productDAO.deleteProduct(productDTO);
	}

	@Override
	public void updateProduct(ProductDTO productDTO) {
		// TODO Auto-generated method stub
		productDAO.updateProduct(productDTO);
	}

}
