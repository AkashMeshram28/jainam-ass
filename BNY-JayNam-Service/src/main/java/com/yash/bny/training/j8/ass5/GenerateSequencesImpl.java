package com.yash.bny.training.j8.ass5;

/**
 * @author akash.meshram
 *
 */
public class GenerateSequencesImpl{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 4, 6, 7, 8, 11, 13, 14, 15, 19, 20, 21, 21 };
		GenerateSequences generateSequences = () -> {
			int j = 0;
			for (int i = 0; i < arr.length; i = ++j) {
				int count = 1;
				System.out.print(arr[i]);
				while (j < arr.length - 1) {

					if (arr[j + 1] - arr[j] == 1) {
						j++;
						count++;
						continue;
					} else {
						if (count == 1) {
							System.out.print(", ");
							break;
						}
						System.out.print("-" + arr[j] + ", ");
						break;
					}

				}
			}
			System.out.print("-" + arr[--j]);
		};
		generateSequences.sequence();
	}
}