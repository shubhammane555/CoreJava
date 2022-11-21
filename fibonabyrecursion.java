class fibona
{
	static int a=0,b=1,c;
public static void main(String[] args)
{

fibona ob=new fibona();
ob.newfibon(10);
}
void newfibon(int i)
{
if(i>=1)
{
c=a+b;
System.out.println(c);
a=b;
b=c;
newfibon(i-1);
}
}
}
