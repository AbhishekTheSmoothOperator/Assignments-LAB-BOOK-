package com.cg.hb.ui;

import javax.persistence.EntityManager;


import com.cg.hb.entity.Product;
import com.cg.hb.util.JPAUtil;

public class Check{
	public static void main(String[]args) {
		EntityManager em = JPAUtil.getEntityManager();
		Product p=em.find(Product.class, 102L);
		if(p!=null) {
			System.out.println(p);
		}else {
			System.out.println("Employee not found!");
		}
		em.close();
	}
}
