package com.shubham.que.queue;




import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class C {

	private static class Stack {
		static Queue<Integer> q1 = new LinkedList<>();
		static Queue<Integer> q2 = new LinkedList<>();

		static int currentSize;

		static void push(int value) {
			q2.add(value);
			while (!q1.isEmpty()) {
				q2.add(q1.poll());
			}
			Queue<Integer> temp = q1;
			q1 = q2;
			q2 = temp;
		}

		static int pop() {
			if (q1.isEmpty()) {
				return -1;
			}
			return q1.remove();

		}

		static int top() {
			if (q1.isEmpty()) {
				return -1;
			}
			return q1.peek();
		}

		static int calculateSize() {
			return q1.size();
		}

		static boolean checkEmpty() {
			return q1.isEmpty();
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		Stack st = new Stack();
		System.out.println(" 1. push\n 2. pop\n 3. peek\n 4. size\n 5. isEmpty\n 6. Exit");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int key = 0;
		int value;
		while (key != 6) {
			System.out.println("Enter your choice!...");
			key = Integer.parseInt(br.readLine());
			switch (key) {
			case 1:
				System.out.println("Enter value to be inserted!...");
				value = Integer.parseInt(br.readLine());
				st.push(value);
				break;
			case 2:
				st.pop();
				break;
			case 3:
				value = st.top();
				System.out.println("peek element : " + value);
				break;
			case 4:
				System.out.println("stack size is " + st.calculateSize());
				break;
			case 5:
				String ans = (st.checkEmpty())? "Stack is not empty!..." : "Stack is empty!...";
				System.out.println("Check Stack is empty or not!. " + ans);
				break;
			case 6:
				System.exit(0);
				break;

			default:
				System.out.println("Please choose correct options!....");
				break;
			}
		}
		br.close();

	}

}
