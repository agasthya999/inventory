package com.ennea.inventory.model;

import java.util.Date;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
 private String productName;
 private String code;
 private int stock;
 private String company;
 private String batch;
 private Date expiray;
 private String supllier;
 
 public Product(long id,String productName, String code, int stock, String company, String batch, Date expiray,
		String supllier) {
	super();
	this.id=id;
	this.productName = productName;
	this.code = code;
	this.stock = stock;
	this.company = company;
	this.batch = batch;
	this.expiray = expiray;
	this.supllier = supllier;
}
 
public Product() {
	super();
	// TODO Auto-generated constructor stub
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}

public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getBatch() {
	return batch;
}
public void setBatch(String batch) {
	this.batch = batch;
}
public Date getExpiray() {
	return expiray;
}
public void setExpiray(Date expiray) {
	this.expiray = expiray;
}
public String getSupllier() {
	return supllier;
}
public void setSupllier(String supllier) {
	this.supllier = supllier;
}
 
 
 
 
}
