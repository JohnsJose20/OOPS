package package1;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();

       
        int[][] matrix = new int[rows][cols];
        int[][] transpose = new int[cols][rows]; 

        System.out.println("Enter the Matrix Elements:");

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix:");
        for (int i=0;i< rows;i++) {
			for(int j=0;j< cols;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			
			System.out.println();
        }
       
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        
        System.out.println("\nTransposed Matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j]+"\t");
            }
            System.out.println();
        }

        sc.close(); 
    }
    }
    
    
