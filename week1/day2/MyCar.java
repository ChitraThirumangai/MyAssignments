package week1.day2;

public class MyCar {
public static void main(String[] args) {
	
	//Create an Object to access Car Class in week1.day2 package.
	Car obj = new Car();
	
	//Access all Methods in Car Class in week1.day2 package.
	//Create a variable to store the output of addThreeNumbers public Method.
	int sum = obj.addThreeNumbers(600, 90, 3);
	  System.out.println("Addition of Three Numbers: "+ sum);
	
	//Create a variable to store the output of subTwoNumbers private Method.
	/*Throws Error as it is a Private method "The method subTwoNumbers(int, int) from the type Car is not visible"*/  
	  //int sub = obj.subTwoNumbers(60,40);
	  //System.out.println("Subtraction of Two Numbers: "+ sub);
	  
	//Create a variable to store the output of multiplyThreeNumbers default Method.
	  float multiply = obj.multiplyThreeNumbers(60.09f,40.87f,16.09f);
	  System.out.println("Multiplication of Three float Numbers: "+ multiply); 
}
}
