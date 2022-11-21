import javax.swing.*;
class abc 
{
public static void main (String []args)
{
String ab = JOptionPane.showInputDialog(" product name");
String bc = JOptionPane.showInputDialog("product price ");
String cd = JOptionPane.showInputDialog("product qty");
int a1 =Integer.parseInt(bc);
int a2 =Integer.parseInt(cd);
double  bill= a1 * a2;
if (bill > 20000)
{
double dis20 = bill * 0.20;
double fdis20= bill - dis20;
System.out.println(fdis20);
}
else if (bill > 10000)
{
double dis10 = bill * 0.10;
double fdis10= bill -dis10;
System.out.println(fdis10);
}
else if (bill > 5000)
{
double dis05 = bill * 0.05;
double fdis05= bill -dis05;
System.out.println(fdis05);
}
else 
{
System.out.println(" no discount");
}
}
}
