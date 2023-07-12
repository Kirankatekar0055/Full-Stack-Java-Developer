package com.hibernate.client;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.hibernate.model.Emp;

public class ClientCriteriaDemo {

	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory f=cfg.buildSessionFactory();
		Session s=f.openSession();
		Transaction t=s.beginTransaction();
		
		Criteria c=s.createCriteria(Emp.class);
		List<Emp> elist=c.list();
		System.out.println("All Employees are:"+elist);
		
		c=s.createCriteria(Emp.class);
		c.add(Restrictions.gt("salary", 25000.00));
		List<Emp> e1=c.list();
		System.out.println("Emp whose Salary is greater than 25000 is:"+e1);
		
		c=s.createCriteria(Emp.class);
		c.add(Restrictions.lt("salary", 30000.00));
		List<Emp> e2=c.list();
		System.out.println("Emp whose Salary is less than 30000 is:"+e2);
		
		c=s.createCriteria(Emp.class);
		c.add(Restrictions.between("salary", 10000.00, 20000.00));
		List<Emp> e3=c.list();
		System.out.println("Emp whose Salary between 10000 and 20000 is:"+e3);
		
		c=s.createCriteria(Emp.class);
		c.add(Restrictions.like("name","n%" ));
		List<Emp> e4=c.list();
		System.out.println("Emp whose name Start with n is:"+e4);
		
		c=s.createCriteria(Emp.class);
		c.add(Restrictions.like("name","%n" ));
		List<Emp> e5=c.list();
		System.out.println("Emp whose name ends with n is:"+e5);
		
		s.close();
		
	}

}
