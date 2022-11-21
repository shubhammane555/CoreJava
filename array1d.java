class abc
{
public static void main(String []args)
{
int[] a={10,20,30};
for (int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}
class bbb
{
	public static void main(String []args)
	{
		int [][]a={{10,20},{40,50,60}};
		for (int i=0;i<a.length;i++)
		{
		for(int j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]);
		}
		System.out.println();
		}
	}
}


class ccc
{
	public static void main(String []args)
	{
		int [][][] a={{{10,20},{30,40,50},{60,70}}};
		for (int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				for (int k=0;k<a[i][j].length;k++)
				{
					System.out.print(a[i][j][k]);
				}
				System.out.println();
			}
	}}
}
