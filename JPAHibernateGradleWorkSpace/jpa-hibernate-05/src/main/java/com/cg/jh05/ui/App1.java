package com.cg.jh05.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jh05.entity.Department;
import com.cg.jh05.entity.Employee;
import com.cg.jh05.util.JPAUtil;

public class App1 {
	public static void main(String []args) {
		
		EntityManager em=JPAUtil.getEntityManager();
		
		Employee e1=new Employee(101L,"abhi1","shek1",40001.0,10);
		
		Employee e2=new Employee(102L,"abhi2","shek2",40002.0,11);
		
		Employee e3=new Employee(103L,"abhi3","shek3",40003.0,12);
		
		Employee e4=new Employee(104L,"abhi4","shek4",40004.0,13);
		
		Employee e5=new Employee(105L,"abhi5","shek5",40005.0,14);
		
		Employee e6=new Employee(106L,"abhi6","shek6",40006.0,15);
		
		Department d1=new Department(10L,"Development");
		
		Department d2=new Department(20L,"testing");

		EntityTransaction txn=em.getTransaction();
		
		txn.begin();
		
		em.persist(e1);
		
		em.persist(e2);
		
		em.persist(e3);
		
		em.persist(e4);
		
		em.persist(e5);
		
		em.persist(e6);
		
		em.persist(d1);
		
		em.persist(d2);
		
		txn.commit();
		
		JPAUtil.shutdown();
	}
}
