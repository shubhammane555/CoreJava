package array;

public class cantainsspecificvalue {
	
	public static boolean conatains(int[] arr,int item)
	{
		for(int n:arr) {
			if(item==n)
			{
				return true;
			}
		}
		return false;
		
	}
	public static void main(String[]args)
	{
		int [] myarray= {11,12,45,66,89,34,44};
		System.out.println(conatains(myarray,10));
	}
}
