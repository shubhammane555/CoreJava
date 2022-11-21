package com.genrics;

public class savaingaccount implements Accounttype{
	public <u extends Number>void deposite(u amount)
	{
		System.out.println("amount deposited"+amount+"rs");
		
	}

	public <u extends Number>void withdraw(u amount)
	{
		System.out.println("amount withdraw"+amount+"rs");
		
	}
	public void showbalence()
	{
		System.out.println("available balence is (1000+40=1040)");
	}
}

