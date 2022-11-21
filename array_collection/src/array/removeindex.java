package array;

import java.util.Arrays;

public class removeindex {
	public static void main(String[] args) {
		
		int []array= {12,11,34,33,23,21,45,67,88};
		System.out.println(Arrays.toString(array));
		int removein=1;
		
		for(int i=removein;i<array.length-1;i++) {
			array[i]=array[i+1];
		}
		System.out.println(Arrays.toString(array));
	}

}
