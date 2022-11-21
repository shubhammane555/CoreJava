import javax.swing.*;
class cal
{
public static void main ( String []args)
{

String ch = JOptionPane.showInputDialog(" Press A for adiition \n Press S for substraction \n Press M for multiplication \n Press D for Division");
String first =JOptionPane.showInputDialog(" enter first value ");
String sec =JOptionPane.showInputDialog(" enter secand value ");
int fa = Integer.parseInt(first);
int sa = Integer.parseInt(sec);
switch ( ch)
{
	case "A":
	case "a":double sum = fa + sa ;
	System.out.println(" first value" +fa+"secand value"+sa+"final value"+sum);
	break;
	
	case "S":
	case "s":double sub = fa - sa ;
	System.out.println(" first value" +fa+"secand value"+sa+"final value"+sub);
	break;
	case "M":
	case "m":double mul = fa * sa ;
	System.out.println(" first value" +fa+"secand value"+sa+"final value"+mul);
	break;
	case "D":
	case "d":double div = fa / sa ;
	System.out.println(" first value" +fa+"secand value"+sa+"final value"+div);
     break;
	case "E":
		case "e":System.out.println(" thank you ");
		break;
	default:System.out.println(" its invalid choice plz try again ");
}
}
}
