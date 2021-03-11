package com.cg.hb.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.hb.entity.Student;
import com.cg.hb.model.StudentIdentity;
import com.cg.hb.util.JPAUtil;

public class App11 {
	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		
		Student s1=new Student(new StudentIdentity("b.tch","it"),"warnas");
		Student s2=new Student(new StudentIdentity("b.tch","mech"),"rekha");
		Student s3=new Student(new StudentIdentity("m.tch","cse"),"latha");
		Student s4=new Student(new StudentIdentity("m.tch","civil"),"tra");
		
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(s4);
		txn.commit();
			
		em.close();

	}
	}