import java.util.*;
class abc
{
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter no");
int no=s.nextInt();
int fact=1;
for (int a=1;a<=no;a++)
{
 fact=fact*a;
 }
 System.out.println(fact);
 }
 }