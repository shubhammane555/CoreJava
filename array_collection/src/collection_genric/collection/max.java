package com.collection;
import java.util.*;



	class max
	{
	static void count(int a[])
	{
	int num=0;
	int no=0;
	int no1=0;
	int no2=0;
	int arr[]=new int[a.length];
	for (int i=0;i<a.length;i++)
	{
		
		 num=0;
		
		for(int j=0;j<a.length;j++)
		{
	if(a[i]==a[j])
	{

	num++;

	}
	else
	{
		System.out.println("not equal");
	}
	
	}
		arr[no++]=num;

	}
	
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i] + "");
	}
	}
	public static void main(String[]args)
	{
	int a[]={10,10,10,20};
	count(a);
	}
	}


