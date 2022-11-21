import java.util.Scanner;

class demo
{
String cal(float per,boolean p)
{
if(p)
{
return "Fail";
}
else if(per>=70 && per<=100)
{
return "Distinction";
}

else if(per>=60 && per<70)
{
return "Firstclass";
}
else if(per>=50 && per<60)
{
return "secandclass";
}
else if(per>=35 && per<50)
{
return "thirdclass";
}
else
{
return "fail";
}
}
}

class demo1
{
public static void main(String []args)
{
Scanner s=new Scanner(System.in);
System.out.println("enter phy mark");
int m1=s.nextInt();
System.out.println("enter che mark");
int m2=s.nextInt();
System.out.println("enter math mark");
int m3=s.nextInt();
System.out.println("enter eng mark");
int m4=s.nextInt();

boolean p=false;
if((m1>=0 && m1<=100) &&(m2>=0 && m3<=100) &&(m4>=0 && m4<=100))
{
if(m1<=34 || m2<=34 || m3<=34 || m4<=34)
{
p=true;
}
int total=m1+m2+m3+m4;
float per=(float)total/4;
System.out.println("phy mark is"+m1);
System.out.println("che mark is"+m2);
System.out.println("math mark is"+m3);
System.out.println("eng mark is"+m4);
System.out.println("total mark is"+total);
System.out.println("percentage  is"+per);
System.out.println("set boolean  is"+p);

demo ob=new demo();
String result=ob.cal(per,p);
System.out.println("result is"+result);
}
else
{
System.out.println("invalid mark ");
}
}
}





