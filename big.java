import javax.swing.*;
class loan
{
private String a1,a2,a3,a4,a5,a6;
private int b1,b2,b3,b4;

public void setdata ()
{
a1=JOptionPane.showInputDialog("first name ");
a2=JOptionPane.showInputDialog("middle name ");
a3=JOptionPane.showInputDialog("last name ");
a4=JOptionPane.showInputDialog("gender ");
a5=JOptionPane.showInputDialog("parmanant address ");
a6=JOptionPane.showInputDialog("occupation ");
String ba=JOptionPane.showInputDialog("date of birth ");
String bb=JOptionPane.showInputDialog("adhar card no ");
String bc=JOptionPane.showInputDialog("pan card no ");
String bd=JOptionPane.showInputDialog("mob no ");
b1=Integer.parseInt(ba);
b2=Integer.parseInt(bb);
b3=Integer.parseInt(bc);
b4=Integer.parseInt(bd);
}
public void showdata()
{
System.out.println("first name is "+a1);
System.out.println("middle name  is "+a2);
System.out.println("last name is "+a3);
System.out.println("gender is "+a4);
System.out.println("parmanant address is "+a5);
System.out.println("occupation is "+a6);
System.out.println("date of birth is "+b1);
System.out.println("adhar card no is "+b2);
System.out.println("pan card no is "+b3);
System.out.println("mob no is "+b4);
}

}




class homeloan extends loan
{
	private String a1,a2,a3,a4,a5;
	private double b1,b2,b3,b4,b5,b6,b7;
	public void setdata()
	{
		super.setdata();
		a1=JOptionPane.showInputDialog("address of property ");
		a2=JOptionPane.showInputDialog("type of property ");
		a3=JOptionPane.showInputDialog("old owner name ");
		a4=JOptionPane.showInputDialog("type of borrower");
		a5=JOptionPane.showInputDialog("name of borrower ");
		String ba=JOptionPane.showInputDialog("carpet area");
		String bb=JOptionPane.showInputDialog("building area");
		String bc=JOptionPane.showInputDialog("gross income");
		String bd=JOptionPane.showInputDialog("loan amount");
		String be=JOptionPane.showInputDialog("ROI");
		String bf=JOptionPane.showInputDialog("duration");
		String bg=JOptionPane.showInputDialog("down payment ");
		b1=Integer.parseInt(ba);
		b2=Integer.parseInt(bb);
		b3=Integer.parseInt(bc);
		b4=Integer.parseInt(bd);
		b5=Integer.parseInt(be);
		b6=Integer.parseInt(bf);
		b7=Integer.parseInt(bg);
	}
	
		
	
	public void showdata()
	{
	super.showdata();
System.out.println("address of property is "+a1);	
System.out.println("type of propertyis "+a2);
System.out.println("old owner name is "+a3);
System.out.println("type of borrower is "+a4);
System.out.println("name of borrower is "+a5);
System.out.println("carpet area is "+b1);
System.out.println("building area is "+b2);
System.out.println("gross income is "+b3);
System.out.println("loan amount "+b4);
System.out.println("ROI is "+b5);
System.out.println("aduration is "+b6);
System.out.println("down payment is "+b7);
	}
	public void totalcost()
	{
		double tc =b4+b7;
		System.out.println("total cost  is "+tc);
		
	}
	public void emi()
	{
		double em=b4+(b4*b5)*b6/b6*12;
		System.out.println("emi  is "+em);
	}
}



class businesloan extends loan
{
	private String a1,a2,a3,a4,a5,a6;
	private double b1,b2,b3,b4,b5,b6;
	public void setdata ()
	{
		super.setdata();
		a1=JOptionPane.showInputDialog("type of buisness ");
		a2=JOptionPane.showInputDialog("business detail ");
		a3=JOptionPane.showInputDialog("owner name ");
		a4=JOptionPane.showInputDialog("business name ");
		a5=JOptionPane.showInputDialog("business address ");
		a6=JOptionPane.showInputDialog("security deails ");
		String ba=JOptionPane.showInputDialog("shares of owner");
		String bb=JOptionPane.showInputDialog("registration no");
		String bc=JOptionPane.showInputDialog("caital");
		String bd=JOptionPane.showInputDialog("loan amount");
		String be=JOptionPane.showInputDialog("ROI");
		String bf=JOptionPane.showInputDialog("duration");
		b1=Integer.parseInt(ba);
		b2=Integer.parseInt(bb);
		b3=Integer.parseInt(bc);
		b4=Integer.parseInt(bd);
		b5=Integer.parseInt(be);
		b6=Integer.parseInt(bf);
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("type of buisness is "+a1);	
System.out.println("business detail "+a2);
System.out.println("owner name is "+a3);
System.out.println("business name  is "+a4);
System.out.println("business address is "+a5);
System.out.println("security deails  is "+a6);
System.out.println("shares of owner is "+b1);
System.out.println("registration no is "+b2);
System.out.println("caital is "+b3);
System.out.println("loan amount "+b4);
System.out.println("ROI is "+b5);
System.out.println("duration is "+b6);

	}
	public void totalaaset()
	{
		double ta=b3+b4;
		System.out.println("tota asset "+ta);
	}
	
		public void emi()
	{
		double em=b4+(b4*b5)*b6/b6*12;
		System.out.println("emi  is "+em);
	}
}



class carloan extends loan
{
private String a1,a2,a3;
	private double b1,b2,b3,b4,b5,b6,b7,b8,b9;
	public void setdata ()
	{
super.setdata();
		a1=JOptionPane.showInputDialog("car name ");
        a2=JOptionPane.showInputDialog("model name  ");
		a3=JOptionPane.showInputDialog("accesries name ");
		String ba=JOptionPane.showInputDialog("car cc");
		String bb=JOptionPane.showInputDialog("ex - showromm price");
		String bc=JOptionPane.showInputDialog("insurance cost");
		String bd=JOptionPane.showInputDialog("rto charges");
		String be=JOptionPane.showInputDialog("accesries cost");
		String bf=JOptionPane.showInputDialog("down payment");
		String bg=JOptionPane.showInputDialog("loan amount");
		String bh=JOptionPane.showInputDialog("roi");
		String bi=JOptionPane.showInputDialog("duration");
		b1=Integer.parseInt(ba);
		b2=Integer.parseInt(bb);
		b3=Integer.parseInt(bc);
		b4=Integer.parseInt(bd);
		b5=Integer.parseInt(be);
		b6=Integer.parseInt(bf);
		b7=Integer.parseInt(bg);
		b8=Integer.parseInt(bh);
		b9=Integer.parseInt(bi);
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("car name "+a1);
System.out.println("model name is "+a2);
System.out.println("accesries name   is "+a3);
System.out.println("car cc is "+b1);
System.out.println("ex - showromm pric is "+b2);
System.out.println("insurance cost is "+b3);
System.out.println("rto charges is "+b4);
System.out.println("accesries cost is "+b5);
System.out.println("down payment "+b6);
System.out.println("loan amount "+b7);
System.out.println("ROI is "+b8);
System.out.println("duration is "+b9);

	}
public void onroadprice()
 {
double orp=b2+b3+b5+b8;
System.out.println("on road price  is "+orp);
 }
 public void emi()
 {
		double em=b4+(b4*b5)*b6/b6*12;
		System.out.println("emi  is "+em);
	}
}




 class personalloan extends loan
 {
	 private String a1,a2,a3,a4,a5;
	 private double b1,b2,b3,b4,b5,b6,b7,b8,b9;
	 
	 
		 public void setdata ()
		 {
			 
	super.setdata();
		a1=JOptionPane.showInputDialog("company name ");
		a2=JOptionPane.showInputDialog("job profile ");
		a3=JOptionPane.showInputDialog("employer with current org ");
		a4=JOptionPane.showInputDialog("current address ");
		a5=JOptionPane.showInputDialog("no year in current address ");
	    String ba=JOptionPane.showInputDialog("salary");
		String bb=JOptionPane.showInputDialog("other emi");
		String bc=JOptionPane.showInputDialog("cibil score");
		String bd=JOptionPane.showInputDialog("job experience");
		String be=JOptionPane.showInputDialog("lone amount");
		String bf=JOptionPane.showInputDialog("rate of intrest");
		String bg=JOptionPane.showInputDialog("duration in year");
		String bh=JOptionPane.showInputDialog("processing fee");
		String bi=JOptionPane.showInputDialog("no of dependent");
		b1=Integer.parseInt(ba);
		b2=Integer.parseInt(bb);
		b3=Integer.parseInt(bc);
		b4=Integer.parseInt(bd);
		b5=Integer.parseInt(be);
		b6=Integer.parseInt(bf);
		b7=Integer.parseInt(bg);
		b8=Integer.parseInt(bh);
		b9=Integer.parseInt(bi);
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("company name "+a1);
System.out.println("job profile "+a2);
System.out.println("employer with current org "+a3);
System.out.println("current address"+a4);
System.out.println("no year in current address"+a5);
System.out.println("salary "+b1);
System.out.println("other emi "+b2);
System.out.println("cibil score "+b3);
System.out.println("job experience "+b4);
System.out.println("loan amount "+b5);
System.out.println("ROI is "+b6);
System.out.println("duration in year "+b7);
System.out.println("processing fee "+b8);
System.out.println("no of dependent "+b9);


	}	
	
	public void inandloan()
	{
		double il=b5-b8;
		System.out.println("inand load  "+il);
	}
	 public void emi()
 {
		double em=b5+(b5*b6)*b7/b7*12;
		System.out.println("emi  is "+em);
	}
}



class educationloan extends loan
{
	private String a1,a2,a3,a4,a5,a6;
	private double b1,b2,b3,b4,b5,b6,b7;
	
		public void setdata ()
		{
			super.setdata();
		a1=JOptionPane.showInputDialog("collage name ");
		a2=JOptionPane.showInputDialog("degree type ");
		a3=JOptionPane.showInputDialog("degree name ");
		a4=JOptionPane.showInputDialog("gardian name ");
		a5=JOptionPane.showInputDialog("occupation ");
	    String ba=JOptionPane.showInputDialog("10 th percentage ");
		String bb=JOptionPane.showInputDialog("12 th percentage");
		String bc=JOptionPane.showInputDialog("duration of degree");
		String bd=JOptionPane.showInputDialog("gardian income");
		String be=JOptionPane.showInputDialog("lone amount");
		String bf=JOptionPane.showInputDialog("rate of intrest");
		String bg=JOptionPane.showInputDialog("duration for refund");
		b1=Integer.parseInt(ba);
		b2=Integer.parseInt(bb);
		b3=Integer.parseInt(bc);
		b4=Integer.parseInt(bd);
		b5=Integer.parseInt(be);
		b6=Integer.parseInt(bf);
		b7=Integer.parseInt(bg);
		
	}
	public void showdata()
	{
		super.showdata();
		System.out.println("collage name "+a1);
System.out.println("degree type "+a2);
System.out.println("degree name "+a3);
System.out.println("gardian name"+a4);
System.out.println("occupation"+a5);
System.out.println("10 th percentage "+b1);
System.out.println("12 th percentage "+b2);
System.out.println("duration of degree "+b3);
System.out.println("gardian income "+b4);
System.out.println("loan amount "+b5);
System.out.println("ROI is "+b6);
System.out.println("duration for refund "+b7);
	}
	public void dispersement()
	{
		double dis = b5 /b3 ;
		System.out.println("dispersement is"+dis);
	}
	public void emi()
	{
		double em= b5+(b5*b6)*b7 /b7*12;
		System.out.println("emi is"+em);
	}
	}
	
	
	
	class goldloan extends loan
	{
		private String a1,a2,a3,a4;
		private double b1,b2,b3,b4,b5;
		
			public void setdata ()
			{
					super.setdata();
		a1=JOptionPane.showInputDialog("details of gold ");
		a2=JOptionPane.showInputDialog("item wise description ");
		a3=JOptionPane.showInputDialog("gold smith name ");
		a4=JOptionPane.showInputDialog("address of gold smith ");
	    String ba=JOptionPane.showInputDialog("avg cost ");
		String bb=JOptionPane.showInputDialog("current avg cost");
		String bc=JOptionPane.showInputDialog("lone amount");
		String bd=JOptionPane.showInputDialog("rate of intrest");
		String be=JOptionPane.showInputDialog("duration");
		b1=Integer.parseInt(ba);
		b2=Integer.parseInt(bb);
		b3=Integer.parseInt(bc);
		b4=Integer.parseInt(bd);
		b5=Integer.parseInt(be);
		
		
			}
			public void showdata()
	{
		super.showdata();
		System.out.println("details of gold  "+a1);
System.out.println("item wise description "+a2);
System.out.println("gold smith name "+a3);
System.out.println("address of gold smith"+a4);
System.out.println("avg cost "+b1);
System.out.println("current avg cost "+b2);
System.out.println("lone amount "+b3);
System.out.println("rate of intrest "+b4);
System.out.println("duration  "+b5);
	}
	
	
	public void settlement()
	{
		double sm=b3+ (b3*b4)*b5;
		System.out.println("settlement is "+sm);
	}
	}
	
	
	
	
	class farmingloan extends loan
	{
		private String a1,a2,a3,a4;
		private double b1,b2,b3,b4,b5,b6;
		
		public void setdata ()
		{
					super.setdata();
		a1=JOptionPane.showInputDialog("village name");
		a2=JOptionPane.showInputDialog("7/12 details");
		a3=JOptionPane.showInputDialog("crop details ");
		a4=JOptionPane.showInputDialog("details of land type ");
	    String ba=JOptionPane.showInputDialog("gat no ");
		String bb=JOptionPane.showInputDialog("area of farm in hector");
		String bc=JOptionPane.showInputDialog("lone amount");
		String bd=JOptionPane.showInputDialog("rate of intrest");
		String be=JOptionPane.showInputDialog("duration");
		String bf=JOptionPane.showInputDialog("share cut price");
		b1=Integer.parseInt(ba);
		b2=Integer.parseInt(bb);
		b3=Integer.parseInt(bc);
		b4=Integer.parseInt(bd);
		b5=Integer.parseInt(be);
		b6=Integer.parseInt(bf);
		
		}
		public void showdata()
	{
		super.showdata();
		System.out.println("village name  "+a1);
System.out.println("7/12 details "+a2);
System.out.println("crop details "+a3);
System.out.println("details of land type"+a4);
System.out.println("gat no  "+b1);
System.out.println("area of farm in hector "+b2);
System.out.println("lone amount "+b3);
System.out.println("rate of intrest "+b4);
System.out.println("duration  "+b5);
System.out.println("share cut price  "+b6);
	}
			
		public void inhandloan()
		{
			double il=b3-b6;
			System.out.println("share cut price  "+il);
			
		}
	}
	
	
		
			
	
class abc
{
	public static void main(String []args)
	{
		loan l1;
		l1=new loan();
		l1.setdata();
		l1.showdata();
		
		homeloan h1;
		h1= new homeloan();
		h1.setdata();
		h1.showdata();
		h1.totalcost();
		h1.emi();
		
	businesloan b1;
	b1=new businesloan();
	b1.setdata();
	b1.showdata();
	b1.totalaaset();
	b1.emi();
	
	carloan c1;
	c1=new carloan();
	c1.setdata();
	c1.showdata();
	c1.onroadprice();
	c1.emi();
	
	personalloan p1;
	p1=new personalloan();
	p1.setdata();
	p1.showdata();
	p1.inandloan();
	p1.emi();
	
	educationloan e1;
	e1=new educationloan();
	e1.setdata();
	e1.showdata();
	e1.dispersement();
	e1.emi();
	
	goldloan g1;
	g1=new goldloan();
	g1.setdata();
	g1.showdata();
	g1.settlement();
	
	farmingloan f1;
	f1=new farmingloan();
	f1.setdata();
	f1.showdata();
	f1.inhandloan();
	
	
	}
}

		
		
	
	
	
	
	
	
	

	
		
		
		
		
		
		
		
		
		
		
		