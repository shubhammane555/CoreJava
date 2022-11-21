package com.cal;


import java.lang.Math;
import java.util.*;

class Calculator {

	public static double add(double a, double b) {
		return a + b;
	}

	public static double multiplication(double a, double b) {
		return a * b;
	}

	public static double substration(double a, double b) {
		return a - b;
	}

	public static double division(double a, double b) {
		return a / b;
	}

	public static double exponent(double base, double exponent) {
		return Math.pow(base, exponent);
	}

	public static double squareRoot(double num) {
		return Math.sqrt(num);
	}

	public static void main(String[] args) {

		Stack<Double> st = new Stack<>();
		Scanner scanner = new Scanner(System.in);

		int choice;
		do {
			System.out.println(
					"Select an operation: 2. Additions /n 3. Substrations /n 4.Multiplication /n 5. Division /n 6. Sqaure Root /n 7. exponent /n 8. show last three transactions.");
			choice = scanner.nextInt();
			double a = 0.0;
			double b = 0.0;
			switch (choice) {
			case 2:
				System.out.println("Enter two values");
				a = scanner.nextDouble();
				b = scanner.nextDouble();
				double result1 = add(a, b);
				System.out.println("Addition :" + result1);
				st.push(result1);
				break;
			case 3:
				System.out.println("Enter two values");
				a = scanner.nextDouble();
				b = scanner.nextDouble();
				double result2 = substration(a, b);
				System.out.println("substration :" + result2);
				st.push(result2);
				break;
			case 4:
				System.out.println("Enter two values");
				a = scanner.nextDouble();
				b = scanner.nextDouble();
				double result3 = multiplication(a, b);
				System.out.println("multiplication :" + result3);
				st.push(result3);
				break;
			case 5:
				System.out.println("Enter two values");
				a = scanner.nextDouble();
				b = scanner.nextDouble();
				double result4 = division(a, b);
				System.out.println("division :" + result4);
				st.push(result4);
				break;
			case 6:
				System.out.println("Enter value");
				a = scanner.nextDouble();
				double result5 = squareRoot(a);
				System.out.println("squareRoot :" + result5);
				st.push(result5);
				break;
			case 7:
				System.out.println("Enter two values");
				a = scanner.nextDouble();
				b = scanner.nextDouble();
				double result7 = exponent(a, b);
				System.out.println("exponent :" + result7);
				st.push(result7);
				break;
			case 8:
				System.out.println("last transaction:");
				if (st.size() < 3) {
					while (!st.isEmpty()) {
						System.out.println(st.pop());
					}
				} else {
					for (int i = 0; i < 3; i++) {
						System.out.println(st.pop());
					}
				}
				break;
			default:
				break;
			}
			System.out.println("press 1 to continue 0 to exit");
			choice = scanner.nextInt();
		} while (choice != 0);
		scanner.close();

	}
}
