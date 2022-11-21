class smt extends Thread
{
public void run()
{
System.out.println(Thread.currentThread().getName());
System.out.println(Thread.currentThread().getPriority());
}
}
class abc
{
public static void main(String []args)
{
smt t1=new smt();
smt t2=new smt();
smt t3=new smt();
t1.setPriority(Thread.MIN_PRIORITY);///////1
t2.setPriority(Thread.NORM_PRIORITY);//5
t3.setPriority(Thread.MAX_PRIORITY);//10
t1.setName("saba");
t2.setName("prasad");
t3.setName("pranoti");
t1.start();
t2.start();
t3.start();
}
}