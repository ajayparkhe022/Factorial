package com.acts;

import java.util.Scanner;

// create a program to accept a number from the user and display its factorial its factorial using a java program. compile, and execute it. create a git project to move it to github.
public class Factorial {
	public static void main(String[] args) {
		int num, fact = 1;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		num = scanner.nextInt();

		for (int i = 1; i <= num; i++) {
			fact *= i;
		}

		System.out.println("Factorial of " + num + " is " + fact);
	}
}
