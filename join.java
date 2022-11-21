class smt extends Thread
{
public void run()
{
for (int i=1;i<=10;i++)
{
try
{
Thread.sleep(1000);
}
catch (Exception e)
{
System.out.println(e);
}
System.out.println(i+ "number cha pic khat ahe");
}
}
}
class abc
{
	public static void main(String[]args)
	{
		smt t1=new smt();
		smt t2=new smt();
		smt t3=new smt();
		
		
		
		t1.start();
		
		try 
		{
			t1.join(5000);
		}
		catch (Exception e)
		{
		System.out.println(e);
		}
		
		t2.start();
		t3.start();
	}
}
