import java.util.Scanner;

public class RandomNumberLab3 {
	public static void main( String[] args){
		Scanner input = new Scanner(System.in);
		int gameNum = 0 + (int)(Math.random()*10);
		int guess = 0;
		System.out.println("Guess a number between 0 to 10");
		guess = input.nextInt();
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
