package com.cg.hb.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.hb.entity.Product01;

import com.cg.hb.util.JPAUtil;

public class App8 {
public static void main(String []args) {
	EntityManager em = JPAUtil.getEntityManager();
	Product01 p1=new Product01( "MOUSE");
	Product01 p2=new Product01("WEB-CAM");
	Product01 p3=new Product01("KEYBOARD");
	
	EntityTransaction txn=em.getTransaction();
	txn.begin();
	em.persist(p1);
	em.persist(p2);
	em.persist(p3);
	
	txn.commit();
}

}
