package com.jun.order.dto;

public class CategoryDTO {
	private int cate_no;
	private String cate_nm;
	private String reg_date;
	private String use_yn;
	public CategoryDTO() {
		
	}
	public CategoryDTO(int cate_no, String cate_nm, String reg_date, String use_yn) {
		super();
		this.cate_no = cate_no;
		this.cate_nm = cate_nm;
		this.reg_date = reg_date;
		this.use_yn = use_yn;
	}
	public int getCate_no() {
		return cate_no;
	}
	public void setCate_no(int cate_no) {
		this.cate_no = cate_no;
	}
	public String getCate_nm() {
		return cate_nm;
	}
	public void setCate_nm(String cate_nm) {
		this.cate_nm = cate_nm;
	}
	public String getReg_date() {
		return reg_date;
	}
	public void setReg_date(String reg_date) {
		this.reg_date = reg_date;
	}
	public String getUse_yn() {
		return use_yn;
	}
	public void setUse_yn(String use_yn) {
		this.use_yn = use_yn;
	}
	
}
