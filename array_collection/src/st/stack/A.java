
package com.shubham.st.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class A {

	int size;
	int top1;
	int top2;
	int arr[];

	public A(int n) {
		arr = new int[n];
		size = n;
		top1 = -1;
		top2 = size;
	}

	public void push1(int value) {
		if (top1 < top2 - 1) {
			top1++;
			arr[top1] = value;
		} else {
			System.out.println("Stack Overflow");
			System.exit(1);
		}
	}

	public void push2(int value) {
		if (top2 - 1 > top1) {
			top2--;
			arr[top2] = value;
		} else {
			System.out.println("Stack Overflow");
			System.exit(1);
		}
	}

	public int pop1() {
		if (top1 >= 0) {
			int value = arr[top1--];
			return value;
		} else {
			System.out.println("Stack Underflow");
			System.exit(1);
		}
		return -1;
	}

	public int pop2() {
		if (top2 < size) {
			int value = arr[top2++];
			return value;
		} else {
			System.out.println("Stack Underflow");
			System.exit(1);
		}
		return -1;
	}
	
	public boolean isEmpty1() {
		return (top1 == -1) ? true : false;
	}
	public boolean isEmpty2() {
		return (top2 == size) ? true : false;
	}
	public boolean isFull1() {
		return (top1 == top2-1) ? true : false;
	}
	public boolean isFull2() {
		return (top2-1 == top1) ? true : false;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		A a = new A(10);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(
				" 1. push1\n 2. push2\n 3. pop2\n 4. pop2\n 5. isEmpty1\n 6. isEmpty2\n 7. isFull1\n 8. isFull2\n 9. Exit");
		int value;
		int key = 0;
		String message = "";
		while (key != 9) {
			System.out.println("Enter your choice!...");
			key = Integer.parseInt(br.readLine());
            
			switch (key) {
			case 1:
				System.out.println("Enter value to be inserted into stack1!...");
				value = Integer.parseInt(br.readLine());
				a.push1(value);
				break;
			case 2:
				System.out.println("Enter value to be inserted into stack2!...");
				value = Integer.parseInt(br.readLine());
				a.push2(value);
				break;
			case 3:
				a.pop1();
				break;
			case 4:
				a.pop2();
				break;
			case 5:
				message = (a.isEmpty1())? "Stack 1 is empty!..." : "Stack 1 is not empty!...";
				System.out.println(message);
				break;
			case 6:
				message = (a.isEmpty2())? "Stack 2 is empty!..." : "Stack 2 is not empty!...";
				System.out.println(message);
				break;
			case 7:
				message = (a.isFull1())? "Stack 1 is full!..." : "Stack 1 is not full!...";
				System.out.println(message);
				break;
			case 8:
				message = (a.isFull2())? "Stack 2 is full!..." : "Stack 2 is not full!...";
				System.out.println(message);
				break;
			case 9:
				System.exit(1);
				break;

			default:
				System.out.println("Please choose currect options!...");
				break;
			}

		}
		br.close();

	}

}
