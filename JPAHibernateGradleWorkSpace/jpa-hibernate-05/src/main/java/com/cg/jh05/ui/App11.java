package com.cg.jh05.ui;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.jh05.entity.Employee;
import com.cg.jh05.util.JPAUtil;

public class App11 {

	public static void main(String[] args) {
		
		EntityManager em = JPAUtil.getEntityManager();
		
		String jpql = "SELECT e.departmentId,COUNT(e) FROM Employee e GROUP BY e.departmentId";
		
		TypedQuery<Object[]> query = em.createQuery(jpql, Object[].class);
		
		List<Object[]> empList = query.getResultList();
		
		for(Object[]records:empList) {
			System.out.printf("%-5s%5s\n",records[0],records[1]);
		}
		

		String jpql1 = "SELECT e.departmentId,COUNT(e) FROM Employee e GROUP BY e.departmentId HAVING COUNT(e)>3";
		
		TypedQuery<Object[]> query1 = em.createQuery(jpql1, Object[].class);
		
		List<Object[]> empList1 = query1.getResultList();
		
		for(Object[]records:empList1) {
		
			System.out.printf("%-5s%5s\n",records[0],records[1]);
		}
		
				
		JPAUtil.shutdown();

	}

}