package com.hibernate.client;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Emp;

public class ClientShowAll {

	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory f=cfg.buildSessionFactory();
		Session s=f.openSession();
		
		Query q=s.createQuery("from Emp");
		
		List<Emp> elist= q.list();

		
		System.out.println("All Employees are:");
		
	    for(Emp e:elist)
	    {
	    	System.out.println(e);
	    }
		

	}

}
