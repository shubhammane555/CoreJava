class bbb extends Thread

{
	static Thread mainth;
public void run()
{
try
{
mainth.join();
for(int i=1;i<=5;i++)
{
System.out.println("child thread "+i);
Thread.sleep(1000);
}
}
catch(Exception e)
{
System.out.println(e);
} 
}
public static void main(String[] args)
{
mainth=Thread.currentThread();

bbb b=new bbb();
b.start();
try{
	
for(int i=1;i<=5;i++)
{
System.out.println("mainthread "+i);
Thread.sleep(1000);
}
}
catch(Exception e)
{
System.out.println(e);
} 
}
}