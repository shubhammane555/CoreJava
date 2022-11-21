class smt extends Thread
{
public void run()
{
System.out.println("thread is running");

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
t2.setPriority(Thread.MAX_PRIORITY);//10
System.out.println("Priority of thread t1 " + t1.getPriority());
System.out.println("Priority of thread t2 " + t2.getPriority());
System.out.println("Priority of thread t3 " + t3.getPriority());
t1.start();
t2.start();
t3.start();
}
}