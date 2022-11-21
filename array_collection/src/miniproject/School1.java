package com.miniproject;

import java.util.Scanner;

import java.util.*;
import java.io.*;

 class School1 implements Serializable{
	String teacher,subject;
	int class1;
	
public School1(String teacher,int class1,String subject)
{
	this.teacher=teacher;
	this.class1=class1;
	this.subject=subject;
}

public String toString() {
	
	return teacher+" "+class1+" "+subject;
	}

}

class abc
{
	public static void main(String [] args) throws Exception
	{
		int choice=-1;
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		File file=new File("data.txt");
		ArrayList<School1> a1=new ArrayList<School1>();
		ObjectOutputStream oss=null;
		ObjectInputStream ois=null;
		ListIterator li=null;
		
		if(file.isFile())
		{
			ois =new ObjectInputStream(new FileInputStream(file));
			a1=(ArrayList<School1>)ois.readObject();
			ois.close();
		}
		
		do {
			
			
			System.out.println("1.Insert \n 2.Display \n 3.Search \n 4.Delete \n 5.teacher name by asending \n 0.Exit");
			System.out.println("Enter your choice");
		choice= s.nextInt();
		switch(choice)
		{
		case 1:
			System.out.print("how many record want to store");
			int n=s.nextInt();
			for(int i=0;i<n;i++) {
			System.out.print("Enter teacher name");
		String teacher=s.next();
		
		System.out.print("Enter class name");
		int class1=s1.nextInt();
		
		System.out.print("Enter subject name");
		String subject=s.next();
		
		a1.add(new School1(teacher,class1,subject));
		System.out.print("record added Succesfully \n ");
		}
			oss=new ObjectOutputStream(new FileOutputStream(file));
			oss.writeObject(a1);
			oss.close();
			
		break;
	
		case 2:
			if(file.isFile()) {
				ois =new ObjectInputStream(new FileInputStream(file));
				a1=(ArrayList<School1>)ois.readObject();
				ois.close();
			System.out.println("---------------");
			li=a1.listIterator();
			while(li.hasNext())
				System.out.println(li.next());
			System.out.println("---------------");
			
			System.out.println(a1);
			} else
			{ System.out.println("file not found");}
		break;
		
		case 3:
			if(file.isFile()) {
				ois =new ObjectInputStream(new FileInputStream(file));
				a1=(ArrayList<School1>)ois.readObject();
				ois.close();
				
				boolean found=false;
				System.out.println("enter teacher name to search");
				String teacher=s.next();
				System.out.println("-----------");
				li=a1.listIterator();
				while(li.hasNext()) {
					School1 e=(School1)li.next();
					if(e.teacher.equals (teacher) ){
						System.out.println(e);
					found=true;
				}
				
			}
			if(!found)
				System.out.println("record not found");
			System.out.println("-----------------");
		} else { 
			System.out.println("file not found");}
		
		break;
		
		case 4:
			if(file.isFile()) {
				ois =new ObjectInputStream(new FileInputStream(file));
				a1=(ArrayList<School1>)ois.readObject();
				ois.close();
				
				boolean found=false;
				System.out.println("enter teacher name to delete");
				String teacher=s.next();
				System.out.println("-----------");
				li=a1.listIterator();
				while(li.hasNext()) {
					School1 e=(School1)li.next();
					if(e.teacher.equals (teacher) ){
						li.remove();
					found=true;
				}
				
			}
			if(found) {
				
			 oss=new ObjectOutputStream(new FileOutputStream(file));
			oss.writeObject(a1);
			oss.close();
			
			System.out.println(" record is deleted succesfully ");
			}else {
				System.out.println(" record is not found");
			}
			
			System.out.println("-----------");
			
		} else { 
			System.out.println("file not found");}
		
		break;
		
		case 5:
			if(file.isFile()) {
				ois =new ObjectInputStream(new FileInputStream(file));
				a1=(ArrayList<School1>)ois.readObject();
				ois.close();
				
				Collections.sort(a1,new Comparator<School1>() {
					
					public int compare(School1 s1,School1 s2) {
						return s1.teacher.compareTo(s2.teacher);
					}
				});
				
			System.out.println("---------------");
			li=a1.listIterator();
			while(li.hasNext())
				System.out.println(li.next());
			System.out.println("---------------");
			
			System.out.println(a1);
			} else
			{ System.out.println("file not found");}
		break;
		
		
		}
		}while(choice!=0);
	
}
}