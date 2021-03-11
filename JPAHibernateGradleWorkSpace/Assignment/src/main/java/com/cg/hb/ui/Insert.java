package com.cg.hb.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.hb.entity.Product;
import com.cg.hb.util.JPAUtil;

public class Insert {
	public static void main(String[]args) {
		EntityManager em = JPAUtil.getEntityManager();
		
		Product p1 = new Product(101L,"srinivas1","GROCERY",1500.0);
		Product p2 = new Product(102L,"srinivas2","COSMETIC",1000.0);
		Product p3 = new Product(103L,"srinivas3","DESERT",1200.0);
		
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		txn.commit();
		em.close();
	}
}
