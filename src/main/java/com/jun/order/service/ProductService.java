package com.jun.order.service;

import java.util.List;

import com.jun.order.dto.ProductDTO;

public interface ProductService {
	public void insertProduct(ProductDTO productDTO);
	public ProductDTO selectOneProduct(ProductDTO productDTO);
	public List<ProductDTO> selectListProduct(ProductDTO productDTO);
	public void deleteProduct(ProductDTO productDTO);
	public void updateProduct(ProductDTO productDTO);
}
