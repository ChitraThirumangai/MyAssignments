package week3.collections.assignment;

import java.util.*;

public class RemoveDuplicateCharacters {
	public static void main(String[] args) {
		String strg = "PayPal India";
		char[] character = strg.toCharArray();
		System.out.println("Original String:" + strg);
		Set<Character> characterSet = new LinkedHashSet<Character>();
		Set<Character> duplicateCharacterSet = new LinkedHashSet<Character>();
		for (char eachChar : character) {
			boolean isDuplicateChar = characterSet.add(eachChar);
			if (isDuplicateChar == false)
				duplicateCharacterSet.add(eachChar);
		}
		System.out.println("Character Set:" + characterSet);
		System.out.println("Duplicate Character Set:" + duplicateCharacterSet);

		// Check the duplicateCharacterSet elements and remove those in the characterSet
		for (char eachDuplicateChar : duplicateCharacterSet) {
			if (characterSet.contains(eachDuplicateChar))
				characterSet.remove(eachDuplicateChar);
		}
		System.out.println("\nAfter removing duplicateCharacterSet elements from characterSet");
		System.out.println("Character Set" + characterSet);
		System.out.println("Duplicate Character Set" + duplicateCharacterSet);
	}
}
