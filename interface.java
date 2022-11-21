interface std1
{
abstract public void holiday();
}
interface std2
{
abstract public void wday();
}
interface std3
{
abstract public void dresscode();
}
class tcs implements  std1,std2
{
public void holiday()
{
System.out.println("sunday and alternat satuday will be holiday");
}
public void wday()
{
System.out.println("monday to friday will be working day");
}
}
class infy implements std1,std2,std3 
{
public void holiday()
{
System.out.println("saturday and sunday will be holiday");
}
public void wday()
{
System.out.println("monday to friday will be working day");
}
public void dresscode()
{
System.out.println("monday will be dresscode");
}
}

class stest
{
public static void main(String[]args)
{
tcs t1=new tcs();
t1.holiday();
t1.wday();

infy i1=new infy();
i1.holiday();
i1.wday();
i1.dresscode();
}
}