import javax.swing.*;
class abc
{
public static void main(String []args)
{
String p1=JOptionPane.showInputDialog("enter 1st value");
String p2=JOptionPane.showInputDialog("enter 2nd value");
int a=Integer.parseInt(p1);
int b=Integer.parseInt(p2);
System.out.println("value of a is "+a);
System.out.println("value of b is "+b);
int c=a ;
a=b;
b=c;
System.out.println("value of a is "+a);
System.out.println("value of b is "+b);
}
}
