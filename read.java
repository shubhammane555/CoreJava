import javax.swing.*;
class Read
{
public static void main ( String []args)
{
String ename =JOptionPane.showInputDialog("enter employee name ");
String wages =JOptionPane.showInputDialog("enter wages ");
int w = Integer.parseInt(wages);
String wdays =JOptionPane.showInputDialog("enter working days ");
int wd = Integer.parseInt(wdays);
int pay = w*wd;
System.out.println( " employee name is "+ename);
System.out.println( " employee wages is "+wages);
System.out.println( " employee working days is "+wdays);
System.out.println( " employee total paymeny is "+pay);
}
}