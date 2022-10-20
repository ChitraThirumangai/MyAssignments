package week3.collections.assignment;

import java.util.*;

public class DuplicateNumbers {
	public static void main(String[] args) {
		int[] data = { 4, 3, 6, 8, 29, 1, 2, 4, 7, 8 };

		// Remove the duplicates using Set.
		System.out.println("Duplicate Numbers are:");
		Set<Integer> numberSet = new LinkedHashSet<Integer>();

		// If the number is already in Set, it will return false.
		for (int eachNumber : data) {
			boolean isDuplicateNumber = numberSet.add(eachNumber);
			if (isDuplicateNumber == false)
				System.out.println(eachNumber);

		}
	}
}
