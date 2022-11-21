import javax.swing.*;
class person
{
private String name ,city;

public void setdata ()
{
name=JOptionPane.showInputDialog("enter name");
city=JOptionPane.showInputDialog("enter citty name");
}
public void showdata()
{
System.out.println("name is "+name);
System.out.println("city is "+city);
}
}
class savingaccount extends person
{
private String accno;
private int balance;

public void setdata()
{
super.setdata();
accno=JOptionPane.showInputDialog("enter acc no");
String b=JOptionPane.showInputDialog("enter balance");
balance =Integer.parseInt(b);
}
public void showdata()
{
super.showdata();
System.out.println("acco no is "+accno);
System.out.println("balance is "+balance);
}
public void withdraw()
{
	 int w;
	String wt = JOptionPane.showInputDialog("enter withdraw amout");
	w=Integer.parseInt(wt);
	if (balance<w)
	{
		System.out.println("insufficient balance");
	}
	else
	{
		balance=balance-w;
		System.out.println("your  balance is "+balance);
	}
}
public void deposite()
{
	 int d;
	String dp = JOptionPane.showInputDialog("enter deposite amout");
	d=Integer.parseInt(dp);
	balance=balance+d;
	System.out.println("after depositing amount your balence is "+balance);
}
}
class fixeddeposite extends person
{
private double balance,year;


public void setdata()
{
super.setdata();
String b1=JOptionPane.showInputDialog("enter balence");

String b3=JOptionPane.showInputDialog("enter year");
balance =Integer.parseInt(b1);

year =Integer.parseInt(b3);
}
public void showdata()
{
super.showdata();
System.out.println("acco balaence is "+balance);

System.out.println("year is "+year);
}
public void maturityamt()
{
	 double mat,roi1;
	 roi1 =0.05;
	mat=balance+(balance*roi1)*year;
	System.out.println("maturity amount is "+mat);
}
}
class worker extends person
{
private double wages,wdays,pay;


public void setdata()
{
super.setdata();
String w1=JOptionPane.showInputDialog("enter wages");
String w2=JOptionPane.showInputDialog("enter wdays");
wages =Integer.parseInt(w1);
wdays =Integer.parseInt(w2);
}
public void showdata()
{
super.showdata();
System.out.println("acco no is "+wages);
System.out.println("balance is "+wdays);

}
public void payment()
{
	
	pay=wages*wdays;
	System.out.println("payment amount is "+pay);
}
}

class abc 
{
	public static void main(String []args)
	{
		savingaccount s1;
		s1= new savingaccount();
		s1.setdata();
		s1.showdata();
s1.withdraw();
s1.deposite();

fixeddeposite f1;
f1=new fixeddeposite();
f1.setdata();
f1.showdata();
f1.maturityamt();

worker w1;
w1= new worker();
w1.setdata();
w1.showdata();
w1.payment();
	}
}
	
	

	
	


