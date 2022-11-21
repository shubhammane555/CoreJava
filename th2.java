class myrunnable implements Runnable
{
public void run()
{
for (int i=1;i<=5;i++)
{
System.out.println("child thread running ");
}
}
}
class ptest
{
public static void main(String []args)
{
myrunnable r1=new myrunnable();

Thread t1 =new Thread(r1);
Thread t2 =new Thread(r1);
t1.start();
t2.start();
System.out.println("main thread running ");
}
}
