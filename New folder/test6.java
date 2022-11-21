import javax.swing.*;
class abc
{
public static void main ( String []args)
{
String ab = JOptionPane.showInputDialog(" press a for addition \n press b for sub \n prss d for div \n press m for mul");
String bc = JOptionPane.showInputDialog("enter 1st value ");
String cd = JOptionPane.showInputDialog("enter 2nd value ");
int a1 =Integer.parseInt(bc);
int a2 =Integer.parseInt(cd);

switch(ab)
{
case "A":
case "a":int a3 = a1 + a2;
System.out.println(a3);
break;

case "B":
case "b":int a4 = a1 - a2;
System.out.println(a4);
break;

case "C":
case "c":int a5 = a1 / a2;
System.out.println(a5);
break;

case "D":
case "d":int a6 = a1 * a2;
System.out.println(a6);
break;

default:System.out.println("error");

}
}
}

