//// sleep ,jion,setname ,getname of multithreading question 8 answer


class abc extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
try 
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println(i);
}
}
}
class bbb
{
public static void main(String []args)
{
abc a1=new abc ();
abc a2=new abc();
abc a3=new abc();
a1.setName("shubham");
a2.setName("sambhaji");
a3.setName("shivaji");
System.out.println("after naming thread is "+a1.getName());
System.out.println("after naming thread is "+a2.getName());
System.out.println("after naming thread is "+a3.getName());
a1.start();
try 
{
a1.join(5000);
}
catch(Exception e)
{
System.out.println(e);
}
a2.start();
a3.start();
}
}
