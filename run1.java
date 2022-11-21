class rbi 
{
public int roi()
{
return 0;
}
}
class sbi extends rbi
{
public int roi()
{
return 7;
}
}
class boi extends rbi
{
public int roi ()
{
return 8;
}
}
class icici extends rbi
{
public int roi()
{
return 9;
}
}
class axis extends rbi
{
public int roi()
{
return 10;
}
}

class abc
{
public static void main(String[]args)
{
sbi s1;
s1=new sbi();
boi b1;
b1=new boi();
icici i1;
i1=new icici();
axis a1;
a1=new axis();
System.out.println("roi of sbi is" +s1.roi());
System.out.println("roi of boi is" +b1.roi());
System.out.println("roi of icici is" +i1.roi());
System.out.println("roi of axis is "+a1.roi());
}
}








