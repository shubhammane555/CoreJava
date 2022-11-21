package com.empstatics;
import java.util.*;

import org.apache.tomcat.util.digester.ArrayStack;

public class employee {
	
	int id,age,yearsofjoining;
	double salary;
	String name,gender,department;
	
	
	employee(int id,int age,int yearofjoining,double salary,String name,String gender,String department )
	
	{ this.id=id;
	this.age=age;
	this.yearsofjoining=yearsofjoining;
	this.salary=salary;
	this.name=name;
	this.gender=gender;
	this.department=department;
	
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public double getSalary()
	{
		return salary;
	}
	public String Gender()
	{
		return gender;
	}
	public String Department() {
		return department;
	}
	public int Yearsofjoining()
	{
		return yearsofjoining;
	}
	
	 public String toString() 
	    {
	        return "Id : "+id
	                +", Name : "+name
	                +", age : "+age
	                +", Gender : "+gender
	                +", Department : "+department
	                +", Year Of Joining : "+yearsofjoining
	                +", Salary : "+salary;
	    }

	public int getOrDefault(String department2, int i) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	 
}
class test{
	

public static void main(String []args)
{
employee e1=new employee(1,23,2003,23000,"shubham","male","devlopment");
employee e2=new employee(2,24,2004,25000,"suraj","male","production");
employee e3=new employee(3,23,2005,26000,"surendra","male","design");
employee e4=new employee(4,23,2006,23000,"deva","male","devlopment");
employee e5=new employee(5,23,2007,23000,"rahul","male","devlopment");

List<employee> a1= Arrays.asList(e1,e2,e3,e4,e5);


HashMap<String,Integer> h1=new HashMap<>();

for(employee x1:a1) {
	h1.put(x1.department,x1.getOrDefault(x1.department,0)+1);
}
	
h1.forEach((k,v)->{
	System.out.println(k+" "+v);
});


}
}