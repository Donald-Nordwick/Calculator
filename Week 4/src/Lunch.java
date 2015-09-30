import java.util.Scanner;
public class Lunch {
	public static void main(String[] args)
	{
		Scanner input = new Scanner( System.in);
		
		System.out.println("Hungry");
		System.out.println("Get in line");
		System.out.println("Buy lunch");
		System.out.printf("Do you require the thirst?\n Press 1 for yes:");
		int answer = input.nextInt();
		if (answer == 1)
			System.out.println("Did you have breakfast?\n Press 1 for yes:");
			int bAnswer = input.nextInt();
			if (bAnswer == 1)
				System.out.println("Heres your Diet Coke");
			else if( bAnswer != 1)
				System.out.println("Heres your Coke");
		else
			System.out.println("Heres some Water");
		System.out.println("Eat lunch");
		System.out.println("Return tray");
		System.out.println("Leave");
	}
}
