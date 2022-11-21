import javax.swing.*;
class doo
{
public static void main ( String []args)
{
int n,sum=0;
do
{
String num =JOptionPane.showInputDialog(" enter number ");
n = Integer.parseInt(num);
sum = sum + n;
}
while (n!=0);
{
System.out.println ( " sum of all enterd value "+sum);
}
}
}