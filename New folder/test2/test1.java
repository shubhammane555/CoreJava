import javax.swing.*;
class student 
{
private String cname,model;
private int price;
static String gear ="auto";
 static void change()
{
gear="normal";
}
 public void setdata()
 {
 cname=JOptionPane.showInputDialog("enter car name");
 model=JOptionPane.showInputDialog("enter car model");
 String p=JOptionPane.showInputDialog("enter car price");
 price=Integer.parseInt(p);
 }
 public void showdata()
 {
 System.out.println("car name is "+cname);
 System.out.println("car name is "+model);
 System.out.println("car name is "+price);
  System.out.println("car name is "+gear);
 }
 }
 class abc
 {
 public static void main(String[]args )
 {
 student.change();
 student s1;
 s1=new student();
 s1.setdata();
 s1.showdata();
 }
 }