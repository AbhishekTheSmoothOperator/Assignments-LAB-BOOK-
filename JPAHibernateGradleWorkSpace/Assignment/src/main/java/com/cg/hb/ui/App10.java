package com.cg.hb.ui;

import javax.persistence.EntityManager;

import com.cg.hb.entity.Employee2;
import com.cg.hb.util.JPAUtil;

public class App10 {
	
	public static void main(String[] args) {

		EntityManager em = JPAUtil.getEntityManager();
		
		Employee2 employee = em.find(Employee2.class,101L);
		if(employee!=null) 
			System.out.println(employee);
		else
			System.out.println("employee not found");
		
		
		em.close();	
		
	}

}