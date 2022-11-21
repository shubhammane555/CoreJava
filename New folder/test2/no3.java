class pen
{
private String cname,model;
private int price;

public void setdata(String cn,String mo,int pr)
{
cname=cn;
model=mo;
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
pen p1;
p1=new pen();
p1.setdata("maruti","zen",500000);
p1.showdata();
}
}

