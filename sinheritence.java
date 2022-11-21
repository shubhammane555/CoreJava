class person
{
private String name,city;

public void setdata(String nm,String ct)
{
name = nm;
city =ct;
}
public void showdata()
{
System.out.println("name is name"+name);
System.out.println("city is city"+city);
}
}
class student extends person
{
private int rollno,marks;
private String branch;

public void setdata(String nm,String ct,String br,int rn,int mr)
{
super.setdata(nm,ct);
rollno=rn;
marks=mr;
branch=br;
}
public void showdata()
{
super.showdata();
System.out.println("roll no is "+rollno);
System.out.println("branch is  "+branch);
System.out.println("marks is "+marks);

}
}

class abc
{
public static void main (String []args)
{
student s1;
s1=new student();
s1.setdata("shubham","kop","etc",55,500);
s1.showdata();

student s2;
s2=new student();
s2.setdata("suraj","sangli","etc",51,550);
s2.showdata();
}
}
