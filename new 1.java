import javax.swing.*;
class atm
{
public Static void main(String[]args)
{

int balence=7000;
String c=JOptionPane.showInputDialog("press D for deposite \n press W for withdraw \n press B for chec k balence \n Prss E for Exist");
case "D":
case "d":String damt=JOptionPane.showInputDialog("enter amount for Deposite");
int da =Integer.parseInt(damt);
balence=balence+da;
System.out.println("after deposite "+da+"your balence is "+balence);
break;
case "W":
case "w":String wamt=JOptionPane.showInputDialog("enter withdraw amount" );
int wa=Integer.parseInt(wamt);
if (wa>balence)
{
System.out.println("insufficient bal");
}
else
{
balence=balence-wa;
System.out.println("after withdraw "+wa+"your balence is "+balence);
}
break;
case "B":
case "b":System.out.println("your balence is "+balence);
break;
case "E":
case "e":System.out.println("exist");
}
}

