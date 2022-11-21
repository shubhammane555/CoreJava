import javax.swing.*;
class shopping
{
private String pname;
private int price;
private int qty;

public void setdata ()
{
pname =JOptionPane.showInputDialog("enter product name");
String p =JOptionPane.showInputDialog("enter product price");
String q =JOptionPane.showInputDialog("enter product qty");
price =Integer.parseInt(p);
qty =Integer.parseInt(q);
}
public void showdata ()
{
System.out.println("product name is" +pname);
System.out.println("product price is" +price);
System.out.println("product qty is" +qty);
}
public void bill()
{
int fbill = price * qty;
if (fbill>10000)
{
double discount = fbill * 0.20;
double fdiscount = fbill -discount;
System.out.println("final payment 20 percent dicount is "+fdiscount);
}
else
{
System.out.println("final payment is "+fbill);
}
}
}

class abc
{
	public static void main (String []args)
	{
		shopping s1;
		s1= new shopping();
		s1.setdata();
		s1.showdata();
		s1.bill();
	}
}
