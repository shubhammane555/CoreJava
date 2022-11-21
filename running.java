class smt extends Thread 
{
public void run()
{
System.out.println("function is running");
}
}
class abc
{
public static void main(String []args)
{
smt t1=new smt();
smt t2=new smt();
smt t3=new smt();
System.out.println("before naming thread name of t1 is "+t1.getName());
System.out.println("before naming thread name of t2 is "+t2.getName());
System.out.println("before naming thread name of t3 is "+t3.getName());
t1.setName("saba");
t2.setName("prassad");
t3.setName("pranoti");
System.out.println("after naming thread name of t1 is "+t1.getName());
System.out.println("after naming thread name of t2 is "+t2.getName());
System.out.println("after naming thread name of t3 is "+t3.getName());
t1.start();
t2.start();
t3.start();
}
}
