import java.util.Scanner;
public class Hello {

	public static void main( String[] args)
	{
	
		Scanner input = new Scanner(System.in );
		int number1;
		int number2;
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		
		System.out.printf("Hello, you entered %d and %d", number1, number2);
		
	}
}
