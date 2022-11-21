class student 
{
private int rollno;
private String name ,city;
static String colgnm="SGI";
static void change()
{
colgnm="KIT";
}

public student (int rn,String nm,String c )
{
rollno = rn;
name = nm;
city = c;
}

public void showdata()
{
System.out.println("roll no is "+rollno);
System.out.println(" name is "+name);
System.out.println("city is "+city);
System.out.println("colg name is "+colgnm);
}
}
class abc
{
public static void main (String []args)
{
student.change();
student s1;
s1=new student(101,"mohini","osmanabad");
s1.showdata();

student s2;
s2=new student(102,"pratiksha","sangli");
s2.showdata();

student s3;
s3=new student(103,"shubham","kop");

s3.showdata();
}
}
