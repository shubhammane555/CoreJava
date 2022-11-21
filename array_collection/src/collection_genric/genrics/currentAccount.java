package com.genrics;

public class currentAccount implements Accounttype {
	public <u extends Number>void deposite(u amount)
	{
		System.out.println("amount deposited"+amount);
		
	}

	public <u extends Number>void withdraw(u amount)
	{
		System.out.println("amount withdraw"+amount);
		
	}
	public void showbalence()
	{
		System.out.println("available balence is 1000");
	}

}
