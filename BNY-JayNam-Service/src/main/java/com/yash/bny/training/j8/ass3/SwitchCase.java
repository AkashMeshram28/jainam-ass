/**
 * 
 */
package com.yash.bny.training.j8.ass3;

import java.util.Scanner;

/**
 * @author akash.meshram
 *
 */
public class SwitchCase {

	public static void main(String args[]) {

		SwitchValidate switchValidate = null;

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Choose your choice: ");
		System.out.println("1. Even Number");
		System.out.println("2. Odd Number ");
		System.out.println("3. Armstrong Number");
		System.out.println("4. Palindrome Number");
		
		int num = scan.nextInt();
		scan.nextLine();

		switch (num) {

		case 1:
			switchValidate = () -> {
				System.out.println("Enter Number : ");
				if (scan.nextInt() % 2 == 0) {
					System.out.println("number is even");
				} else {
					System.out.println("number is not even");
				}
			};
			switchValidate.choice();
			break;
		case 2:
			System.out.println("Enter Number");
			switchValidate = () -> {
				int i = scan.nextInt();
				if (i % 2 != 0) {
					System.out.println("number is an odd");
				} else {
					System.out.println("number is not an odd");
				}
			};
			switchValidate.choice();
			break;
		case 3:
			switchValidate = () -> {
				System.out.println("Enter Number");
				int i = scan.nextInt();
				int temp = i, count = 0, mul, sum = 0;

				while (temp != 0) {
					temp = temp / 10;
					count++;
				}
				while (i != 0) {
					int digit = i % 10;
					mul = 1;
					for (int j = 1; j <= count; j++) {
						mul = mul * digit;
					}
					sum = sum + mul;
					i = i / 10;
				}
				if (num == sum) {
					System.out.println("Number is an armstrong");
				} else {
					System.out.println("Number is not an armstrong");
				}

			};
			switchValidate.choice();
			break;
		case 4:
			System.out.println("Enter Number");
			switchValidate = () -> {
				int i = scan.nextInt(), digit, rem = 0;
				
				while (i != 0) {
					digit = i % 10;
					rem = rem * 10 + digit;
					i = i / 10;
				}
				if (num == rem) {
					System.out.println("Number is Palindrom");
				} else {
					System.out.println("Number is not Palindrom");
				}
			};
			switchValidate.choice();
			break;
		default:
			System.out.println("Please select above valid choice..........!");
			break;

		}
	}
}
