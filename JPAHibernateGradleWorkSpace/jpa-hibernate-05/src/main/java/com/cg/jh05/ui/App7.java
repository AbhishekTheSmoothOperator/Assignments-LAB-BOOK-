package com.cg.jh05.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.jh05.entity.Employee;
import com.cg.jh05.util.JPAUtil;

public class App7 {

	public static void main(String[] args) {
		
		EntityManager em = JPAUtil.getEntityManager();
		
		// NAMED QUERY WITH POSITIONAL PARAMETERS<----------------------
		
		TypedQuery<Employee> tqry = em.createNamedQuery("specific_employees", Employee.class);
		
		tqry.setParameter(1, 40002.0);
		
		tqry.setParameter(2, 40004.0);

		List<Employee> emp = tqry.getResultList();
		
		if (emp.isEmpty()) {
			System.out.println("No employees found!");
		} else {
			emp.forEach(System.out::println);
		}
				
		JPAUtil.shutdown();

	}

}