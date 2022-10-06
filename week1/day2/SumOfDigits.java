package week1.day2;

public class SumOfDigits {
public static void main(String[] args) {
	// Declare your input number (int)
	int input=76578;
	
	// Initialize an integer variable by name: sum
    int sumOfDigits=0;
    
   // Use loop to calculate the sum: use while loop to set condition until the number goes greater than 0
    do {
    	// Within loop: get the remainder when done by 10 -> Tip: use mod %
    	// Within loop: add that remainder to the sum
    	// Within loop: get quotient of that number (tip: quotient should be same variable of loop condition)
    	int reminder = input%10;
    	System.out.println("Reminder: "+ reminder);
    	sumOfDigits+=reminder;
    	input=input/10;
    	System.out.println("Quotient: " +input);	
    }while (input>0);
    //Outside the loop: print the final sum
    System.out.println("Sum of Digits : " +sumOfDigits);
    
}
}
