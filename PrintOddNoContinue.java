public class PrintOddNoContinue {
	public static void main(String[]args) {
		System.out.print("Odd number(1-50): ");
		
		for(int i=1;i<=50;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.print(" ,"+i);
			}
		}
	}
