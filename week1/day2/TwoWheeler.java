package week1.day2;

//Create a class for TwoWheeler
public class TwoWheeler {
	//Declare below global variables with appropriate values
	 int noOfWheels =2;
     short noOfMirrors =2;
     long chassisNumber=631737587;
     boolean isPunctured =false;
     String bikeName ="Activa";
     double runningKM =45.05;
      
    public static void main(String[] args) {
    	//Create object for TwoWheeler
    	 TwoWheeler twoWheel = new TwoWheeler();
    	
    	//Call all the variables inside main method and print the values 
    	System.out.println("My Two Wheeler");
		System.out.println("Two Wheeler Name: "+ twoWheel.bikeName);
		System.out.println("No Of Wheels: "+ twoWheel.noOfWheels);
		System.out.println("No Of Mirrors: "+twoWheel.noOfMirrors);
		System.out.println("Chassis Number: "+ twoWheel.chassisNumber);
		System.out.println("Is two wheeler puncture?" + twoWheel.isPunctured);
		System.out.println("Running Speed: " +twoWheel.runningKM+"km/hr");

	}
     
}
