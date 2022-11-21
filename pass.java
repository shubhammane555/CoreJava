import javax.swing.*;
class pass
{
public static void main (String []args)
{
String sname=JOptionPane.showInputDialog("enter student name");
String ma=JOptionPane.showInputDialog("marathi");
String mb=JOptionPane.showInputDialog("physics");
String mc=JOptionPane.showInputDialog("chemistri");
String md=JOptionPane.showInputDialog("mathematics");
String me=JOptionPane.showInputDialog("english");

int a = Integer.parseInt(ma);

int b = Integer.parseInt(mb);
int c = Integer.parseInt(mc);
int d =  Integer.parseInt(md);
int e = Integer.parseInt(me);
int total=a + b + c + d + e;
double per = total/5;
System.out.println( " total marks is "+total+"\n total percentage "+per); 
if(per >=60)
{
System.out.println("first class");
}

else
{
System.out.println("not first class");
}
}
}

