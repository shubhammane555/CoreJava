abstract class circle
{
int r;
public void setradius(int x)
{
r=x;
}
abstract public void area();
}
class ncircle extends circle
{
public void circum()
{
double cir=2*3.14*r;
System.out.println("circumference of circle"+cir);
}
public void area()
{
double a=3.14*r*r;
System.out.println("area of circle "+a);
}
}
class stest
{
	public static void main(String []args)
	{
		ncircle c1=new ncircle ();
		c1.setradius(7);
		c1.circum();
		c1.area();
	}
}
