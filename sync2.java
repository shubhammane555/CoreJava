class abc
{

synchronized public void printTable(String n)
{
for (int i=1;i<=10;i++)
{
try
{
Thread.sleep(500);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("i love u "+n);
}
}
}


class myThread1 extends Thread
{
abc t;
myThread1(abc t)
{
this.t=t;
}
public void run()
{
t.printTable("sarvesh");
}
}

class myThread2 extends Thread
{
abc t;
myThread2(abc t)
{
this.t=t;
}
public void run()
{
t.printTable("shubham");
}
}
class test
{
public static void main(String []args)
{
abc b=new abc();
myThread1 t1=new myThread1(b);
myThread2 t2=new myThread2(b);
t1.start();
t2.start();

}
}

