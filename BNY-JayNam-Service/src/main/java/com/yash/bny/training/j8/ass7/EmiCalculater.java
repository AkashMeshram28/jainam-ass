/**
 * 
 */
package com.yash.bny.training.j8.ass7;

import java.util.Scanner;

/**
 * @author akash.meshram
 *
 */
public class EmiCalculater {
	
//	private Calculater calculater;
	public static void main(String[] args) {

		Calculater calculater;
		Scanner scan = new Scanner(System.in);
		calculater = () -> {

			System.out.println("Enter amount:");
			double amount = scan.nextDouble();
			System.out.println("Enter Months:");
			int months = scan.nextInt();
			System.out.println("Enter rate of intrest in number:");
			double roi = scan.nextDouble() / (12 * 100);

			double cal = (amount * roi * Math.pow(1 + roi, months)) / (Math.pow(1 + roi, months) - 1);
			System.out.println("payable amount monthly = " + cal);
			System.out.println("total amount on monthly basis = " + cal * months);
		};
		calculater.calculate();
	}
}
