package com.cg.hb.ui;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.hb.entity.Employee2;
import com.cg.hb.model.Address;
import com.cg.hb.util.JPAUtil;

public class App09 {
	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		
		Employee2 p1=new Employee2(10L,"chacolate",15000000.0,LocalDate.now(),new Address("1-1-1","sertt","897665"));
		Employee2 p2=new Employee2(11L,"biscuit",15345678.0,LocalDate.now(),new Address("1-6-0","ghj","345678"));
		Employee2 p3=new Employee2(1L,"biscuit",15345678.0,LocalDate.now(),new Address("1-8-0","guyj","545678"));
		
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
			
		txn.commit();
			
		em.close();

	}
}