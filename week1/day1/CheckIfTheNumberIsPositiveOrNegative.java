package week1.day1;

//Problem statement: Check if the number is positive or negative
public class CheckIfTheNumberIsPositiveOrNegative {
    public static void main(String[] args) {
    //1. Initialize a number, say, int number= 35;
    int number = 35;
    
    //If a number is positive, print "The number is positive"
    if(number>0)
    	System.out.println(number +" The number is positive");
    
    //If a number is negative, print "The number is negative" 
    else if(number<0)
    	System.out.println(number + " The number is negative");
    
    //If it nether negative nor positive, print as, "The number is neither positive nor negative"
    else
    	System.out.println(number + " The number is neither positive nor negative");
}
}

