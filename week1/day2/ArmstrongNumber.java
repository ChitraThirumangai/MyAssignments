package week1.day2;

public class ArmstrongNumber {
	public static void main(String[] args) {
		//Declare a variable input and assign a value 153
		int input = 8208;
		
		// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone)
		int calculated =0,reminder,original;
		
		// Assign input into variable original
		original = input;
		
		// Use loop to calculate: use while loop to set condition until the number greater than 0
		while(input>0) {
			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
			reminder =input%10;
			System.out.println("R"+reminder);
			
			// Within loop: get the quotient when done by 10 (Tip: Assign the result to input)
			input = input/10;
			System.out.println("Q"+input);
			
			// Within loop: Add calculated with the cube of remainder & assign it to calculated
			calculated+= reminder*reminder*reminder;
			System.out.println("C"+calculated);
		}
		// Check whether calculated and original are same
		 if(original == calculated)
			System.out.println(original +" is an Armstrong Number");
		 else
			System.out.println(original + "is NOT an Armstrong Number");
	}
	

}
