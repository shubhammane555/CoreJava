import javax.swing.*;
class ifdisc
{
public static void main ( String []args)
{ 
String pname = JOptionPane.showInputDialog( " product name " );
String price = JOptionPane.showInputDialog( " price " );
String qty = JOptionPane.showInputDialog( " qty " );
int a = Integer.parseInt( price );
int b = Integer.parseInt( qty );
double total = a *b ;
if ( total > 10000)
{
double x = total * 0.20;
double fdiscount = x - total ;
System.out.println(pname+"20 per discount "+fdiscount);
}
else if  ( total > 5000)
{
double y = total * 0.10;
double fdiscount1 = y - total ;
System.out.println(pname+"10 per discount "+fdiscount1);
}
else 
{
System.out.println(pname+" no discount ");
}
}
}
