class abc
{
static void count(int a[])
{

int no=0;
for (int i=0;i<a.length;i++)
{


no++;
}

}

System.out.println("total number of seven="+no);
}
public static void main(String[]args)
{
int a[]={0,1,0,7,8,7,0,7,7};
count(a);
}
}
