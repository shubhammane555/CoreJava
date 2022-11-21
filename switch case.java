import javax.swing.*;
class ATM
{
public static void main ( String []args)
{
int balance =7000;
String ch = JOptionPane.showInputDialog(" Press D for Deposite \n Press W for Withdraw \n Press B for Check Balence \n Press E for Exit");
switch ( ch)
{
	case "D":
	case "d":String damt =JOptionPane.showInputDialog(" enter amount for deposite ");
	int da = Integer.parseInt(damt);
	balance = balance + da ;
	System.out.println(" after deposite"+da+"your balence "+balance);
	break;
	
	case "W":
	case "w":String wamt =JOptionPane.showInputDialog(" enter amount for deposite ");
	int wa = Integer.parseInt(wamt);
	if ( wa >balance)
	{
		System.out.println(" insufficient balance ");
	}
	else 
	{
		balance = balance - wa;
		System.out.println("  After withdraw "+wa+"balance is "+balance ");
	}
	break;
	case "B":
	case "b":System.out.println(" your balence is "+balance);
	break;
	case "E":
	case "e":System.out.println(" Thamk you visit again ");
	break;
	default:System.out.println(" its invalid choice plz try again ");
}
}
}
