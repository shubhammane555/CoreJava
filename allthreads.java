class abc extends Thread
{
public void run()
{
for(int i=1;i<=10;i++)
{
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
if ((i>7)&&(Thread.currentThread().getName()).equals("xxx"))
{
Thread.currentThread().yield();
}
else
{
System.out.println(Thread.currentThread().getName()+i+"running");
}
}
}
}

class bbb
{
public static void main(String[]args)
{
abc a1=new abc();
abc a2=new abc();
a1.setName("shubham");
a2.setName("xxx");
System.out.println("id a1 is"+a1.getId());
System.out.println("id a2 is"+a2.getId());
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
}
}
