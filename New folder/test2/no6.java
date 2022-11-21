import javax.swing.*;
class student
{
private String sname,branch;
private int rollno,m1,m2,m3,m4,m5;

public void setdata ()
{
sname =JOptionPane.showInputDialog("enter student name");
String r =JOptionPane.showInputDialog("enter student roll no");
rollno=Integer.parseInt(r);
String ma1 =JOptionPane.showInputDialog("enter phy marks");
m1=Integer.parseInt(ma1);
String ma2 =JOptionPane.showInputDialog("enter che marks");
m2=Integer.parseInt(ma2);
String ma3 =JOptionPane.showInputDialog("enter math marks");
m3=Integer.parseInt(ma3);
String ma4 =JOptionPane.showInputDialog("enter eng marks");
m4=Integer.parseInt(ma4);
String ma5 =JOptionPane.showInputDialog("enter sci marks");
m5=Integer.parseInt(ma5);

}
public void showdata()
{
System.out.println("student name is "+sname);
System.out.println("roll no is "+rollno);
System.out.println("marks phy is "+m1);
System.out.println("marks che is "+m2);
System.out.println("marks math is "+m3);
System.out.println("marks eng is "+m4);
System.out.println("marks sci is "+m5);
}
public void percentage()
{
double total = m1+m2+m3+m4+m5;
double per = total/5;
if (per>60)
{
System.out.println("student is 1 st class" );
}
else if (per<60)
{
System.out.println("student is 2nd  class ");
}
else
{
System.out.println("fail" );
}
}
}

class abc
{
public static void main(String []args)
{

student s1;
s1=new student();
s1.setdata();
s1.showdata();
s1.percentage();


}
}
