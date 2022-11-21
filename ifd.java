import javax.swing.*;
class ifd
{
public static void main(String []args)
{
String ename = JOptionPane.showInputDialog( " employee name ");
String wages  = JOptionPane.showInputDialog( " employee  wages "); 
String wdays  = JOptionPane.showInputDialog( " employee  working days "); 
int wg = Integer.parseInt( wages );
int wd = Integer.parseInt( wdays );
double pay = wd*wg ;

System.out.println(ename+wages+wdays);
if (pay >= 25000 )
{
double fpay = pay * 0.82;
double gst = pay * 0.18;
System.out.println(" payment before gst " +pay+ " payment after gst " +fpay+ "gst value "+gst);
}
else 
{
System.out.println("payment is "+pay);
}
}
}
