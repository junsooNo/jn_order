package com.jun.order.dto;

public class ProductDTO {
	private int product_no;
	private String product_nm;
	private int product_price;
	private String product_price_str;
	private String reg_date;
	private String product_image;
	private int cate_no;

	public ProductDTO() {

	}
	public ProductDTO(int product_no, String product_nm, int product_price, String product_price_str, String reg_date,
			String product_image, int cate_no) {
		super();
		this.product_no = product_no;
		this.product_nm = product_nm;
		this.product_price = product_price;
		this.product_price_str = product_price_str;
		this.reg_date = reg_date;
		this.product_image = product_image;
		this.cate_no = cate_no;
	}
	public int getCate_no() {
		return cate_no;
	}
	public void setCate_no(int cate_no) {
		this.cate_no = cate_no;
	}
	public String getProduct_image() {
		return product_image;
	}

	public void setProduct_image(String product_image) {
		this.product_image = product_image;
	}

	public int getProduct_no() {
		return product_no;
	}

	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}

	public String getProduct_nm() {
		return product_nm;
	}

	public void setProduct_nm(String product_nm) {
		this.product_nm = product_nm;
	}

	public int getProduct_price() {
		return product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}

	public String getProduct_price_str() {
		return product_price_str;
	}

	public void setProduct_price_str(String product_price_str) {
		this.product_price_str = product_price_str;
	}

	public String getReg_date() {
		return reg_date;
	}

	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}

}
