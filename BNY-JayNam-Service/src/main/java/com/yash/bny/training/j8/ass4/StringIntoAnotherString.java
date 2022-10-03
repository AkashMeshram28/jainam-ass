/**
 * 
 */
package com.yash.bny.training.j8.ass4;

import java.util.Arrays;
import java.util.List;

/**
 * @author akash.meshram
 *
 */
public class StringIntoAnotherString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = Arrays.asList("Yash techology,", " Phase 3, Hinjewadi, Pune-440014.");

		StringBuilder sb = new StringBuilder();
		list.forEach(sb::append);
		 System.out.println(sb);
		 
//		System.out.println(sb.insert(2, ""));
		// String con = sb.toString();

//		System.out.println(sb);
	}

}
