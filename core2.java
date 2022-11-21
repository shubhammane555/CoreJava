import javax.swing.*;
class employee
{
private String name;
private int wages;
private int wdays;


public void setdata()
{
name =JOptionPane.showInputDialog(" enter name");
String wa =JOptionPane.showInputDialog(" enter wages");
String wd =JOptionPane.showInputDialog(" enter working days");
wages =Integer.parseInt(wa);
wdays =Integer.parseInt(wd);
}
public void showdata()
{
System.out.println("name is "+name);
System.out.println("wages is "+wages);
System.out.println("working days is "+wdays);
}

public void payment()
{
int pay = wages * wdays;
if (pay>25000)
{
double gst = pay * 0.18;
double fpay = pay - gst;
System.out.println("before gst is "+pay+ " after gst is "+fpay+ "gst is"+gst);
}
else 
{
System.out.println("payment is "+pay);
}
}
}
class abc 
{
public static void main (String [] args)
{
employee e1;
e1 =new employee();
e1.setdata();
e1.showdata();
e1.payment();

}
}