class textarea
{
public void area(int r)
{
double a=3.14*r*r;
System.out.println("area of circle is "+a);
}
public void area(int l,int b)
{
int ra= l*b;
System.out.println("area of rectangle is "+ra);
}
public void area(int l,int b,int h)
{
int v =l+b+h;
System.out.println("volum is "+v);
}
}
class abc
{
public static void main(String[]args)
{
textarea t1;
t1=new textarea ();
t1.area(10);
t1.area(10,20);
t1.area(10,20,30);
}
}


