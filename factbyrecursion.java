class abc
{
static int fact=1;
public static void main(String[]args)
{
int no=5;
abc ob=new abc();
ob.calfact(no);
System.out.println("factorial of"+no+"is"+fact);
}
void calfact(int no)
{
if(no>1)
{
fact=fact*no;
calfact(no-1);
}
}
}