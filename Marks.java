import java.util.*;
public class Marks {
	
	private int rollno;
	private double marks;
	
	public Marks(int rollno,double marks)
	{
		this.rollno=rollno;
		this.marks=marks;
	}
	public String toString()
	{
		return "\nRollno="+rollno+"\nMarks="+marks;
	}
	public double getMarks()
	{
		return marks;
	}
	public void Grade()throws LowGradeException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student marks:");
		double m=sc.nextDouble();
		if(m>=70)
		{
			System.out.println("Grade A+");
		}
		else if(m<70 && m>60)
		{
			System.out.println("Grade A");
		}
		else if(m<60 && m>50)
		{
			System.out.println("Grade B+");
		}
		else if(m<50 && m>40)
		{
			System.out.println("Grade B");
		}
		else if(m<40 && m>35)
		{
			System.out.println("Grade C");
		}
	    else
	    {
	    	throw new LowGradeException("Fail.....");
	    }
	}

	public static void main(String[] args) {
		
		Marks m1=new Marks(23,42);
		System.out.println(m1);
		
		try
		{
			m1.Grade();
		}
		catch(LowGradeException e)
		{
			e.printmsg();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	    }
	   
	 }


