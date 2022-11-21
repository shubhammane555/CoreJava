class box
{
private int len,bre,het;

public void setdata(int l,int b,int h)
{
len = l;
bre =b;
het = h;
}
public void showdata()
{
System.out.println("length is "+len);
System.out.println("breath is "+bre);
System.out.println("height is "+het);
}
public int volume()
{
int v = len * bre*het;
return v;
}
}

class abc 
{
public static void main(String []args)
{
 box b1;
 b1=new box();
 b1.setdata(10,20,30);
 b1.showdata();
 int vb1 =b1.volume();
 System.out.println("volume of box b1 is "+vb1);
 
 box b2;
 b2=new box();
 b2.setdata(30,40,50);
 b2.showdata();
 int vb2= b2.volume();
  System.out.println("volume of box b2 is "+vb2);
  int vb = vb1 +vb2;
    System.out.println("addition of two box  is "+vb);
	
	}
	}
	