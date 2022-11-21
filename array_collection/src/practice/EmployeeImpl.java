package com.shubham.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Employee {

	int id, age, yearsofjoining;
	double salary;
	String name, gender, department;

	Employee(int id, int age, int yearofjoining, double salary, String name, String gender, String department)

	{
		this.id = id;
		this.age = age;
		this.yearsofjoining = yearsofjoining;
		this.salary = salary;
		this.name = name;
		this.gender = gender;
		this.department = department;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	public String getGender() {
		return gender;
	}
	

	public String getDepartment() {
		return department;
	}

	public int Yearsofjoining() {
		return yearsofjoining;
	}

	public String toString() {
		return "Id : " + id + ", Name : " + name + ", age : " + age + ", Gender : " + gender + ", Department : "
				+ department + ", Year Of Joining : " + yearsofjoining + ", Salary : " + salary;
	}



}

class EmployeeImpl {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, 23, 2003, 23000, "shubham", "male", "development");
		Employee e2 = new Employee(2, 24, 2004, 25000, "suraj", "male", "production");
		Employee e3 = new Employee(3, 23, 2005, 26000, "surendra", "male", "design");
		Employee e4 = new Employee(4, 23, 2006, 23000, "deva", "male", "development");
		Employee e5 = new Employee(5, 23, 2007, 23000, "rahul", "male", "development");
		Employee e6 = new Employee(6, 23, 2007, 23000, "rahul", "female", "development");


		List<Employee> a1= Arrays.asList(e1,e2,e3,e4,e5,e6);
		
		// count department and employee in that dept
		
		HashMap<String, Integer> h1 = new HashMap<>();

		for (Employee x1 : a1) {
			h1.put(x1.department, h1.getOrDefault(x1.department, 0) + 1);
		}
		
		
		h1.forEach((k,v)-> {System.out.println(k+""+v);});
		
		
		//avg sal for male and female
		
		int femalecnt=0;
		int malecnt=0;
		double femalesal=0;
		double malesal=0;
		for(Employee x:a1)
		{
			if(x.Gender().equals("male"))
			{	malecnt++;
			malesal += x.getSalary();
		}
		else {
			
		
			femalecnt++;
			femalesal += x.getSalary();
		}}
		double a=femalesal/femalecnt;
		double b=malesal/malecnt;
		System.out.println("female avg sal"+a+"male avg sal"+b);
		
	//get details of highest paid employee
		
		double maxsal=Double.MIN_VALUE;
		
		Employee details=null;
		for(Employee emp:a1)
		{ if(maxsal<emp.getSalary())
		{
			maxsal=emp.getSalary();
			details=emp;
		}
		}
		System.out.println(details);
		}
		
	// get the avg of age of each dept
	Map<String,List<Employee>> avg=new HashMap<>();
	
	for(Employee a:a1)
	{
		if(avg.containsKey(a.getDepartment()))
		{
			List<Employee> list=avg.get(a.getDepartment());
			list.add(a);
		
			avg.put(a.getDepartment(),list)
		}
		else
		{
			List<Employee>list=new ArrayList<>();
			list.add(a);
			
			avg.put(a.getDepartment(), list);
		}
		}
	

//Map<String,List<Employee>> xx=new HashMap<>();
//for(Employee a:a1)
//{
//	if(xx.containsKey(a.gender)) {
//		List<Employee> list = xx.get(a.gender);
//		list.add(a);
//		xx.put(a.gender, list);
//	}else {
//		List<Employee> list = new ArrayList<>();
//		list.add(a);
//		xx.put(a.gender, list);
//	}
//
//}
//xx.forEach((k,v)->{
//	System.out.println(k+" "+v.size());
//});




	}

