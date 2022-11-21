class student 
{
private int rollno;
private String name;
private String branch;
private int marks;

public void setdata(int rn,String nm,String br,int mr)
{
rollno = rn ;
name =nm;
branch = br;
marks= mr;
}
public void showdata ()
{
System.out.println("name is "+name);
System.out.println("roll no is "+rollno);
System.out.println("branch is "+branch);
System.out.println("marks is "+marks);
}
}

class stest 
{
public static void main (String []args)
{
student s1;
s1 = new student();
s1.setdata(101,"shubham","etc",555);
s1.showdata();

student s2;
s2 = new student();
s2.setdata(102,"suraj","etc",551);
s2.showdata();
}
}
