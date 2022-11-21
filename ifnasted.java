class ifnasted
{
public static void main ( String []args)
{
int p = 70, c=72 ,m=75 , r=62 ,h=65;

if ( p >= 40 & c >=40 & m >= 40 & r >=40 & h >= 40 )
{
int total = p+c+m+r+h;
double per = total /5 ;
System.out.println( " total mark " +total+"\n percentage "+per);
System.out.println( "student pass ");
if ( per >= 60 )
{
System.out.println( "student pass with first class");
}
}
else 
{
System.out.println( "student fail ");
}
}
}
