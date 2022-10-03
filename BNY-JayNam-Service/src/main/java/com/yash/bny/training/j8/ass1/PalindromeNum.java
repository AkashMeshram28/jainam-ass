/**
 * 
 */
package com.yash.bny.training.j8.ass1;

import java.util.Arrays;

/**
 * @author akash.meshram
 *
 */
public class PalindromeNum {

	public static void main(String[] args) {

//		can use char also instead of number.
		String number = "09890";
		
//		Converts this string to a new character array
		char ch[] = number.toCharArray();
//		System.out.println(ch);
		
		char temp[] = new char[number.length()];
//		System.out.println(temp);

		ValidateNum vm = () -> {
			int j = 0;
			for (int i = ch.length - 1; i >= 0; i--) {
				temp[j++] = ch[i];
			}
			if (Arrays.equals(ch, temp)) {
				System.out.println("Entered number is palindrom");
			} else {
				System.out.println("Entered number is not palindrom");
			}
		};
		vm.show();
	}
}
