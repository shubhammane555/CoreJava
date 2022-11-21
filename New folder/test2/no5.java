class student
{
private String sname,branch;
private int rollno,marks;

public student ()
{
sname="shubham";
branch = "etc";
rollno=111;
marks=555;
}
public void showdata()
{
System.out.println("student name is "+sname);
System.out.println("branch is "+branch);
System.out.println("roll no is "+rollno);
System.out.println("marks  is "+marks);
}
}
class abc
{
public static void main(String []args)
{

student s1;
s1=new student();
s1.showdata();


student s2;
s2=new student();
s2.showdata();
}
}
