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

System.out.println("id of thread t1 " + t1.getId());
System.out.println("id of thread t2 " + t2.getId());
System.out.println("id of thread t3 " + t3.getId());
t1.start();
t2.start();
t3.start();
}
}