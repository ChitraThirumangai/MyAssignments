package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {
  public static void main(String[] args) {
	int [] data= {3,2,11,4,6,7};
	
	//Arrange the array in ascending order
	Arrays.sort(data);
	
	//Pick the 2nd element from the last and print it
	int secondLargestNumber= data[1];
	System.out.println("Second Largest Number is: " +secondLargestNumber);
}
}
