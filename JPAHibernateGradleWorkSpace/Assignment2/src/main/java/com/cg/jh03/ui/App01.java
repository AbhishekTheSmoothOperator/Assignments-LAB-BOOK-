package com.cg.jh03.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jh03.entity.Employee;
import com.cg.jh03.model.Account;
import com.cg.jh03.model.Address;
import com.cg.jh03.entity.Employee;
import com.cg.jh03.util.JPAUtil;

public class App01 {

	public static void main(String []args) {
		EntityManager em = JPAUtil.getEntityManager();
		Employee emp1=new Employee(10001L,"aks","champ",new Address("1-2-3","street a","chennai avadi"),new Account("34543656767","state bank of india","avadi",10000.0));
		Employee emp2=new Employee(10002L,"smooth","operator",new Address("1-2-3-4-5","street abc","veltech"),new Account("345436566767","punjab national bank","vellore",15500.0));
		
		EntityTransaction txn= em.getTransaction();
		txn.begin();
		em.persist(emp1);
		em.persist(emp2);
		txn.commit();
		em.close();

}
}