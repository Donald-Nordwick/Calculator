import java.util.Scanner;

public class Calculator {



	public static void main( String[] args)
	{
		Scanner input = new Scanner( System.in);
		
		double num3 = 0;
		
		System.out.println("Enter your first number:");
		double num1= input.nextDouble();
		
		System.out.println("Enter your Second number number:");
		double num2 = input.nextDouble();
		
		System.out.println("Enter the operation you would like to do:\nFor multiplication use 1");
		System.out.println("For division use 2\nFor addition use 3\nFor subtration use 4");
		int op = input.nextInt();
		
		if (op == 1){
			num3 = num1 * num2;
			System.out.printf( "%.4f * %.4f = %.4f", num1 , num2, num3 );
		}
		else if  (op==2){
			num3 = num1 / num2;
			System.out.printf( "%.4f / %.4f = %.4f", num1 , num2, num3 );
		}
		else if  (op==3){
			num3 = num1 + num2;
			System.out.printf( "%.4f / %.4f = %.4d", num1 , num2, num3 );
		}
		else if  (op==4){
			num3 = num1 - num2;
			System.out.printf( "%.4d / %.4d = %.4d", num1 , num2, num3 );
		}
		else{
			System.out.println(" Operation not recognized.");
		}
	}
}
