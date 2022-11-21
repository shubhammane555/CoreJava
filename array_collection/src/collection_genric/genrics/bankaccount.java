package com.genrics;

public class bankaccount <z extends Accounttype> {
	private z type;
	public bankaccount(z type)
	{
		this.type=type;
	}

	public void showAccounttype()
	{
		System.out.println(type.getClass().getName());
	}
}
