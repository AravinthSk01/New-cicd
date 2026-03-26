package com.app.rvz.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Productsale {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productid;
	private String productname;
	private int price;
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(Integer productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public Productsale() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Productsale(Integer productid, String productname, int price) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Productsale [productid=" + productid + ", productname=" + productname + ", price=" + price + "]";
	}
	

}
