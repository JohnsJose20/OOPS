import java.util.Scanner;

public class GradePrint{
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Total mark (0-100): ");
		int mark= sc.nextInt();
		if (mark >= 90 && mark <= 100)
		{
			System.out.println("You got an A grade");
			if (mark >= 90)
			{
				System.out.print("Exellent Keep Going");
			}
		}
		else if (mark >= 75 && mark <= 89) 
		{
			System.out.print("You got an B grade");
		}
		else if (mark >= 60 && mark <= 74) 
		{
			System.out.print("You got an C grade");
		}
		else if (mark >= 40 && mark <= 59) 
		{
			System.out.print("You got an D grade");
		}
		else if (mark < 40) 
		{
			System.out.print("You are Failed");
		}
		else if (mark >100) 
		{
			System.out.print("Invalid Mark");
		}
		sc.close();
}
}