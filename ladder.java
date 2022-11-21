import javax.swing.*;
class ladder 
{
public static void main ( String []args)
{
String num = JOptionPane.showInputDialog( " enter number  ");
int n = Integer.parseInt(num);
if ( n>0)
{
System.out.println(n+"number is positive ");
}
else if ( n<0)
{
System.out.println(n+"number is negative ");
}
else
{
System.out.println(n+"number is zero ");
}
}
}


