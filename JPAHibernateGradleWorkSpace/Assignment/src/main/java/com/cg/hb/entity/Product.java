package com.cg.hb.entity;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="product_id")
	private Long productId;
	@Column(name="name")
	private String name;
	@Column(name="category")
	private String category;
	@Column(name="unit_rate")
	private Double unitRate;
	public Product() {
		//default
	}
	public Long getProductId() {
		return productId;
	}
	
	public Product(Long productId,String name,String category,Double unitRate) {
		super();
		this.productId=productId;
		this.name=name;
		this.category=category;
		this.unitRate=unitRate;
	}
	
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getUnitRate() {
		return unitRate;
	}
	public void setUnitRate(Double unitRate) {
		this.unitRate = unitRate;
	}
	@Override
	public String toString() {
		return String.format("productId=%s, name=%s, category=%s, unitRate=%s", productId, name, category,unitRate);
	}
	
}
