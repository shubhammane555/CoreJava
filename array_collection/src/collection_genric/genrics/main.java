package com.genrics;

public class main {
	public static void main(String[]args)
	{
		savaingaccount s1=new savaingaccount();
		s1.deposite(400);
		
		
		bankaccount<savaingaccount >Accounttypeobj=new bankaccount<>(s1);
		Accounttypeobj.showAccounttype();
		
		bankaccount<currentAccount >Accounttypeobj1=new bankaccount<>(s1);
		Accounttypeobj1.showAccounttype();
	}

}
