package com.cg.jh02.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jh02.entity.Employee;
import com.cg.jh02.entity.Laptop;
import com.cg.jh02.util.JPAUtil;

public class App01 {

	public static void main(String[] args) {
		EntityManager em = JPAUtil.getEntityManager();

		Laptop lap1 = new Laptop("hp");
		Employee emp1 = new Employee("abhi", "shek", lap1);
		
		Laptop lap2 = new Laptop("dell");
		Employee emp2 = new Employee("smooth", "operator", lap2);
		
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		em.persist(emp1);
		em.persist(emp2);
		txn.commit();
		
		JPAUtil.shutdown();
	}

}