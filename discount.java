import javax.swing.*;
class discount
{
public static void main (String []args)
{
String pname = JOptionPane.showInputDialog( " enter product name ");
String price = JOptionPane.showInputDialog( " enter product price ");
String qty = JOptionPane.showInputDialog( " enter product qty ");
int p = Integer.parseInt(price);
int q = Integer.parseInt(qty);
double bill = p*q;
System.out.println( " produt name is " +pname+ "price is "+price+ " qty is "+qty);
if ( bill >10000)
{
double discount = 0.20 * bill ;
double fdiscount = bill - discount ; 
System.out.println( " discount bill is " +discount+ " final discount bill is "+fdiscount+ " exact bill is "+bill);
}
else
{
System.out.println( " final bill is " +bill);
}
}
}