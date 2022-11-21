import javax.swing.*;
class bonus
{
public static void main (String []args)
{
String lname = JOptionPane.showInputDialog( " enter labour name ");
String wages = JOptionPane.showInputDialog( " enter labour wages ");
String wday = JOptionPane.showInputDialog( " enter labour working days ");
int ws = Integer.parseInt(wages);
int wd = Integer.parseInt(wday);
double bonus = ws*wd;
System.out.println( " labour name is " +lname+ "labour wages"+wages+ " labour working days  "+wday);
if ( wd >10)
{
double fbonus = bonus * 0.10 ;
double cbonus = fbonus + bonus;
System.out.println( " currnt bouns is " +fbonus+ " final bonus is "+cbonus+ " exact bonus is "+bonus);
}
else
{
System.out.println( " final bouns is " +bonus);
}
}
}