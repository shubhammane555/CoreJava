
package com.shubham.que.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class Queue {
	Node front;
	Node rear;

	public Queue() {
		this.front = null;
		this.rear = null;
	}

	public void enqueue(int value) {
		Node temp = new Node(value);
		if (this.rear == null) {
			this.front = temp;
			this.rear = temp;
			return;
		}
		this.rear.next = temp;
		this.rear = temp;
	}

	public int dequeue() {
		if (this.front == null) {
			return -1;
		}
		Node temp = this.front;
		this.front = this.front.next;
		if (this.front == null) {
			this.rear = null;
		}
		return temp.data;
	}

	public int peek() {
		if (this.front == null) {
			return -1;
		}
		return this.front.data;
	}

	public int calculateSize() {
		Node ptr = this.front;
		if (ptr == null) {
			return -1;
		}
		int cnt = 0;
		while (ptr != null) {
			cnt++;
			ptr = ptr.next;
		}
		return cnt;
	}

	public boolean checkEmpty() {
		if (this.front == null) {
			return true;
		}
		return false;
	}
}

 class B {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue queue = new Queue();
		System.out.println("Implementation of Queue using Linked List");
		int choice = 0, value;
		int temp = 0;
		while (choice != 6) {
			System.out.println("1. Enqueue\n 2. Dequeue\n 3. Peek\n 4. Size\n 5. isEmpty\n 6. Exit");
			System.out.println("Enter your choice : ");
			choice = Integer.parseInt(br.readLine());

			switch (choice) {

			case 1:
				System.out.println("Enter value to be insert: ");
				value = Integer.parseInt(br.readLine());
				queue.enqueue(value);
				break;

			case 2:
				temp = queue.dequeue();
				if (temp > 0) {
					System.out.println("Popped value is :" + temp);
				} else {
					System.out.println("Queue is empty. ");
				}
				break;

			case 3:
				temp = queue.peek();
				if (temp > 0) {
					System.out.println("Peek Data : " + temp);
				} else {
					System.out.println("Queue is Empty. ");
				}
				break;

			case 4:
				temp = queue.calculateSize();
				if (temp > 0) {
					System.out.println("Size : " + temp);
				} else {
					System.out.println("Queue is empty. ");
				}
				break;

			case 5:
				if (queue.checkEmpty()) {
					System.out.println("Queue is Empty. ");
				} else {
					System.out.println("Queue is not empty. ");
				}
				break;

			case 6:
				System.out.println("your program ended. ");
				System.exit(0);
				break;

			default:
				System.out.println("Please choose currect options. ");

			}
		}
		br.close();

	}

}
