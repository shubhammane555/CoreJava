package com.collection;

import java.util.ArrayList;
import java.util.List;



 class collection {

private String fname,lname;
private long empid;

collection(long empid,String fname,String lname)
{
	this.empid=empid;
this.fname=fname;
this.lname=lname;

}
public long getempid()
{
	return empid;
}
	
	public void setempid(long empid)
	{
		this.empid=empid;
		
	}
	
	public String getfname()
	{
		return fname;
	}
	
	public void setfname(String fname)
	{
		this.fname=fname;
	}
	
	public String getlname()
	{
		return lname;
	}
	public void setlname(String lname)
	{
		this.lname=lname;
	}
	
	
	public String toString()
	{
		return "collection[empid="+empid+"fname="+fname+"lname="+lname+"]";

}
		public boolean isEqual(collection other)
		{
			if(other==null || !(other instanceof collection))
			{
				return false;
			}
			
			return this==other || (this.empid==other.empid && this.fname==other.fname && this.lname.equals(other.lname));
		}
	
		}
 class collectionmain
{
	public static void main(String[]args)
	{
		List<collection> l1=new ArrayList<>();
		
		l1.add(new collection(1, "sdm", "dvm"));
		l1.add(new collection(2,"xxx","zzz"));
		l1.add(new collection(1,"sdm","dvm"));
		l1.forEach(System.out::println);
		System.out.println(l1.get(0).isEqual(l1.get(2)));
		
		
		
	}
}
