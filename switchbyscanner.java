import java.util.*;
class abc
{
public static void main(String[] args)
{
	String yn;
	do{
Scanner s=new Scanner(System.in);
System.out.println("enter no1");
int no1=s.nextInt();
System.out.println("enter no2");
int no2=s.nextInt();
System.out.println("eneter symbol(+,-,*,/)");
String sym=s.next();
int res;
switch(sym)
{
case "+":res=no1+no2;
System.out.println("Addition is "+res);
break;

case "-":res=no1-no2;
System.out.println("substraction is "+res);
break;

case "*":res=no1*no2;
System.out.println("multiplication is"+res);
break;
case "/":res=no1/no2;
System.out.println("division is "+res);
break;

default:System.out.println("invalid symbol");
break;
}
System.out.println("do u want to continue(press y for yes and n for no)");
yn=s.next();


	}while(yn.equals("y") || yn.equals("Y"));
}
}



