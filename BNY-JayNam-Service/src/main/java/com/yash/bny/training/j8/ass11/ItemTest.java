/**
 * 
 */
package com.yash.bny.training.j8.ass11;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author akash.meshram
 *
 */
public class ItemTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<ItemModel> l=new ArrayList<>();
		l.add(new ItemModel(101, "iPhone",LocalDateTime.of(2022, 4, 23, 4, 30), LocalDateTime.of(2023, 4, 23, 4, 30), 2000));
		l.add(new ItemModel(102, "samsung",LocalDateTime.of(2020, 5, 20, 8, 00), LocalDateTime.of(2021, 5, 20, 8, 00), 4000));
		l.add(new ItemModel(103, "micromax",LocalDateTime.of(2021, 7, 21, 7, 20), LocalDateTime.of(2022, 7, 21, 7, 20), 8000));
		l.add(new ItemModel(104, "black berry",LocalDateTime.of(2019, 9, 12, 6, 37), LocalDateTime.of(2020, 9, 12, 6, 37), 3000));
		l.add(new ItemModel(105, "MiMi",LocalDateTime.of(2019, 9, 12, 6, 37), LocalDateTime.of(2020, 9, 12, 6, 37), 3000));
		l.add(new ItemModel(106, "Carbon",LocalDateTime.of(2019, 9, 12, 6, 37),null, 10000));
	
		System.out.println("Find average of the given price of item");
		
		float price=(float) l.stream().mapToDouble(ItemModel::getPrice).average().orElse(Double.NaN);
		System.out.println(price);
	
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("Find the highest price of the given item");
		
		ItemModel max=l.stream().map(v->v).max(Comparator.comparing(ItemModel::getPrice)).orElseThrow(NoSuchElementException::new);
		System.out.println(max);
		
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("Find the lowest price of the given item");
		
		ItemModel min=l.stream().map(v->v).min(Comparator.comparing(ItemModel::getPrice)).orElseThrow(NoSuchElementException::new);
		System.out.println(min);
	
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("Find the item thoes have not Expiry date");
	
		List<ItemModel> list=l.stream().filter(v->v.getDoe()==null).collect(Collectors.toList());
		System.out.println(list);
	
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("store the name and price from list to set");
		
		Set<ItemModel> value=l.stream().map(a->new ItemModel(a.getIname(),a.getPrice())).collect(Collectors.toSet());
		for(ItemModel i:value) {
		System.out.println(i.getIname()+" "+i.getPrice());
		}
		
		System.out.println("------------------------------------------------------------------");
		
		System.out.println("remove duplicate price from list of item");
		
		l.stream().map(s->s.getPrice()).distinct().forEach(System.out::println);
	}
}
