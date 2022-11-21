class digit
{
public static void main (String [] args)
{
int n = 5432;
int a = n%10;  // denominator 2
int b = n/10;  //  ans 543
int c = b%10;  // denominator 3
int d = b/10; // ans 54
int e = d%10; // ans 4
int f = d/10;  // ans 5

System.out.println(" first digit is "+a); // 2
System.out.println(" secand digit is "+c); //3
System.out.println(" third digit is "+e); // 4
System.out.println(" forth digit is "+f);// 5
System.out.println(" addition of a and c is "+(a+c)); // 5
System.out.println(" addition of e and f is "+(e+f)); // 9

}
}
