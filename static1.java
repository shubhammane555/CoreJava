class employee
{
private String ename;
private String city,job;
private int number , salary;
static String company ="l&t";
static void change()
{
company = "bharatmotar";
}
public employee(int no,int sl,String j,String c,String nm)
{
ename =nm;
number=no;
salary=sl;
job =j;
city=c;
}
public void showdata()
{
System.out.println("employee name"+ename);
System.out.println("employee no"+number);
System.out.println("employee city"+city);
System.out.println("employee job"+job);
System.out.println("employee salary"+salary);
System.out.println("employee company"+company);
}
}

class abc
{
public static void main(String []args)
{
employee.change();
employee e1;
e1=new employee(10,20000,"etc","kop","shubham");
e1.showdata();
}
}