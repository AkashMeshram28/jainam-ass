/**
 * 
 */
package com.yash.bny.training.j8.ass12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author akash.meshram
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<CityModel> cs = Arrays.asList(
				new CityModel(1, "Mumbai", new StateModel(101, "Maharashtra"), 9.5f, 500000, 493),
				new CityModel(2, "Nashik", new StateModel(101, "Maharashtra"), 7.7f, 400000, 393),
				new CityModel(3, "Vizak", new StateModel(102, "AP"), 5.8f, 350000, 450),
				new CityModel(4, "Indor", new StateModel(102, "MP"), 8f, 650000, 350),
				new CityModel(5, "Kanpur", new StateModel(103, "UP"), 6f, 450000, 500),
				new CityModel(6, "Aagra", new StateModel(103, "UP"), 8.6f, 600000, 300));

		System.out.println("find city with less area and highest population");
		List<CityModel> value = cs.stream().sorted(
				Comparator.comparing(CityModel::getPopulation).thenComparing(CityModel::getArea_of_city).reversed())
				.limit(1).collect(Collectors.toList());
		System.out.println(value);
		
		System.out.println("------------------------------------------------------------------");

		System.out.println("find city with high population index and high city area");
		List<CityModel> value1 = cs.stream().sorted(
				Comparator.comparing(CityModel::getPollutionIndex).thenComparing(CityModel::getArea_of_city).reversed())
				.limit(1).collect(Collectors.toList());
		System.out.println(value1);

		System.out.println("------------------------------------------------------------------");
		
		System.out.println("print city with less population index first");
		List<CityModel> value2 = cs.stream().sorted(Comparator.comparing(CityModel::getPollutionIndex))
				.collect(Collectors.toList());
		System.out.println(value2);

		System.out.println("------------------------------------------------------------------");
		
		System.out.println("print city with lowest population index and lowest area");
		List<CityModel> value3 = cs.stream()
				.sorted(Comparator.comparing(CityModel::getPollutionIndex).thenComparing(CityModel::getArea_of_city))
				.limit(1).collect(Collectors.toList());
		System.out.println(value3);

		System.out.println("------------------------------------------------------------------");
		
		System.out.println("count how many city in state");
		long count = cs.stream().map(CityModel::getCityname).count();
		System.out.println(count);

		System.out.println("------------------------------------------------------------------");
		
		System.out.println("total area of each state");
		long sum = cs.stream().collect(Collectors.summingLong(CityModel::getArea_of_city));
		System.out.println(sum);

	}

}
