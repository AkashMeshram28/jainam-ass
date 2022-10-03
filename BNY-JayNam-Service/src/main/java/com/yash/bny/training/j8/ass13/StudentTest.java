/**
 * 
 */
package com.yash.bny.training.j8.ass13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author akash.meshram
 *
 */
public class StudentTest {

	public static void main(String[] args) {

		final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		LocalDateTime doa = LocalDate.parse("20110312", formatter).atStartOfDay();
		LocalDateTime date_ob = LocalDate.parse("19930406", formatter).atStartOfDay();

		StudentModel s1 = new StudentModel(101, doa, date_ob, 67, 65, 78, 76, 49, "class10th");
		StudentModel s2 = new StudentModel(102, doa, date_ob, 34, 54, 34, 23, 21, "class10th");
		StudentModel s3 = new StudentModel(103, doa, date_ob, 88, 45, 34, 76, 49, "class10th");
		StudentModel s4 = new StudentModel(104, doa, date_ob, 85, 88, 78, 76, 76, "class10th");

		List<StudentModel> list = Arrays.asList(s1, s2, s3, s4);

		int avg1 = (s1.getMaths() + s1.getPhysics() + s1.getChemistry() + s1.getEnglish() + s1.getHindi() / 5);
		int avg2 = (s2.getMaths() + s2.getPhysics() + s2.getChemistry() + s2.getEnglish() + s2.getHindi() / 5);
		int avg3 = (s3.getMaths() + s3.getPhysics() + s3.getChemistry() + s3.getEnglish() + s3.getHindi() / 5);
		int avg4 = (s4.getMaths() + s4.getPhysics() + s4.getChemistry() + s4.getEnglish() + s4.getHindi() / 5);

		HashMap<StudentModel, Integer> hm = new HashMap<>();
		hm.put(s1, avg1);
		hm.put(s2, avg2);
		hm.put(s3, avg3);
		hm.put(s4, avg4);

		// Student key = Collections.max(hm.entrySet(),
		// Map.Entry.comparingByValue()).getKey();
		List<StudentModel> list1 = hm.entrySet().stream().filter(e -> e.getValue() < 40).map(Map.Entry::getKey)
				.collect(Collectors.toList());

		System.out.println("students who’s total marks are less than 40%.");
		System.out.println(list1);

		System.out.println("------------------------------------------------------------------");

		System.out.println(" students who scored more than 75% in any \r\n" + "of 3 subjects.\r\n" + "");

		int[] marksfors1 = { s1.getMaths(), s1.getPhysics(), s1.getChemistry(), s1.getEnglish(), s1.getHindi() };
		int temp;
		int len = marksfors1.length;
		for (int i = 0; i < marksfors1.length; i++) {

			for (int j = i + 1; j < marksfors1.length; j++) {

				if (marksfors1[i] > marksfors1[j]) {
					temp = marksfors1[i];
					marksfors1[i] = marksfors1[j];
					marksfors1[j] = temp;
				}
			}
		}
		// System.out.println("Third-max number is "+marksfors1[len-3]);
		// System.out.println("second-max number is "+marksfors1[len-2]);
		// System.out.println("max number is "+marksfors1[len-1]);

		int[] marksfors2 = { s2.getMaths(), s2.getPhysics(), s2.getChemistry(), s2.getEnglish(), s2.getHindi() };
		int[] marksfors3 = { s3.getMaths(), s3.getPhysics(), s3.getChemistry(), s3.getEnglish(), s3.getHindi() };
		int[] marksfors4 = { s4.getMaths(), s4.getPhysics(), s4.getChemistry(), s4.getEnglish(), s4.getHindi() };

		// (Students.get(i).(getg1(),getg2(),getg3()) <
		// studentMinGrade.(getg1(),getg2(),getg3());

		System.out.println("------------------------------------------------------------------");

		System.out.println("Students who scored more than 75% in all \r\n" + "subject");
		List<StudentModel> list2 = list.stream().filter(e -> e.getChemistry() > 75 && e.getEnglish() > 75
				&& e.getHindi() > 75 && e.getMaths() > 75 && e.getPhysics() > 75).collect(Collectors.toList());
		System.out.println(list2);

		System.out.println("------------------------------------------------------------------");

		System.out.println("Students who are fail in at least one subject. ");

		List<StudentModel> list3 = list.stream().filter(e -> e.getChemistry() < 35 || e.getEnglish() < 35
				|| e.getHindi() < 35 || e.getMaths() < 35 || e.getPhysics() < 35).collect(Collectors.toList());
		System.out.println(list3);

		System.out.println("------------------------------------------------------------------");

		List<StudentModel> list4 = hm.entrySet().stream().filter(e -> e.getValue() > 40).map(Map.Entry::getKey)
				.collect(Collectors.toList());
		System.out.println("Students who’s promoted to next class.");
		System.out.println(list4);

		System.out.println("------------------------------------------------------------------");

		long count = list.stream().filter(e -> e.getChemistry() < 35 || e.getEnglish() < 35 || e.getHindi() < 35
				|| e.getMaths() < 35 || e.getPhysics() < 35).count();
		// System.out.println(count);
		if (count == 2) {
			List<Integer> promoted = list
					.stream().filter(e -> e.getChemistry() < 35 || e.getEnglish() < 35 || e.getHindi() < 35
							|| e.getMaths() < 35 || e.getPhysics() < 35)
					.map(x -> x.getRollno()).collect(Collectors.toList());
			System.out.println("Number of Y Students need to give exam in Two Subjects to Promoted \r\n"
					+ "to another Class " + count + "..........." + promoted);

		}
	}
}
