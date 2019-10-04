package com.javabasics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {
	
	public static void main(String args[]) {
		
		ArrayList<String>  tvSeries = new ArrayList<String>();
		tvSeries.add("Game of Thrones");
		tvSeries.add("Breaking Bad");
		tvSeries.add("The Big Ban Theory");
		tvSeries.add("The Walking Dead");
		tvSeries.add("Presion Break");
		
		System.out.println("--------Print Using for each lambda in java 8-------------");
		
		//1. Iteration using Java 8 with for each loop and lambda expression
		
		tvSeries.forEach(shows -> {
			System.out.println(shows);
		});
		
		System.out.println("--------Print Using Iterator-------------");
		
		//2. Using Iterator
		
		Iterator<String> it = tvSeries.iterator();
		while(it.hasNext()) {
			String shows = it.next();
			System.out.println(shows);
		}
		
		//3. Using Iterator and Java 8 forEachRemaning() method
		
		System.out.println("--------Print Using forEachRemaning() method in java 8-------------");
		
		it = tvSeries.iterator();
		it.forEachRemaining(show -> {
			System.out.println(show);
		});
		
		//4. Using simple for each loop
		
		System.out.println("--------Print Using foreach loop method in java 8-------------");
		
		for(String show: tvSeries) {
			System.out.println(show);
		}
		
		
		//5. Using for loop with index or order
		
		System.out.println("--------Print Using for loop with index or order in java 8-------------");
		
		for(int i =0; i<tvSeries.size(); i++) {
			System.out.println(tvSeries.get(i));
		}
		
		
		//6. Using listIterator() to traverse in both the directions
		System.out.println("--------Print Using listIterator() to traverse in both the directions in java 8-------------");
		
		ListIterator<String> tvSeriesListIterator = tvSeries.listIterator(tvSeries.size());
		while(tvSeriesListIterator.hasPrevious()) {
			String show = tvSeriesListIterator.previous();
			System.out.println(show);
		}
	}

}
