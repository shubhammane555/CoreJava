import javax.swing.*;
class ladd 
{
public static void main ( String []args)
{
String n1 = JOptionPane.showInputDialog( " enter number  ");
String n2 = JOptionPane.showInputDialog( " enter number  ");
int a = Integer.parseInt(n1);
int b = Integer.parseInt(n2);
if ( a>b)
{
System.out.println(a+"number is largest  ");
}
else if ( a<b)
{
System.out.println(b+"number is largest ");
}
else
{
System.out.println("both number are equal ");
}
}
}
