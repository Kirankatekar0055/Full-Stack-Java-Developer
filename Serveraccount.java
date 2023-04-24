import java.util.*;
class Account
{
 
   private int Accno;
   private String name;
   private double balance;


  public void Accept()
{
   Scanner sc=new Scanner(System.in);
   System.out.println("enter your Account no:");
   Accno=sc.nextInt();

   System.out.println("enter your name:");
   sc.nextLine();
   name=sc.nextLine();

   System.out.println("enter your Balance:");
   balance=sc.nextDouble();
}

  public void Desp()
{
  System.out.println("Account no="+Accno+"\nname="+name+"\nBalance="+balance);
}

  public void Withdraw()

{ 
  Scanner sc=new Scanner(System.in);
  System.out.println("enter your Amount to Withdraw:");
  int amount=sc.nextInt();

  if(balance > amount)
{
  balance=balance-amount;
  System.out.println("Balance after Withdraw is="+balance); 
}
  else
{
  System.out.println("\nInsufficient balance....");
}

}
  public void Deposite()

{
  Scanner sc=new Scanner(System.in);
  System.out.println("enter your amount to deposite");
  int depo=sc.nextInt();
  balance=balance+depo;
  System.out.println("Total amount after deposite is:="+balance);
}

}
  class Serveraccount 
{

  public static void main(String[] args)

{

  Account ac=new Account();
  ac.Accept();
  ac.Desp();
  ac.Withdraw();
  ac.Deposite();
}

} 