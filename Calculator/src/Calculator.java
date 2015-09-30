import java.util.Scanner;

public class Calculator {



	public static void main( String[] args)
	{
		Scanner input = new Scanner( System.in);
		
	
		double num3 = 0;
		double num5=0;
		
		System.out.println("Enter your first number:");
		double num1= input.nextDouble();
	
		System.out.println("Enter your Second number number:");
		double num2 = input.nextDouble();
		
		System.out.println("Enter the operation you would like to do:\nFor multiplication use 1");
		System.out.println("For division use 2\nFor addition use 3\nFor subtration use 4");
		int op = input.nextInt();
		
		if (op == 1){
			num3 = num1 * num2;
			System.out.printf( "%.4f * %.4f = %.4f\n", num1 , num2, num3 );
		}
		else if  (op==2){
			num3 = num1 / num2;
			System.out.printf( "%.4f / %.4f = %.4f\n", num1 , num2, num3 );
		}
		else if  (op==3){
			num3 = num1 + num2;
			System.out.printf( "%.4f + %.4f = %.4f\n", num1 , num2, num3 );
		}
		else if  (op==4){
			num3 = num1 - num2;
			System.out.printf( "%.4f - %.4f = %.4f\n", num1 , num2, num3 );
		}
		else{
			System.out.println(" Operation not recognized.");
		}
		System.out.println("Would you like to keep calculating?\nEnter 1 for yes");
		int ans = input.nextInt();
		while(ans==1)
		{
			System.out.println("Please enter your next number");
			double num4 = input.nextDouble();
			System.out.println("Enter the operation you would like to do:\nFor multiplication use 1");
			System.out.println("For division use 2\nFor addition use 3\nFor subtration use 4");
			op = input.nextInt();
			
			if (op == 1){
				num5=num3;
				num3 = num3 * num4;
				System.out.printf( "%.4f * %.4f = %.4f\n", num5 , num4, num3 );
			}
			else if  (op==2){
				num5=num3;
				num3 = num3 / num4;
				System.out.printf( "%.4f / %.4f = %.4f\n", num5 , num4, num3 );
			}
			else if  (op==3){
				num5=num3;
				num3 = num3 + num4;
				System.out.printf( "%.4f + %.4f = %.4f\n", num5 , num4, num3 );
			}
			else if  (op==4){
				num5=num3;
				num3 = num3 - num4;
				System.out.printf( "%.4f - %.4f = %.4f\n", num5 , num4, num3 );
			}
			else{
				System.out.println(" Operation not recognized.");
			}
			System.out.println("Would you like to keep calculating?\nEnter 1 for yes");
			ans = input.nextInt();
		}
			
	}
}
