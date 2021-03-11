package com.cg.hb.ui;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.hb.entity.Product;
import com.cg.hb.util.JPAUtil;

public class Update {
	public static void main(String[]args) {
		EntityManager em = JPAUtil.getEntityManager();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product id: ");
		long productId=sc.nextLong();
		
		Product p1=em.find(Product.class,productId);
		if(p1==null) {
			System.out.println("product id "+productId+"not found");
		}else {
			EntityTransaction txn=em.getTransaction();
			System.out.println("Enter the unit rate: ");
			double unitRate=sc.nextDouble();
			p1.setUnitRate(unitRate);
			txn.begin();
			em.merge(p1);
			txn.commit();
		}

		sc.close();
		em.close();
	}
}