package com.hibernate.client;
import java.util.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDeleteRecord {

	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory f=cfg.buildSessionFactory();
		Session s=f.openSession();
		
		Transaction t=s.beginTransaction();
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Record id to Delete:");
		int i=sc.nextInt();
		
		Query q=s.createQuery("Delete from Emp where eid=:n");
		
		q.setParameter("n", i);
		
		int r=q.executeUpdate();
		if(r>0)
		{
			System.out.println("Record Deleted..");
			t.commit();
		}
		else
		{
			System.out.println("Record not found...");
			s.close();
		}
		
		
		

	}

}
