package com.spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Book;
import com.spring.model.BookDao;
import java.util.*;

public class Client {

	public static void main(String[] args) 
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		
		BookDao d=ctx.getBean("dao",BookDao.class);
		
		Scanner sc=new Scanner(System.in);
		String ans;
		do 
		{
		System.out.println("Menus\n1)Insert Book\n2)Delete Book\n3)Update Book\n4)showallBooks");
		System.out.println("Enter Your Choice:");
		int ch=sc.nextInt();
		
		Book bobj=new Book();
		
		switch (ch) 
		{
		case 1:
			    System.out.println("Enter Book id:");
			    int i=sc.nextInt();
			    System.out.println("Enter Book Name:");
			    sc.nextLine();
			    String nm=sc.nextLine();
			    System.out.println("Enter Book Price:");
			    double p=sc.nextDouble();
			    System.out.println("Enter Book Auther:");
			    sc.nextLine();
			    String au=sc.nextLine();
			    
			    bobj.setId(i);
			    bobj.setName(nm);
			    bobj.setPrice(p);
			    bobj.setAuther(au);
			    
			    int r=d.saveBook(bobj);
			    if(r>0)
			    	System.out.println("Book Inserted...");
			    break;
			
		case 2:
			   System.out.println("Enter Book id:");
		        i=sc.nextInt();
		        
		         r=d.deleteBook(i);
			    if(r>0)
			    	System.out.println("Book Deleted...");
			    else
			    	System.out.println("Book not Found...");
			    break;
			    
		case 3:
			  System.out.println("Enter Book id tobe Updated:");
		       i=sc.nextInt();
		       System.out.println("Enter Book Price:");
			   p=sc.nextDouble();
			   
			   bobj.setId(i);
			   bobj.setPrice(p);
			   
			   r=d.updateBook(bobj);
			    if(r>0)
			    	System.out.println("Book Updated...");
			    else
			    	System.out.println("Book not Found...");
			    break;
			    
		case 4:
			   d.showallBooks();
			   break;
			    
			   
	   default:
			   System.out.println("Invalid Choice...");
		}
		      
		       System.out.println("Do you want to Continue?");
		        ans=sc.nextLine();
			
		}
		      while(ans.equals("y") || ans.equals("Y"));
		

	}

}
