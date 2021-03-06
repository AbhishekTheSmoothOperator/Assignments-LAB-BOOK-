package com.cg.jh05.ui;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.jh05.util.JPAUtil;

public class App9 {

	public static void main(String[] args) {
		
		EntityManager em = JPAUtil.getEntityManager();
		
		TypedQuery<Long> q1 = em.createQuery("SELECT COUNT(e) FROM Employee e", Long.class);
		
		TypedQuery<Double> q2 = em.createQuery("SELECT SUM(e.salary) FROM Employee e", Double.class);
		
		TypedQuery<Double> q3 = em.createQuery("SELECT MAX(e.salary) FROM Employee e", Double.class);
		
		TypedQuery<Double> q4 = em.createQuery("SELECT MIN(e.salary) FROM Employee e", Double.class);
		
		TypedQuery<Double> q5 = em.createQuery("SELECT AVG(e.salary) FROM Employee e", Double.class);
		
		System.out.println("Total Number of Employees = " + q1.getSingleResult());
		
		System.out.println("Total Salary of all Employees = " + q2.getSingleResult());
		
		System.out.println("Maximum Salary of Employees = " + q3.getSingleResult());
		
		System.out.println("Minimum Salary of Employees = " + q4.getSingleResult());
		
		System.out.println("Average Salary of Employees = " + q5.getSingleResult());
				
		JPAUtil.shutdown();

	}

}