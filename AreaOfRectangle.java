class Area {
	int l;
	int b;
	float area() {
	return l*b;
	
	}

	void displayDetails() {
		System.out.println("Length "+l);
		System.out.println("Breadth: "+b);
	}
	}

public class AreaOfRectangle {
	public static void main(String[]args) {
	Area a1 = new
Area();
		a1.l=5;
		a1.b=5;
		System.out.printf("Area:%.2f",a1.area());
		
		a1.displayDetails();
}
}


