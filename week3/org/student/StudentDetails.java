package week3.org.student;

import week3.org.department.Department;

//Inherits Department Class.Multilevel Inheritance.
public class StudentDetails extends Department{

	//Create three methods studentName(),studentDept(),studentId()
	public void studentName() {
		System.out.println("Student Name: Chitra Thirumangai");
	}
	
	public void studentDept() {
		System.out.println("Student Dept: MCA");
	}
	
	public void studentId() {
		System.out.println("Student Id: MCA56565");
	}
	
	public static void main(String[] args) {
		StudentDetails report = new StudentDetails();
		report.studentName();
		report.studentDept();
		report.studentId();
		report.deptName();
		report.collegeName();
		report.collegeCode();
		report.collegeRank();
	}
	
}
