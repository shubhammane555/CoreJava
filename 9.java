import javax.swing.*;
class abc
{
public static void main(String [] args)
{
int n,sum=0;
do 
{
String num=JOptionPane.showInputDialog("value");
n =Integer.parseInt(num);
sum =sum+n;
}
while(n!=0);
{
System.out.println("sum of all"+sum);
}
}
}
