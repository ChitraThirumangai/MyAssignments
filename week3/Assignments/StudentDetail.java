package week3.Assignments;

//Method Overloading.
public class StudentDetail {

	//Create multiple getStudentInfo() method by passing id argument alone, by id & name, by email & phoneNumber
	public void getStudentInfo(int id) {
		System.out.println("Student Id:" + id);
	}
	
	public void getStudentInfo(int id,String name) {
		System.out.println("Student Name:" + name);
	}
	
	public void getStudentInfo(String email,int phoneNumber) {
		System.out.println("Student email:" + email);
		System.out.println("Student Phone Number:" + phoneNumber);
	}
	
	public static void main(String[] args) {
		StudentDetail student1 = new StudentDetail();
		student1.getStudentInfo(78966);
		student1.getStudentInfo(78966,"Chitra K");
		student1.getStudentInfo("chitrk@gmail.com", 78966);
	}
}
