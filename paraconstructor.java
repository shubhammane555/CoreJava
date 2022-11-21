class circle
{
private int r;

public circle (int x)
{
r=x;
}
public void area ()
{
double A = 3.14*r*r;
System.out.println(" area of circle"+A);
}
}
class abc
{
public static void main(String[]args)
{
circle c1;
c1=new circle(10);
c1.area();
}
}
