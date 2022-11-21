import javax.swing.*;
class Bank
{
public static void main(String []args)
{
String name = JOptionPane.showInputDialog( " candidate name ");
String age  = JOptionPane.showInputDialog( " candidate  age "); 
int a = Integer.parseInt( age );
if (a >= 22 & a <=30 )
{
System.out.println(name+" is eligible for bank exam ");
}
else
{
System.out.println(name+" is not eligible for bank exam ");
}
}
}

