class dmt extends Thread
{
public void run()
{
if (Thread.currentThread().isDaemon())
{
System.out.println(Thread.currentThread().getName() + "jevan vadat ahhe");
}
else
{
System.out.println(Thread.currentThread().getName() + "jevanari pore");
}
}
}
class abc
{
public static void main(String[]args)
{
dmt t1=new dmt();
dmt t2=new dmt();
dmt t3=new dmt();
dmt t4=new dmt();
t1.setName("abhi");
t2.setName("shubham");
t3.setName("suraj");
t4.setName("omkar");
t2.setDaemon(true);
t1.start();
t2.start();
t3.start();
t4.start();
}
}
