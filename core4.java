
class mobile
{
private String cname;
private String mname;
private int price;
private int ssize;
private int csize;

public void setdata (String cn,String mn,int pr,int sz,int cz)
{
cname = cn;
mname = mn;
price = pr;
ssize=sz;
csize = cz;
}
public void showdata ()
{
System.out.println("company name is" +cname);
System.out.println("product mode name is" +mname);
System.out.println("product price is" +price);
System.out.println("product screen size is" +ssize);
System.out.println("product camera size is" +csize);
}

}

class abc
{
	public static void main (String []args)
	{
		mobile s1;
		s1= new mobile();
		s1.setdata("honar","7c",10500,4,13);
		s1.showdata();
		
	}
}
