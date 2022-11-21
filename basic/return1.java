class demo
{
int add(int x,int y)
{
int z=x+y;
return z;
}
float avg(int x,int y)
{
float z=(float)(x+y)/2;
return z;
}

public static void main(String []args)
{
int v1=10;
int v2=2;

demo ob=new demo();
int r1=ob.add(v1,v2);
float r2=ob.avg(v1,v2);

System.out.println("addition"+r1);
System.out.println("avaerag"+r2);
}
}
