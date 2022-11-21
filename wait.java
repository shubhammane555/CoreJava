class totale extends Thread
{
int total=0;
public void run()
{
synchronized(this)	
{
for(int i=1;i<=10;i++)
{
total=total+100;
}
this.notify();
}
}
}
class movie 
{
public static void main(String[]args) throws InterruptedException
{
totale t=new totale();
t.start();


synchronized(t)
{
	t.wait();
	System.out.println("total earnings"+t.total);
}
}

}