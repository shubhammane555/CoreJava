class reg extends Thread
{
public void run()
{
try
{
System.out.println("child 1 thread");
Thread.sleep(2000);
System.out.println("child 1 thread completed");
}

catch(Exception e)
{
System.out.println(e);
}
}
}
class drive extends Thread
{
public void run()
{
try
{

System.out.println("child 2 thread");
Thread.sleep(3000);
System.out.println("child 2 thread completed");
}
catch(Exception e)
{
System.out.println(e);
}
}
}
class game extends Thread
{
public void run()
{
try
{

System.out.println("child 3 thread");
Thread.sleep(5000);
System.out.println("child 3 thread completed");
}

catch(Exception e)
{
System.out.println(e);
}
}
}

class abc
{
public static void main(String []args) throws InterruptedException
{
reg r=new reg();
r.start();
r.join();
drive d=new drive();
d.start();
d.join();
game g=new game();
g.start();
}
}