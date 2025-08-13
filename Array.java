package package1;

import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		
		//int[] array= {10,45,66,79};
		
		int [] array = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements :");
		
		
		//System.out.print("Array Elements are :\t");
		//System.out.println("Array Length       :\t"+array.length+"\n");
		/* for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+"\t");	
		} */
		
		for(int i=0;i<3;i++){
		array[i]= sc.nextInt();
	}
		System.out.print("Array :\t");
		for(int num:array){
				System.out.print(num+"\t");
			}
	}
}
