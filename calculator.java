import java.lang.Math;
import java.util.*;

 class calculator
 {
 public static double add(double a,double b)
 {
 return a+b;
 }
 public static double mul(double a,double b)
 {
 return a*b;
 }
 public static double sub(double a,double b)
 {
 return a-b;
 }
 public static double div(double a,double b)
 {
 return a/b;
 }
 public static double exponent(double base,double exponent)
 {
 return Math.pow(base,exponent);
 }
 public static double squareroot(double num)
 {
 return Math.sqrt(num);
 }
 
 public static void main(String[]args)
 {
 Stack<Double> st=new Stack<>();
 Scanner s=new Scanner(System.in);
 
 int choice;
do {
System.out.println("select operation -2.addition \n 3.multiplication \n 4.sub \n 5.div \n 6.exponent \n 7.surt \n 8.show last transaction" );
choice=s.nextInt();
double a=0.0;
double b=0.0;

switch(choice)
{
case 2:
System.out.println("enter 2 values");
a=s.nextDouble();
b=s.nextDouble();
double result=add(a,b);
System.out.println("result is "+result);
st.push(result);
break;

case 3:
System.out.println("enter 2 values");
a=s.nextDouble();
b=s.nextDouble();
double result1=mul(a,b);
System.out.println("result is "+result1);
st.push(result1);
break;

case 4:
System.out.println("enter 2 values");
a=s.nextDouble();
b=s.nextDouble();
double result2=sub(a,b);
System.out.println("result is "+result2);
st.push(result2);
break;

case 5:
System.out.println("enter 2 values");
a=s.nextDouble();
b=s.nextDouble();
double result3=div(a,b);
System.out.println("result is "+result3);
st.push(result3);
break;

case 6:
System.out.println("enter 2 values");
a=s.nextDouble();
b=s.nextDouble();
double result4=exponent(a,b);
System.out.println("result is "+result4);
st.push(result4);
break;

case 7:

System.out.println("enter 2 values");
a=s.nextDouble();

double result5=squareroot(a);
System.out.println("result is "+result5);
st.push(result5);
break;

case 8:
System.out.println("last transaction");
if (st.size() < 3)
{
while(!st.isEmpty())
{ System.out.println(st.pop());}
}else
{ for(int i=0;i<3;i++)
{
System.out.println(st.pop());
}
}
break;

default:
break;
}
System.out.println("enter 1 to continue or 0 to exit");
choice=s.nextInt();
}
while(choice!=0);
s.close();
}
}






 
 
 
 
 
 
 
 
 