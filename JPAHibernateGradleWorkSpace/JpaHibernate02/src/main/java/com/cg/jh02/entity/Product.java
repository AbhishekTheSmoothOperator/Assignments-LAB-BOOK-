//package com.cg.jh02.entity;
//
//import java.io.Serializable;
//import java.util.Set;
//
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="products")
//public class Product  implements Serializable{
//
//	
//	private static final long serialVersionUID = 1L;
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="p_id")
//	private Long productId;
//	
//	@Column(name="p_name")
//	private String productname;
//	
//	@ManyToMany(cascade = CascadeType.ALL,mappedBy="products")
//	private Set<Order> orders;
//	
//	public Product() {
//		/* default constructor */
//	}
//
//	public Product(String productname) {
//		super();
//		this.productname = productname;
//	}
//	
//	public Set<Order> getOrders() {
//		return orders;
//	}
//
//	public void setOrders(Set<Order> orders) {
//		this.orders = orders;
//	}
//
//	public Long getProductId() {
//		return productId;
//	}
//
//
//	public String getProductname() {
//		return productname;
//	}
//
//	public void setProductname(String productname) {
//		this.productname = productname;
//	}
//
//	@Override
//	public String toString() {
//		return String.format("Product [productId=%s, productname=%s, orders=%s]", productId, productname, orders);
//	}
//
//
//	
//	
//	
//			
//}