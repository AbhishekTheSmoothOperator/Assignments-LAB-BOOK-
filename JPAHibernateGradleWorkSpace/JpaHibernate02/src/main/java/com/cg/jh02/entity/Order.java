//package com.cg.jh02.entity;
//
//import java.io.Serializable;
//import java.util.Date;
//
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToMany;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="orders")
//public class Order implements Serializable {
//	private static final long serialVersionUID = 1L;
//
//	@Id
//	@Column(name="order_id")
//	private int id;
//	
//	@Column(name="purchase_date")
//	private Date purchaseDate;
//	
//	@ManyToMany
//	@JoinColumn(name="p_id")
//	private Product product;
//	
//	public Order() {
//		//default
//	}
//
//	public Order(Date purchaseDate) {
//		super();
//		this.purchaseDate = purchaseDate;
//	}
//
//	public Date getPurchaseDate() {
//		return purchaseDate;
//	}
//
//	public void setPurchaseDate(Date purchaseDate) {
//		this.purchaseDate = purchaseDate;
//	}
//
//	public Product getProd() {
//		return product;
//	}
//
//	public void setProd(Product product) {
//		this.product = product;
//	}
//	
//
//	public int getId() {
//		return id;
//	}
//
//
//
//	@Override
//	public String toString() {
//		return String.format("Order [id=%s, purchaseDate=%s, prod=%s]", id, purchaseDate, product);
//	}
//	
//}
