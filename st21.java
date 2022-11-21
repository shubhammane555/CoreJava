class st21

{
public static void main(String []args)
{
String s1=" aish is mine ";
String s2="";
char c [] =s1.toCharArray();
 for (int i=s1.length()-1;i>=0;i--)
{
System.out.println(c[i]);
s2=s2+c[i];
System.out.println(s2);

}
}
}