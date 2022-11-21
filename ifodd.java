import javax.swing.*;
class ifodd
{
public static void main ( String []args)
{ 
String num = JOptionPane.showInputDialog( " enter num " );
int a = Integer.parseInt( num );
while ( a >= 1 )
{
System.out.println(a);
a = a-3;
}
}
}

