package com.shubham.que.queue;
	
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class A {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter n and k values");
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			queue.add(num);
		}
		br.close();
		System.out.println(queue);
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < k; i++) {
			st.push(queue.poll());
		}

		while (!st.isEmpty()) {
			queue.add(st.pop());
		}
		for (int i = 0; i < n - k; i++) {
			queue.add(queue.poll());
		}

		System.out.println(queue);
	}

}
