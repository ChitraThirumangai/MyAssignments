package week3.collections.assignment;

import java.util.Arrays;

public class SortingUsingCollections {
	public static void main(String[] args) {
		// Declare a String array and add the Strings values as (HCL, Wipro, Aspire
		// Systems, CTS)
		String[] arrayString = { "HCL", "Wipro", "Aspire Systems", "CTS" };
		int stringLength = arrayString.length;
        
		//To Sort the string array using Collections.
		Arrays.sort(arrayString);
		System.out.println("After Sorting the String Array:");
		for (int i = 0; i < stringLength; i++)
			System.out.println(arrayString[i]);
		
		// Iterate it in the reverse order
		System.out.println("\nAfter Sorting in reverse order:");
		for (int i = stringLength - 1; i >= 0; i--)
			System.out.println(arrayString[i]);

	}
}
