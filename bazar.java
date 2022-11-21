import javax.swing.*;
class bazar
{
public static void main ( String[]args)
{
String pn = JOptionPane.showInputDialog("enter product name");
String price = JOptionPane.showInputDialog("enter price");
int p = Integer.parseInt(price);
String qty = JOptionPane.showInputDialog("enter qty");
int q = Integer.parseInt(qty);
int bill = p *q;
System.out.println("product name is " +pn+"\n price is "+p+"\n qty is "+q+"\n bill is "+bill);
}
}


