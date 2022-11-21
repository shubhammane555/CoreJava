import javax.swing.*;
class bill
{
private String pname;
private int price ,qty;

public void setdata()
{
pname = JOptionPane.showInputDialog("enter name ");
String p = JOptionPane.showInputDialog("enter price ");
String q = JOptionPane.showInputDialog("enter qty ");
price = Integer.parseInt(p);
qty = Integer.parseInt(q);
}
public void showdata()
{
System.out.println("product name is "+pname);
System.out.println("product price is "+price);
System.out.println("product qty is "+qty);
}
public double bill()
{
int fbill = price * qty;
if (fbill>10000)
{
double discount = fbill * 0.20;
double fdis = fbill -discount;
System.out.println("dispay final bill "+fdis);
return fdis;
}
else 
{
System.out.println("dispay final bill "+fbill);
}
return fbill;
}
}

class abc
{
public static void main(String []args)
{
bill b1;
b1= new bill();
b1.setdata();
b1.showdata();
double vb1= b1.bill();
System.out.println(" 1 st bill is "+vb1);

bill b2;
b2= new bill();
b2.setdata();
b2.showdata();
double vb2= b2.bill();
System.out.println(" 2 st bill is "+vb2);
double vb = vb1 + vb2;
System.out.println(" 2 addition of  bill is "+vb);
}
}




 


