package array;

import java.util.Arrays;

public class sortarray {
	
	public static void main(String[] args) {
		
		int[] myarray1= {1203,1103,2231,1212,2345,5432,1111};
		
		String [] myarray2= { "shubham","suraj","navneet","don","abc"};
		
		System.out.println(Arrays.toString(myarray1));
		Arrays.sort(myarray1);
		System.out.println(Arrays.toString(myarray1));
		
		System.out.println(Arrays.toString(myarray2));
		Arrays.sort(myarray2);
		System.out.println(Arrays.toString(myarray2));
		
		
	}

}
