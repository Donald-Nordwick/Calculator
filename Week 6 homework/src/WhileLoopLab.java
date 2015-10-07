
import java.util.Scanner;
public class WhileLoopLab {

	public static void main( String[] args){
		Scanner input = new Scanner(System.in);
		int gameNum = 0 + (int)(Math.random()*10);
		int guess = 0;
		int i = 0;
		String response;
		System.out.printf("Guess a number between 0 to 10.\nYou will be given 3 tries \n",gameNum);
		
		while (i<3){
			guess = input.nextInt();
			if ((guess<0)||(guess>10)){
				System.out.println("You choose a number not between 0 and 10.");
				if (i<3){
					System.out.println("Try again");
				}
			}
			if ((guess>=0)&&(guess<=10)){
				if (guess==gameNum)	{
					System.out.println("You guessed correctly");
					i=3;
				}
				else{
				response=(guess>gameNum)?"You guessed too high\n":"You guessed too low.\n";
				System.out.printf(response);
				if (i<2){
					System.out.println("Try again");
				{
				}
			}
			
			i+=1;
		}
			}}}}


