import javax.swing.*;
class Account 
{
private int Accno,Balence;
private String name;

public Account()
{
name = JOptionPane.showInputDialog("enter cuatomer name");
String A1 = JOptionPane.showInputDialog("enter cuatomer account no");
String B1 = JOptionPane.showInputDialog("enter cuatomer account BAL");
Accno = Integer.parseInt(A1);
Balence = Integer.parseInt(B1);


}

public void showdata()
{
System.out.println("account no is "+Accno);
System.out.println("Accno name is "+name);
System.out.println("account bal is "+Balence);
}
public void Deposite( )
{
String D1 = JOptionPane.showInputDialog("enter diposite amount");
int d=Integer.parseInt(D1);
Balence = Balence + d;
System.out.println("after deposite "+d+"your bal is "+Balence);
}
public void Withdraw(  )
{
String W1 = JOptionPane.showInputDialog("enter withdraw amount");
int w=Integer.parseInt(W1);

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
 a1.Deposite();
 a1.showdata();
 a1.Withdraw();
 a1.showbal();
 }
 }

 
 
 
 
 
 
 
