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
if((i>5)&& (Thread.currentThread().getName()).equals("saba"))
{
Thread.currentThread().yield();
}
else
{
System.out.println(Thread.currentThread().getName()+ "ne apla chikan cha" +i+" piese khaala ahe");
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
		t1.setName("saba");
		t2.setName("prasad");
		t3.setName("pranoti");
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}
}
