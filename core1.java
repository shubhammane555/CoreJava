class person
{
private String name;
private String city;

public void setdata(String nm,String c)
{
name = nm;
city=c;
}
public void showdata()
{
System.out.println("name is "+name);
System.out.println("city is "+city);
}
}

class abc
{
public static void main (String [] args)
{
person s1;
s1= new person();
s1.setdata("shubham","kolhapur");
s1.showdata();
}
}
