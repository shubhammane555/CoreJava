class baseclass
{
public void methodI()

{
System.out.println("hey i am base class ");
}
}
class child extends baseclass
{
public void methodI()
{
System.out.println("hey i am child class ");
}
}

class abc
{
public static void main(String[]args)
 
{
child c1;
c1=new child();
c1.methodI();

baseclass b1;
b1=new baseclass();
b1.methodI();

baseclass b2;
b2=new child();
b2.methodI();
}
}
