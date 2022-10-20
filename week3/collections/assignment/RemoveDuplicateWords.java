package week3.collections.assignment;

import java.util.*;

public class RemoveDuplicateWords {

	public static void main(String[] args) {

		// Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";
		System.out.println(text);

		// Split the String based on white spaces and save as String Array ,Then iterate the Array
		String[] textArray = text.split("\\s");

		// Create a empty Set. Iterate the String array. Add each word into Set
		// Creating HashSet
		Set<String> arrayHashSet = new HashSet<String>();
		System.out.println("\nPrint each word in text Sentence:");
		for (String eachWord : textArray) {
			System.out.println(eachWord);
			arrayHashSet.add(eachWord);
		}
		System.out.println("\nPrint each word in HashSet:\n" + arrayHashSet);

		// Creating TreeSet
		Set<String> arrayTreeSet = new TreeSet<String>();
		System.out.println("\nPrint each word in text Sentence:");
		for (int i = 0; i < textArray.length; i++) {
			System.out.println(textArray[i]);
			arrayTreeSet.add(textArray[i]);
		}
		System.out.println("\nPrint each word in TreeSet:\n" + arrayTreeSet);

		// Creating LinkedHashSet
		Set<String> arrayLinkedHashSet = new LinkedHashSet<String>();
		System.out.println("\nPrint each word in text Sentence:");
		for (int i = 0; i < textArray.length; i++) {
			System.out.println(textArray[i]);
			arrayLinkedHashSet.add(textArray[i]);
		}
		System.out.println("\nPrint each word in LinkedHashSet:\n" + arrayLinkedHashSet);
	}
}
