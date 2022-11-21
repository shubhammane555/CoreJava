import javax.swing.*;
class abc
{
	private String pname;
	private int price,qty;
	
	public void setdata()
	{
		pname=JOptionPane.showInputDialog("enter product name");
		String p=JOptionPane.showInputDialog("enter product price");
	String q=JOptionPane.showInputDialog("enter product qty" );
	price=Integer.parseInt(p);
	qty=Integer.parseInt(q);
	}
	public void showdata()
	{
		System.out.println("product name is "+pname);
		System.out.println("product price is "+price);
System.out.println("product qty is "+qty);
	}
    public double bill()
	{
		int fbill=price*qty;
		if (fbill>10000)
		{
			double dis =fbill*0.20;
			double diss=fbill-dis;
			System.out.println("final discount payment is "+diss);
			return diss;
		}
		else
		{
			System.out.println("final payment is "+fbill);
		}
		return fbill;
	}
}
class bbb
{
	public static void main(String[]args)
	{
		abc a1=new abc();
		a1.setdata();
		a1.showdata();
		double vb1=a1.bill();
		System.out.println("final discount payment is "+vb1);
		
		abc a2=new abc();
		a2.setdata();
		a2.showdata();
		double vb2=a2.bill();
		System.out.println("final discount payment is "+vb1);
		
	}
}