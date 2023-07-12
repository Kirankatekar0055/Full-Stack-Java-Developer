package com.hibernate.client;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientUpdateRecord {

	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory f=cfg.buildSessionFactory();
		Session s=f.openSession();
		
		Transaction t=s.beginTransaction();
		
		Query q=s.createQuery("update Emp set name=:n where eid=:i");
		
		q.setParameter("i",2);
		q.setParameter("n","shubham");
		
		int r=q.executeUpdate();
		if(r>0)
		{
			System.out.println("Record Updated..");
			t.commit();
		}
		else
		{
			System.out.println("Record not found...");
			s.close();
		}
	}

}
