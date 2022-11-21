class test extends Thread
{
public void run()
{
//System.out.println(Thread.interrupted());
System.out.println(Thread.currentThread().isInterrupted());
try
{
for(int i=1;i<=5;i++)
{
System.out.println("child "+i);
Thread.sleep(1000);
//System.out.println(Thread.interrupted());
}
}
catch(Exception e)
{
System.out.println("thrqad intrrupted"+e);
}
}
public static void main(String[]args)
{
test t=new test();
t.start();
t.interrupt();
}
}
