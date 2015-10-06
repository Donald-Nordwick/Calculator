import java.util.Scanner;
public class RockPaperScissors {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int i = 0;
		int compScore = 0;
		int humScore = 0;
		int humAns = 0;
		int compAns = 0;
		String response1;
		
		System.out.println("We will be playing a game of Rock-Paper-Scissors.");
		while(i==0){
			
			compAns = 1 + (int)(Math.random()*3);
			System.out.printf("Choose Rock (1), Paper (2), or Scissors(3) with their respective number.\n");
			humAns = input.nextInt();
			if (compAns == 1){
				System.out.println("Computer chose Rock.");
			}
			else if (compAns == 2){
				System.out.println("Computer chose Paper.");
			}
			else{
				System.out.println("Computer chose Scissors.");
			}
			if ((humAns>3)||(humAns<1)){
				System.out.println("Please choose a real answer.");
			}
			if((humAns<=3)&&(humAns>=1)){
				if (humAns == compAns + 1){
					response1=(humAns==2)?"Congrats. Paper beats Rock.\n":"Congrats. Scissors beats Paper.\n";
					System.out.printf(response1);
					humScore +=1;
				}
				else if (humAns == compAns - 1){
					response1=(humAns==2)?"Sorry. Scissors beats Paper.\n":"Sorry. Paper beats Rock.\n";
					System.out.printf(response1);
					compScore +=1;
				}
				else if (humAns == compAns - 2){
					System.out.println("Congrats. Rock beats Scissors.\n");
					humScore +=1;
				}
				else if (compAns == humAns-2){
					System.out.println("Sorry. Rock beats Scissors.\n");
					compScore +=1;
				}
				else{
					System.out.println("Its a tie.\n");
				}
			}
			System.out.printf("Computer Score:%d\nHuman Score:%d\n"
					+ "Would you like to play again? Enter 0 for yes.",compScore,humScore);
			i=input.nextInt();
		}
	}
}
