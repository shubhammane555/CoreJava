class Account 
{
private int Accno,Balence;
private String name;

public Account()
{
Accno = 1001;
name = "shubham";
Balence = 7000;
}

public void showdata()
{
System.out.println("account no is "+Accno);
System.out.println("Accno name is "+name);
System.out.println("account bal is "+Balence);
}
public void Deposite( int d)
{
Balence = Balence + d;
System.out.println("after deposite "+d+"your bal is "+Balence);
}
public void Withdraw( int w )
{
if (w > Balence)
{
 System.out.println(" insufficent bal");
 }
 else
 {
 Balence = Balence - w;
 System.out.println(" after withdraw "+w+" your bal is "+Balence);
 }
}

 public void showbal()
 {
	 System.out.println(" your currnt bal is "+Balence);
}
 }

 class abc
 {
 public static void main (String []args)
 {
 Account a1;
 a1 = new Account();
 a1.showdata();
 a1.Deposite(2000);
 a1.showdata();
 a1.Withdraw(5000);
 a1.showbal();
 }
 }

 
 
 
 
 
 
 
