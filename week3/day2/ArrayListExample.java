package week3.day2;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		Collections.addAll(numbers, 23, 54, 67, 55, 66, 42, 27, 89, 27);

		System.out.println("Using For loop: Odd Numbers are ");
		// To find odd numbers in numbers ArrayList
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) % 2 != 0) {
				System.out.println(numbers.get(i));
			}
		}
		System.out.println("\nUsing Foreachloop: Odd Numbers are ");
		for (Integer eachNumber : numbers) {
			if (eachNumber % 2 != 0) {
				System.out.println(eachNumber);
			}
		}

		System.out.println("\nPrint Names start with 'M' using for loop");
		List<String> names = new ArrayList<String>();
		Collections.addAll(names, "Arun", "Deepa", "Maria", "Deepa", "Sharmila", "Muthu", "Chinrasu");
		for (int i = 0; i < names.size(); i++) {
			String findName = names.get(i);
			if (findName.startsWith("M") == true)
				System.out.println(findName);

		}
		System.out.println("\nPrint Names start with 'M' using for each loop");
		for (String eachName : names) {
			if (eachName.startsWith("M"))
				System.out.println(eachName);
		}

	}
}
