import javax.swing.*;
class person
{
private String name ,city;

public void setdata()
{
name =JOptionPane.showInputDialog("enter person name");
city =JOptionPane.showInputDialog("enter person city");
}
public void showdata()
{
System.out.println("name is "+name);
System.out.println("city is "+city);
}
}
class empolyee extends person
{
private String empid,job;
private int sal;

public void setdata()
{
super.setdata();
empid=JOptionPane.showInputDialog("enter emp id ");
job =JOptionPane.showInputDialog("enter job  ");
String s1 =JOptionPane.showInputDialog("enter salary");
sal=Integer.parseInt(s1);
}
public void showdata()
{
super.showdata();
System.out.println("emp id is "+empid);
System.out.println("job is "+job);
System.out.println("salary is "+sal);
}
}
class manager extends empolyee
{
private String mname,deptname;
private int com;

public void setdata()
{
super.setdata();
mname=JOptionPane.showInputDialog("enter manager name ");
deptname =JOptionPane.showInputDialog("enter dept name  ");
String s1 =JOptionPane.showInputDialog("enter comission");
com=Integer.parseInt(s1);
}
public void showdata()
{
super.showdata();
System.out.println("manager name "+mname);
System.out.println("dept name "+deptname);
System.out.println("comission is "+com);
}
}
class abc
{
public static void main(String []args)
{
manager m1;
m1=new manager();
m1.setdata();
m1.showdata();

}
}

