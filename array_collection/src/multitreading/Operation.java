
package com.multitreading;

public class Operation {
	
	int i=0;
	public synchronized void printeven()
	{
		while(this.i<=50)
		{
			if(i%2==0)
			{System.out.println("even"+this.i++);
			notifyAll();
		
			}
			else
			{
				try { wait();}
				catch(InterruptedException e)
				{
					
				}
			}
		}
	}
	


public synchronized void printodd()
{
	while(this.i<=50)
		if(i % 2 != 0) { System.out.println("odd"+this.i++);
		notifyAll();}
		else
		{
			try { wait();}
			catch(InterruptedException e)
			{
			}
			}
	}
}

class evevnodd
{
	public static void main(String []args)
	{
		Operation op=new Operation();
		new Thread()
		{
			public void run()
			{
				op.printeven();
			}
		}.start();
		new Thread()
		{
			public void run() 
			{
				op.printodd();
			}
		}.start();
		
			}
		}
	
