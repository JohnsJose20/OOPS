/* write a java program to copy the elements of one array to 
another array and display that array */

package package1;


public class DuplicateArray {
    public static void main(String[] args) {
    
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray = new int[originalArray.length];


        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        System.out.println("Array:");
        for(int i=0; i< originalArray.length; i++){
        	 System.out.print(originalArray[i]+"\t");
    	}
        System.out.println();
        System.out.println();
        
        System.out.println("Copied Array:");
        for(int i=0; i< copiedArray.length; i++){
       	 System.out.print(copiedArray[i]+"\t");
   	}
        
    }
}
