import javax.swing.*;
class abc
{
public static void main (String []args)
{
String a = JOptionPane.showInputDialog(" enter value");
int b = Integer.parseInt(a);
int c= 1;
while (c<=10)
{
System.out.println(b*c);
c++;
}
}
}