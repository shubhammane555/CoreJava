

///// //// yield of multithreading question 8 answer
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
if((i>5)&& (Thread.currentThread().getName()).equals("shubham"))
{
Thread.currentThread().yield();
}
else
{
System.out.println(Thread.currentThread().getName()+i);
}
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
		t1.setName("shubham");
		t2.setName("sambhaji");
		t3.setName("shivaji");
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}
}
