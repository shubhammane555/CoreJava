import javax.swing.*;
class abc
{
public static void main (String []args)
{
int d,e, tbill =0;
do
{
String a = JOptionPane.showInputDialog(" product name");
String b = JOptionPane.showInputDialog(" product qty");
String c = JOptionPane.showInputDialog(" product price");
 d = Integer.parseInt(b);
 e = Integer.parseInt(c);
int bill = d * e;
 tbill = tbill + bill; 
 if (bill >0)
 {
 System.out.println(" product name is "+a+"\n qty is "+d+"\n price is" +e+"\n bill is "+bill);
 
 }
}

 while (e!=0);
 {
  System.out.println(" final bill is "+tbill);
  }
  }
  }
  
 