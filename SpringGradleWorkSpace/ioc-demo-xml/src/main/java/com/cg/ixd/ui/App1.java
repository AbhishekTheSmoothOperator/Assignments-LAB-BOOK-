package com.cg.ixd.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.ixd.service.GreetServiceImpl;
import com.cg.ixd.service.IGreetService;

public class App1 {

	public static void main(String[] args) {
		
		GreetServiceImpl gs1=new GreetServiceImpl();
		System.out.println(gs1.getGreeting("Srinivas1"));
		
		IGreetService gs2=new GreetServiceImpl();
		System.out.println(gs2.getGreeting("Srinivas2"));
		
		ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
		
		IGreetService gs3=(GreetServiceImpl)context.getBean("gsBean");
		System.out.println(gs3.getGreeting("Srinivas3"));
		
		IGreetService gs4=(IGreetService)context.getBean("gsaBean");
		System.out.println(gs4.getGreeting("Srinivas4"));
		
		IGreetService gs5=(IGreetService)context.getBean("gsaBean3");
		//System.out.println(gs5.hashCode());
		System.out.println(gs5.getGreeting("Srinivas5"));
		
		
		IGreetService gsadv=(IGreetService)context.getBean("gsadvBean");
		System.out.println(gsadv.getGreeting("Srinivas6"));
		
		
		((AbstractApplicationContext)context).close();
	}

}
