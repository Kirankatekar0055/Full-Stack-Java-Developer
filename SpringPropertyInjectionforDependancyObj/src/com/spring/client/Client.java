package com.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Employee;

public class Client {

	public static void main(String[] args) 
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		
		Employee e=ctx.getBean("e1",Employee.class);
		
		System.out.println(e);
		
	}

}
