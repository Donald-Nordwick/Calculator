import java.util.Scanner;

public class RandomNumberLab3 {
	public static void main( String[] args){
		Scanner input = new Scanner(System.in);
		int gameNum = 0 + (int)(Math.random()*10);
		int guess = 0;
		System.out.printf("Guess a number between 0 to 10. %d",gameNum);
		guess = input.nextInt();
		if ((guess<0)||(guess>10)){
			System.out.println("You choose a number not between 0 and 10.");
		}
		if ((guess>=0)&&(guess<=10)){
				
			if (guess==gameNum){
				System.out.println("Congrats!!! You guessed correctly.");
			}
			else if (guess>gameNum){
				System.out.println("You guessed wrong. Your number was too high.");
			}
			else{
				System.out.println("You guessed wrong. Your number was too low.");
			}
		}
	}
}


