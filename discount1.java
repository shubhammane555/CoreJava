import javax.swing.*;
class abc
{
public static void main  (String []args)
{
String pname = JOptionPane.showInputDialog(" enter product");
String p1 = JOptionPane.showInputDialog(" enter price");
String p2 = JOptionPane.showInputDialog(" enter qty");
int a =  Integer.parseInt(p1);
int b =  Integer.parseInt(p2);
double total = a*b;
if ( total > 20000)
{
double discount = total * 0.20  ;
double fdis = total - discount;
System.out.println(fdis);
}
else
{
System.out.println(" no discount");
}
}
}
