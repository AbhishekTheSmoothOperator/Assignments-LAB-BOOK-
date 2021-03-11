package com.cg.jh05.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.jh05.entity.Employee;
import com.cg.jh05.util.JPAUtil;

public class App6 {

	public static void main(String[] args) {
		
		EntityManager em = JPAUtil.getEntityManager();
		
		// POSITIONAL PARAMETERS<----------------------------------
		
		String jpql = "SELECT e FROM Employee e WHERE e.salary between ?1 and ?2";

		TypedQuery<Employee> tqry = em.createQuery(jpql, Employee.class);
		
		tqry.setParameter(1, 40001.0);
		
		tqry.setParameter(2, 40003.0);

		List<Employee> emp = tqry.getResultList();
		
		if (emp.isEmpty()) {
			System.out.println("No employees found!");
		} else {
			emp.forEach(System.out::println);
		}
				
		JPAUtil.shutdown();

	}

}