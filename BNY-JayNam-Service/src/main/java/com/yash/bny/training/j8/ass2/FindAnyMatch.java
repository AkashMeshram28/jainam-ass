/**
 * 
 */
package com.yash.bny.training.j8.ass2;

import java.util.Arrays;

/**
 * @author akash.meshram
 *
 */
public class FindAnyMatch {

	public static void main(String[] args) {
		String string[] = { "Taj is situated in Agra" };

//		String find = "sta";
//		String find = "tas";
//		String find = "tsa";
//		String find = "ast";
//		String find = "Taj";
		String find = "taj";

		boolean anyMatch = Arrays.stream(string).anyMatch(s -> s.contains(find));

		System.out.println(anyMatch);
		if (anyMatch == true) {
			System.out.println(find + " String match found");
		} else {
			System.out.println(find + " String match not found");
		}
	}
}
