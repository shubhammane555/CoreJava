package com.collection;
import java.util.*;

class temprature {

	public static void main(String[] args) {
		int arr[] = { 73, 74, 75, 71, 69, 72, 76, 73 };
		int temp[] = new int[arr.length];
		int cnt = 0;
		int k = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			cnt = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					cnt++;
					break;
				} else {
					cnt++;
				}
			}
			temp[k++] = cnt;
		}

		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i] + "");

		}

	}
}
