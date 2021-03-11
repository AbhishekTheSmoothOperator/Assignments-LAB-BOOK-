package com.cg.hb.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.hb.entity.Product;
import com.cg.hb.util.JPAUtil;

public class Retrieve {
	public static void main(String[]args) {
		EntityManager em = JPAUtil.getEntityManager();
		String jpql="SELECT e from Product e";
		TypedQuery<Product>tqry=em.createQuery(jpql,Product.class);
		List<Product>p1=tqry.getResultList();
		
		if(p1.isEmpty()) {
			System.out.println("No product found!");
		}else {
			p1.forEach(System.out::println);
		}
		em.close();
	}
}