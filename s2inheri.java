import javax.swing.*;
class person
{
private String name,city;

public void setdata()
{
name =JOptionPane.showInputDialog("enter person name");
city= JOptionPane.showInputDialog("enter city name");

}
public void showdata()
{
System.out.println("name is "+name);
System.out.println("city is  "+city);
}
}
class customer extends person
{
private String pname;
private int price ,qty;

public void setdata()
{
super.setdata();
pname =JOptionPane.showInputDialog("enter customer name");
String pr=JOptionPane.showInputDialog("enter price");
String qt=JOptionPane.showInputDialog("enter qty");
price =Integer.parseInt(pr);
qty=Integer.parseInt(qt);
}

public void bill()
{
	int fbill = price * qty;
	if (fbill>10000)
	{
		double abill=fbill*0.80;
		double disc=fbill *0.20;
		System.out.println("bill is "+fbill+"final bill "+abill+"discount "+disc );
	}
	else
	{
		System.out.println("bill is "+fbill);
	}
}
public void showdata()
{
super.showdata();
System.out.println("name is "+pname);
System.out.println("price is  "+price);
System.out.println("qty is  "+qty);
}
}
class abc
{
public static void main(String[]args)
{
customer c1;
c1=new customer();
c1.setdata();
c1.showdata();
c1.bill();
}
}
 









