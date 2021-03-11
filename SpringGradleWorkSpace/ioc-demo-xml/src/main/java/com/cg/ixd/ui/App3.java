package com.cg.ixd.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.ixd.service.IGreetService;

public class App3 {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("bean3.xml");
		
		IGreetService gsadv=context.getBean("gsadvBean",IGreetService.class);
		System.out.println(gsadv.getGreeting("CHAMP"));
		
		
		((AbstractApplicationContext)context).close();

	}

}
