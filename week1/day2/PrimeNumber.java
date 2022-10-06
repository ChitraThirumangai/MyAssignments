package week1.day2;

public class PrimeNumber {
	
	public static void main(String[] args) {
		// Declare an int Input and assign a value 13
		int input =1301;
		
		// Declare a boolean variable flag as false
		boolean flag = false;
		
		// Iterate from 2 to half of the input
		for (int i=2;i<=input/2;i++) {
			// Divide the input with each for loop variable and check the remainder and 
			// Set the flag as true when there is no remainder
			// break the iterator
			if(input%i==0)
				flag = true;
			break;
		}
		// Check the flag (Provide a condition)
		// Print 'Prime' when the condition matches
		// Print 'Not a Prime' when the condition doesn't match 
		if(flag == false)
			System.out.println(input + " is a Prime Number");
		else
			System.out.println(input + " is NOT a Prime Number");
	}

}
