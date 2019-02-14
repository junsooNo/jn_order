package com.jun.order.dao;

import java.util.List;

import com.jun.order.dto.ProductDTO;

public interface ProductDAO {
	public void insertProduct(ProductDTO productDTO);
	public ProductDTO selectOneProduct(ProductDTO productDTO);
	public List<ProductDTO> selectListProduct(ProductDTO productDTO);
	public void deleteProduct(ProductDTO productDTO);
	public void updateProduct(ProductDTO productDTO);
}
