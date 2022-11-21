package com.shubham.st.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class B {
	private Stack<Integer> st;
	Integer min;

	public B() {
		st = new Stack<>();
	}

	public void push(int value) {
		if (st.isEmpty()) {
			min = value;
			st.push(value);
			return;
		}
		// check if current value is less then minimum value then update minimum value
		if (value < min) {
			st.push(2 * value - min);
			min = value;
		} else {
			st.push(value);// if current value is greater then minimum value then just insert the value
							// into stack.
		}
	}

	public void pop() {
		if (st.isEmpty()) {
			System.out.println("Stack is empty right now!...");
			return;
		}
		Integer value = st.pop();
		if (value < min) {
			min = 2 * min - value;
		}
	}

	public int getMin() {
		if (st.isEmpty()) {
			return -1;
		}
		return min;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		B b = new B();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" 1. push\n 2. pop\n 3. min\n 4. exit");
		int key = 0;
		int value;
		while (key != 4) {
			System.out.println("Enter your choice!...");
			key = Integer.parseInt(br.readLine());

			switch (key) {
			case 1:
				System.out.println("Enter value to be inserted!...");
				value = Integer.parseInt(br.readLine());
				b.push(value);
				break;
			case 2:
				b.pop();
				break;
			case 3:
				value = b.getMin();
				if (value != -1) {
					System.out.println("minimum value :" + value);
				} else {
					System.out.println("Stack is empty!...");
				}
				break;
			case 4:
				System.exit(1);
				break;

			default:
				break;
			}

		}
		br.close();

	}

}
