import javax.swing.*;
class prime
{
public static void main(String []args)
{
int temp=0;
String num=JOptionPane.showInputDialog("enter value");
int a =Integer.parseInt(num);

for (int i=2;i<=a-1;i++)
{
if (a%i==0)
{
temp=temp+1;
}
}

if (temp==0)
{
	System.out.println(a+"is prime no");
}

else
{
System.out.println(a+"is not prime no");
}
}
}