package week3.collections.assignment;

import java.util.*;

public class FindSecondLargestNumber {
	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7, 2, 3, 3, 6, 7 };

		// To add numbers in integer array to Set
		Set<Integer> numbersSet = new TreeSet<Integer>();
		for (int i = 0; i < data.length; i++) {
			numbersSet.add(data[i]);
		}
		// To Convert set to List
		List<Integer> numbersList = new ArrayList<Integer>();
		for (int eachNumber : numbersSet)
			numbersList.add(eachNumber);
		System.out.println("Numbers in List: " + numbersList);
		Collections.reverse(numbersList);
		System.out.println("Second Largest Number is: " + numbersList.get(1));
	}
}
