package com.multitreading;



/// part 1
public class Height {
	int feet,inches;
	
	public Height(int feet ,int inches)
	{
		this.feet=feet;
		this.inches=inches;
		
	}
	
	public String toString()
	{
		return "Height [feet="+feet+ ",inches="+inches+"]";
	}

}
////prt2

abstract class Student
{
	String name;
	Height height;
	String branch;


Student ()
{
}
public Student(String name,Height height)
{
	this.name=name;
	this.height=height;
}



public int comparebyHeight(Student s1,Student s2)
{
	if(s1.height.feet > s2.height.feet)
	{
		return 1; }
	else if(s1.height.feet < s2.height.feet)
	{
		return -1; }
	else 
	{
		if(s1.height.inches < s2.height.inches)
		return -1;
	
	else if(s1.height.inches > s2.height.inches)
	{
		return 1;
	}
	else
	{ return 0; }
}
}

	


public String toString()
{
	return "Student[branch=" +branch+",height ="+height+",name="+name+"]";
	
}

}

///part3

class EEEstudent extends Student {
	EEEstudent() {
}

public EEEstudent (String name,Height height)
{
	super(name,height);
	this.branch="EEE";
}

}
//
class ECEstudent extends Student {
	ECEstudent() {
}

public ECEstudent (String name,Height height)
{
	super(name,height);
	this.branch="ECE";
}

}
//
class CSEstudent extends Student {
	CSEstudent() {
}

public CSEstudent (String name,Height height)
{
	super(name,height);
	this.branch="CSE";
}



// 

 Class Studentadmin()
{
	EEEstudent e= new EEEstudent();
	Student students[];	

	public Student[] getstudents()
	{
		return students();
	}
	
	public void setStudents(Student[] students)
	{
		this.students=students;	
	}
	
	public Studentadmin(Student[] students)
	{
		this.students=students;
	}
	
	public void sortbyHeight(Student s[])
	{
		int n=s.length;
		(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(e.comparebyHeight(s[i],s[j])<0)
				{
					Student temp=s[i];
					s[j]=temp;
				}
			}
		}
	}
}
/////////////////////////
public void displaysortedEEEstudents()
{
	ArrayList<Student> eee=new ArrayList<>();
	for(int i=0;i<students.length;i++)
	{
		if(students[i].branch.equals("EEE"))
		{
			eee.add(students[i]);
		}
	}
	
	Student a[] =eee.toArray(new Student[eee.size()]);
	sortbyHeight(a);
	int i=0;
	
	synchrinized (this)
	{
		while(i<a.length)
		{
			System.out.println((i+1)+":"+a[i++]);
			notifyAll();
			
			try {
				wait();
			}catch(InterruptedException e)
			{
			}
			
			 
			}
	
		}
		}
	
