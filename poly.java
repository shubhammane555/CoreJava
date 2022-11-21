  class addition
{
public void sum(int a,int b)
{
int s= a+b;
System.out.println("sum is "+s);
}
public void sum(int a, int b,int c)
{
int s= a+b+c;
System.out.println("sum is "+s);
}
}
class stest
{
public static void main(String []args)
  {
  addition a1;
  a1=new addition();
  a1.sum(10,20);
  a1.sum(10,20,30);
  }
  }
  
   