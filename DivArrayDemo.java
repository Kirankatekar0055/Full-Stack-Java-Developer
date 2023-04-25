import java.util.*;
public class DivArrayDemo {
	
	public int div(int a,int b)
	{
		return(a/b);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		try
		{
			System.out.println("Enter first no:");
			int x=sc.nextInt();
			
			System.out.println("Enter second no:");
			int y=sc.nextInt();
			
			DivArrayDemo d=new DivArrayDemo();
			
			int z=d.div(x,y);
			System.out.println("Division is:"+z);
			
			int []arr=new int[5];
			arr[6]=34;
		}
			
		
		catch(ArithmeticException Ae)
		{

		}
		catch(ArrayIndexOutOfBoundsException Ab)
		{
			Ab.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Over...");
		}
		

	}

}
