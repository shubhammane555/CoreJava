import javax.swing.*;
class abc
{
private String pname;
private int price,qty;

public void setdata()
{
	pname=JOptionPane.showInputDialog("enter name");
	String p=JOptionPane.showInputDialog("enter price");
String q=JOptionPane.showInputDialog("enter qty");
price=Integer.parseInt(p);
qty=Integer.parseInt(q);
}
public void showdata()
{
	System.out.println("name is"+pname);
	System.out.println("name is"+price);
	System.out.println("name is"+qty);
}
public void bill()
{
	int bill=price*qty;
		System.out.println("name is"+bill);
}
}
class bbb
{
	public static void main(String []args)
	{
		abc a1=new abc();
		a1.setdata();
		a1.showdata();
		a1.bill();
	}
}
 