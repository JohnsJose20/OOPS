package pack1;
/**
Problem Statement:
You are asked to create a Java class Student that keeps track 
of the number of student objects created using a static variable.
Each time a new Student object is created, the counter should increase
automatically. Also, create a method to display the number of students 
created so far.
Requirements:
1.Create a class Student with:
•A non-static variable name to store the student's name.
•A static variable studentCount to store the total number of students created.
•A constructor that accepts the student name and increases the count.
•A static method getStudentCount() that returns the value of studentCount.
2.In the Main class:
•Create 3 Student objects with names.
•Print the number of students using the static method.
*/

class Student{
	String name;
	static int StudentCount=0;
	
	Student (String name){
		this.name=name;
		StudentCount++;
	}
	static int getStudentCount() {
		return StudentCount;	
	}}
public class ScountUsingStatic {
		public static void main(String[]args) {
		Student s1 = new Student("Dawn");
		Student s2 = new Student("Cyril");
		Student s3 = new Student("Kritthik");
		System.out.println("Student Count : "+Student.getStudentCount());
		}
}
