import javax.swing.*;
class ptable
{
public static void main ( String []args)
{
String n1 = JOptionPane.showInputDialog( " enter number  ");
int a = Integer.parseInt(n1);
int b = 1;

while ( b <=  10 )
{
System.out.println(a*b);
b++;
}
}
}