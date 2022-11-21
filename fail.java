import javax.swing.*;

class fail
{
public static void main ( String []args)
{
String sname = JOptionPane.showInputDialog("enter student name");
String s1 = JOptionPane.showInputDialog("english");
int mark1 = Integer.parseInt(s1 );
String s2 = JOptionPane.showInputDialog("math");
int mark2 = Integer.parseInt(s2 );
String s3 = JOptionPane.showInputDialog("phy");
int mark3 = Integer.parseInt(s3 );
String s4 = JOptionPane.showInputDialog("che");
int mark4 = Integer.parseInt(s4 );
String s5 = JOptionPane.showInputDialog("sci");
int mark5 = Integer.parseInt(s5 );

int total = mark1 + mark2 + mark3 + mark4 + mark5;

double percentage = total / 5  ; // nstade of this if ans is in decimal\float then we can use double

System.out.println(" student name is " +sname);
System.out.println(" english mark is " +s1);
System.out.println(" math mark is " +s2);
System.out.println(" phy mark is " +s3);
System.out.println(" che mark is " +s4);
System.out.println(" sci mark is " +s5);
System.out.println(" total mark is " +total);
System.out.println(" percentage of 5 sub is " +percentage);

if(percentage >=60)
{
System.out.println("first class");
}

else
{
System.out.println("not first class"); 
}
}
}