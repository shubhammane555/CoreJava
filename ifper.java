import javax.swing.*;
class perif
{
public static void main ( String []args)
{ 
String name = JOptionPane.showInputDialog( " student name " );
String n1 = JOptionPane.showInputDialog( " math " );
String n2 = JOptionPane.showInputDialog( " phy " );
String n3 = JOptionPane.showInputDialog( " che " );
String n4 = JOptionPane.showInputDialog( " eng " );
String n5 = JOptionPane.showInputDialog( " sci" );
int a = Integer.parseInt( n1 );
int b = Integer.parseInt( n2 );
int c = Integer.parseInt( n3 );
int d = Integer.parseInt( n4 );
int e = Integer.parseInt( n5 );
int total = a +b+c+d+e;
int per = total /5;
if ( per > 75 )
{
System.out.println(name+"pass with disingtion ");
}
else if ( per > 60 )
{
System.out.println(name+"pass with first class ");
}
else if ( per > 50 )
{
System.out.println(name+"pass with second class ");
}
else if ( per > 40 )
{
System.out.println(name+"pass with pass ");
}
else
{
System.out.println(name+"fail ");
}
}
}
