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
System.out.println(Thread.currentThread().getName()+ "swatacha" +i+" piese khat ahe");
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
		t1.setName("saba");
		t2.setName("prasad");
		t3.setName("pranoti");
		t2.start();
	
		
		try 
		{
			t2.join(5000);
		}
		catch (Exception e)
		{
		System.out.println(e);
		}
		
		t1.start();
		t3.start();
		t1.stop();
		System.out.println("t1 is stop");
		
	}
}
