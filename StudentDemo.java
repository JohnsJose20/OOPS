/*Create a Java Class named Student that stores the details
 * of a student including:
 * Name(String)
 * Roll Number (int)
 * Mark in three subjects (int)
 * Use parameterized constructor to initialize all these fields 
 * when an object is created.
 * including the following methods in your class:
 * 1. calculateAverage(): Calculates and returns average of three subject marks.
 * 2. displayDetails(): Display the student details along with the average marks.
 * Create a main class StudentDemo where you:
 * 	>Create at least two student objects using the parameterized constructor.
 * 	>Call the methods to display the student details and average marks. */

class StudentDet{
	String name;
	int rollno;
	float maths,python,c;
	float avg;
	
	StudentDet(String name,int rollno,float maths,float python,float c){
	this.name=name;
	this.rollno=rollno;
	this.maths=maths;
	this.python=python;
	this.c=c;
	calculateAverage();
	}
	public void calculateAverage() {
		avg=(maths+python+c)/3;
	}
	void displayStudent() {
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+rollno);
		System.out.println("Marks   : "
				+ "\nMaths   : "+maths+"\nPython  : "+python+"\nC       : "+c);
		System.out.println("Average : "+avg);
}}
	public class StudentDemo {
	    public static void main(String[] args) {
	        
	        StudentDet student1 = new StudentDet("Johns",45,85,90,78);
	        StudentDet student2 = new StudentDet("Dawn",35,88,92,80);

	        System.out.println("Details of Student 1 :\n");
	        student1.displayStudent();
	        System.out.println("\nDetails of Student 2 :\n");
	        student2.displayStudent();
	        
	    }
	}
	
	//@Authore: JOHNS JOSE
	//Class   : CSE A
	//Roll No : 45

