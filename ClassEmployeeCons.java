class Employee {
	String name;
	int id;
	double salary;
	
	Employee(String name,int id,double salary){
	this.name=name;
	this.id=id;
	this.salary=salary;
	}

	void displayEmployees() {
		System.out.println("Name: "+name);
		System.out.println("ID: "+id);
		System.out.println("Salary: "+salary);
	}}
		
public class ClassEmployeeCons{
	public static void main(String[]args) {
		Employee emp1 = new
				Employee("Johns Jose",45,100000.0050);
		Employee emp2 = new
				Employee("Dawn",35,100000.0050);
						
			emp1.displayEmployees();
			emp2.displayEmployees();
	}
		}
