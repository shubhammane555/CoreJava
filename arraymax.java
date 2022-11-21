class abc
{
static void maximum(int[]a)
{
int max=a[0];

for(int i=1;i<a.length;i++)
{
if(a[i]>max)
{
max=a[i];
}
}
System.out.println("element is "+max);
}

static void minimum(int[]a)
{
	int min=a[0];
	for(int i=1;i<a.length;i++)
	{
	if(a[i]<min)
	{
		min=a[i];
	}
	}
	System.out.println("element is "+min);
}

public static void main(String[] args)
{
int []s={1,2,3,4,5};
maximum(s);
minimum(s);
}

}