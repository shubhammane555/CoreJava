import javax.swing.*;
class abc
{
public static void main  (String []args)
{
String pn = JOptionPane.showInputDialog(" press a for addition \n press s for sub \n press m for multiplication \n press d for div ");

String p1 = JOptionPane.showInputDialog(" enter value");
String p2 = JOptionPane.showInputDialog(" enter value");
int b =  Integer.parseInt(p1);
int c =  Integer.parseInt(p2);
switch (pn)
{
case "A":
case "a":int d = b+c;
System.out.println(d);
break;

case "S":
case "s":int e = b-c;
System.out.println(e);
break;
case "M":
case "m":int f = b*c;
System.out.println(f);
break;
case "D":
case "d":int g = b/c;
System.out.println(g);
break;
default:System.out.println("invalid code ");
}
}
}

