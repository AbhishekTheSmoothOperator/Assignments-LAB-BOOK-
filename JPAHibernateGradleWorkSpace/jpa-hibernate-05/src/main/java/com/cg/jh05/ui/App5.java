package com.cg.jh05.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.jh05.entity.Employee;
import com.cg.jh05.util.JPAUtil;

public class App5 {

	public static void main(String[] args) {
		
		EntityManager em = JPAUtil.getEntityManager();
		
		//NAMED PARAMETERS<------------------
		
		String jpql = "SELECT e FROM Employee e WHERE e.salary between :limit1 and :limit2";

		TypedQuery<Employee> tqry = em.createQuery(jpql, Employee.class);
		
		tqry.setParameter("limit1", 40004.0);
		
		tqry.setParameter("limit2", 50000.0);

		List<Employee> emp = tqry.getResultList();
		
		if (emp.isEmpty()) {
			System.out.println("No employees found!");
		} else {
			emp.forEach(System.out::println);
		}
				
		JPAUtil.shutdown();

	}

}