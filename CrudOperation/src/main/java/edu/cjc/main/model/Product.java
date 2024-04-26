package edu.cjc.main.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.ManyToOne;


@Entity
public class Product {

@Id
private int productId;
private String productType;
private int productPrice;


@ManyToOne(cascade = CascadeType.DETACH.MERGE)
private Category category;


public int getProductId() {
	return productId;
}


public void setProductId(int productId) {
	this.productId = productId;
}


public String getProductType() {
	return productType;
}


public void setProductType(String productType) {
	this.productType = productType;
}


public int getProductPrice() {
	return productPrice;
}


public void setProductPrice(int productPrice) {
	this.productPrice = productPrice;
}


public Category getCategory() {
	return category;
}


public void setCategory(Category category) {
	this.category = category;
}




}
