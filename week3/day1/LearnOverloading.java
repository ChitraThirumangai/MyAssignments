package week3.day1;

public class LearnOverloading {
  //Create add() method with different types/no.of args. Method Overrloading.
  
	public void add(int number1, int number2) {
	  int addTwoNumbers = number1+number2;
	  System.out.println("Sum of two numbers: "+ addTwoNumbers);
  }
	
	public void add(int number1, int number2, int number3) {
		  int addThreeNumbers = number1+number2+number3;
		  System.out.println("Sum of three numbers: "+ addThreeNumbers);
	  }
	
	public void add(float number1, float number2) {
		  float addTwoFloatNumbers = number1+number2;
		  System.out.println("Sum of two floating numbers: "+ addTwoFloatNumbers);
	  }
	
	public void add(float number1) {
		System.out.println("Floating Number :" + number1);
	}
	
	public void add(int number1) {
		System.out.println("Floating Number :" + number1);
	}
	
	public static void main(String[] args) {
		//call all the add methods and verify.
		
		//Create an object to call Non-Static method.(Static method calling Non-Static method).
		LearnOverloading overloading = new LearnOverloading();
		overloading.add(5,7);
		overloading.add(100,200,300);
		overloading.add(50.07f,70.90f);
		overloading.add(900.087f);
		overloading.add(1500);
	}
}
