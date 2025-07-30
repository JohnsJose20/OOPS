class Shape{
	public int area(int side) {
		System.out.println("I am Square");
		return side*side;
	}
	public int area(int l,int b) {
		System.out.println("I am Rectangle");
		return l*b;
	}
	public float area(float radius) {
		System.out.println("I am Circle");
		return 3.14f*(radius*radius);
	}
	public int area(int l,int h,int nil) {
		System.out.println("I am Parallogram");
		return l*h;
	}
}
public class MethodOverloading {
	public static void main(String[] args) {
		Shape s1 = new Shape();
		System.out.println(s1.area(5));
		Shape s2 = new Shape();
		System.out.println(s2.area(4, 5));
		Shape s3 = new Shape();
		System.out.println(s3.area(6));
		Shape s4 = new Shape();
		System.out.println(s4.area(2,5,0));
		
	}
}
