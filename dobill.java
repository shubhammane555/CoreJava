import javax.swing.*;
class dobill
{
public static void main ( String []args)
{
int price,qty,bill,tbill=0;
do
{
String pname =JOptionPane.showInputDialog(" enter product ");
String p1 =JOptionPane.showInputDialog(" enter product price ");
String p2 =JOptionPane.showInputDialog(" enter product qty ");
 price= Integer.parseInt(p1);
qty= Integer.parseInt(p2);
bill =  price * qty;
tbill = tbill + bill;
if ( price > 0)
{
	System.out.println ( " product name " +pname+ "\n price "+p1+"\n qty "+p2+"\n bill "+bill);
}
}
while (price!=0);
{
System.out.println ( " sum of all enterd value "+tbill);
}
}
}
