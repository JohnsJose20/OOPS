package package1;

public class Array2D {
	public static void main(String[] args) {
		int [][] matrix = {{2,3,4},{5,7,6,4}};
		
		for (int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			
			System.out.println();
		}
		
	}
	
}
