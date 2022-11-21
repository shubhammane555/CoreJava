package array;

public class arraymaxandmin {
	
	public static void max(int[] arr) {
		
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);
		return;
	
	}
public static void min(int[] arr) {
		
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];

			}
		}
		System.out.println(min);
		return;
	}
	
	
	public static void main(String[]args)
	{
		int []array= {2,4,9,8,6,5};
		max(array);
		min(array);
	}
	

}
