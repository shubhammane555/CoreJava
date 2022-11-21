class employee
{
private String ename;
private int wages,wdays;

public void setdata(String en,int wa,int wd)
{
ename = en;
wages =wa;
wdays = wd;
}
public void showdata()
{
System.out.println("length is "+ename);
System.out.println("breath is "+wages);
System.out.println("height is "+wdays);
}
public int payment()
{
int pay = wages * wdays;
return pay;
}
}

class abc 
{
public static void main(String []args)
{
 employee e1;
 e1=new employee();
 e1.setdata("shhubham",500,30);
 e1.showdata();
 int ev1 =e1.payment();
 System.out.println("payment 1 st employee "+ev1);
 
 employee e2;
 e2=new employee();
 e2.setdata("suraj",300,30);
 e2.showdata();
 int ev2 =e2.payment();
 System.out.println("payment 2 st employee"+ev2);
 
 employee e3;
 e3=new employee();
 e3.setdata("sham",600,30);
 e3.showdata();
 int ev3 =e3.payment();
 System.out.println("payment 3 st employee "+ev3);
	int ev = ev1 + ev2 + ev3;
	System.out.println("payment of 3 employee "+ev);
	}
	}
	