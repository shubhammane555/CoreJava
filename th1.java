class mythread extends Thread
{
public void run()
{
for (int i=1;i<=a5;i++)
{
System.out.println("child thread running ");
}
}
}
class ptest
{
public static void main(String []args)
{
mythread t1=new mythread();
mythread t2=new mythread();
t1.start();
t2.start();
System.out.println("main thread running ");
}
}
