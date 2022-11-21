import javax.swing.*;
class rectangle
{
private int l,b;

public rectangle(int x,int y)
{
l=x;
b=y;
}
public void perimeter()
{
int peri = 2*(l+b);
System.out.println("perimeter of rectangle"+peri);
}

public void Area()
{
int A = l*b;
System.out.println("area of rectangle"+A);
}
}
class abc
{
public static void main (String []args)
{
rectangle r1;
String len = JOptionPane.showInputDialog("enter lenth");
String bre = JOptionPane.showInputDialog("enter breth");
int l =Integer.parseInt(len);
int b =Integer.parseInt(bre);
r1 = new rectangle(l,b);
r1.perimeter();
r1.Area();
}
}
