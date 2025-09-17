package package1;

public class ExceptionDemo {
	public static void main(String[]args) {
		
		//IndexOutOfBoundException(Integer)
		int [] array = {1,2,3,4,5};
		System.out.println(array[6]);
		
		//IndexOutOfBoundException(String)
		String college = "SJCET";
		System.out.println(college.charAt(10));
		
		//NumberFormatException
		String s2="abc";
		System.out.println(Integer.parseInt(s2));
		
		//NullPointerException
		String s1=null;
		System.out.println(s1.length());
		
		//ArithemeticException
		System.out.println(10/0);
		System.out.println("After Exception");
	}
}
