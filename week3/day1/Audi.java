package week3.day1;

//Inherits Car Class in week3.day1 package
public class Audi extends Car{
	
	//Create hybridFuel method
		public void hybridFuel() {
			System.out.println("Both Electric and Petrol");
		}
	
	//Method Overriding. Create an applyBrake() method similar in Vehicle Class
		public void applyBrake()
		{
			System.out.println("Apply ABS Brake");
		}
		
		public void brake() {
			System.out.println("this Keyword:");
			this.applyBrake();
			System.out.println("super Keyword:");
			super.applyBrake();
		}
}
