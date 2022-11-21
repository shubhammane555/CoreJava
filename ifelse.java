import javax.swing.*;
class ifelse
{
public static void main(String []args)
{
String name = JOptionPane.showInputDialog( " candidate name ");
String age  = JOptionPane.showInputDialog( " candidate  age "); 
int a = Integer.parseInt( age );
if (a > 21 )
{
System.out.println(name+" is eligible bcz age is "+a);
}
else
{
System.out.println(name+" is not eligible bcz age is "+a);
}
}
}


