class abc extends Thread
{
public void run()
{
for (int i=1;i<=10;i++)
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
}}
}
class bbb
{
public static void main(String []args)
{
abc a1=new abc();
abc a2=new abc();
abc a3=new abc();
a1.start();
a2.start();
a3.start();
}
}
