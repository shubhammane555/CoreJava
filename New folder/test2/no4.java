class pen
{
private String cname;
private int price;
static String model="xxx";
static void change()
{
model="yy";
}
public pen (String cn,int pr)

{
cname=cn;
price = pr;
}
public void showdata()
{
System.out.println("company name is "+cname);
System.out.println("company model is "+model);
System.out.println("model price is "+price);
}
}
class abc
{
public static void main(String []args)
{
pen.change();
pen p1;
p1=new pen("maruti",50000);
p1.showdata();
}
}

