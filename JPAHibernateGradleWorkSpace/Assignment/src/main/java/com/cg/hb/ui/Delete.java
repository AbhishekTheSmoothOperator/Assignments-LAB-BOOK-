package com.cg.hb.ui;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.hb.entity.Product;
import com.cg.hb.util.JPAUtil;

public class Delete {
	public static void main(String[]args) {
		EntityManager em = JPAUtil.getEntityManager();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter product id: ");
		Long productId=sc.nextLong();
		Product p=em.find(Product.class, productId);
		if(p==null) {
			System.out.println("product with id #"+productId+"not found!");
		}else {
			EntityTransaction txn = em.getTransaction();
			txn.begin();
			em.remove(p);
			txn.commit();

		}
		sc.close();
		em.close();
	}
}
