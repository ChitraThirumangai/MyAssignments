package week1.day1;

public class Factorial {
     
	public static void main(String[] args) {
	//Declare an integer variable and its value as 5.
		int input = 5;
	//Declare an integer variable to store multiplied value in loop and assign value as 1.
		int fact = 1;
	//Iterate from 1 to your input and Multiply fact with iterator variable.
	for (int i = 1; i <=input; i++) {
		fact = fact *i;
	}
		System.out.println("Factorial "+input+" is "+fact);
	}	
	
	
}

