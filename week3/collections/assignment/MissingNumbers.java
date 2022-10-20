package week3.collections.assignment;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumbers {
	public static void main(String[] args) {
		int[] numbers = { 3, 4, 5, 7, 9, 10, 1, 3, 8, 9, 5 };
		// Remove the duplicates using Set.
		Set<Integer> numberSet = new TreeSet<Integer>();
		for (int eachNumber : numbers)
			numberSet.add(eachNumber);
		System.out.println("Numbers in Tree Set:\n" + numberSet);

		// To Find the missing Number.Convert the
		int i = 1;
		for (int eachNumber : numberSet) {
			if (eachNumber != i)
				System.out.println("Missing Number" + i);
			else
				i++;

		}

	}
}
