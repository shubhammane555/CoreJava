import javax.swing.*;
class abc
{
public static void main  (String []args)
{
int bal = 7000;
do
{
String pname = JOptionPane.showInputDialog(" product name ");
int a =  Integer.parseInt(pname);
String p1 = JOptionPane.showInputDialog(" product price");
 int b =  Integer.parseInt(p1);
String p2 = JOptionPane.showInputDialog(" product qty");
 int c =  Integer.parseInt(p2);
int t = b*c ;
System.out.println(" product name "+pname+ "\n product price "+b+"\n  product qty "+c  );
}

 while ( bal>t);
 {
 System.out.println("infficient balance");
 }
 }
 }
 
 