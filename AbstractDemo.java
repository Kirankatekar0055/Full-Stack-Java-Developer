import java.util.*;
abstract class Bank
{
    public Bank()
	{
	  System.out.println("default constructor called...");
	  
	}
    public abstract void getInterest();

    
}
class Axis extends Bank
{
	private String bname;
	 private double pamount;
	 private int rate;
	 private int time;
     
    public Axis()
   {
     super();
     bname=null;
	 pamount=0;
	 rate=0;
	 time=0;
	 
   }
    
    public Axis(String bname,double pamount,int rate,int time)
   {
     super();
     this.bname=bname;
	 this. pamount=pamount;
	 this.rate=rate;
	 this.time=time;
   }

    public String toString()
   {
     return "\nbank name="+bname
	                           +"\nprinciple amount="+pamount
							                                 +"\nRate="+rate
															                +"\nTime="+time;
   }
    public void getInterest()
   {
     System.out.println("interest rate="+((pamount*rate*time)/100));
   }
}
class Union extends Bank
{  
     private String bname;
	 private double pamount;
	 private int rate;
	 private int time;
     
    public Union()
   {
     super();
     bname=null;
	 pamount=0;
	 rate=0;
	 time=0;
	 
   }
    
    public Union(String bname,double pamount,int rate,int time)
   {
     super();
     this.bname=bname;
	 this. pamount=pamount;
	 this.rate=rate;
	 this.time=time;
   }

    public String toString()
   {
     return "\nbank name="+bname
	                           +"\nprinciple amount="+pamount
							                                 +"\nRate="+rate
															                +"\nTime="+time;
   }
    public void getInterest()
   {
     System.out.println("Interest rate="+((pamount*rate*time)/100));
   }
} 
class AbstractDemo
{
  public static void main(String []args)
  {
	
	  
     Bank s=new Axis("karad",2300,78,4);
	 System.out.println("type of object="+s.getClass());
	 System.out.println(s);
	 s.getInterest();
	 
  

  
     s=new Union("pune",3000,50,3);
	 System.out.println("type of object="+s.getClass());
	 System.out.println(s);
	 s.getInterest();  
	 
  }
}  
       
	