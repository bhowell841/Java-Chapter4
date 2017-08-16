import java.security.SecureRandom;

/*
 * Brendan Howell
 * CSC-151
 * 
 * Dice Game Project
 * Program creates a loop that runs 
 * ten times and generates random numbers 
 * between 1 and 6 assigning a win to the 
 * higher number, and printing a final score.
 */
public class DiceGame {

	public static void main(String[] args) {
		//Declare Variables
		int computer = 0;
		int human = 0;
		int computerScore = 0;
		int humanScore = 0;
		
		//  instance of securerandom
		SecureRandom rand = new SecureRandom();
			
		// pick number from 1 = 6
		int num;
		
		for (int rounds = 1; rounds <=10; rounds++){
			
				System.out.println("Round " + rounds);
			
				num = 1 + rand.nextInt(6);
				computer = num;
				System.out.println("Computer score : " + num);	
			
				num = 1 + rand.nextInt(6);
				human = num;
				System.out.println("Your score : " + num);
			
				// Decision statement
				if (computer > human){
					computer++;
				}
				else
					if (human > computer){
						humanScore++;
					}
		} // End Loop
		
		// Winner Statement
		if (computerScore > humanScore){
			System.out.println("The computer wins: " + computerScore + "-" 
					+ humanScore);
		}
		else
			if (humanScore > computerScore){
				System.out.println("You win: " + humanScore + "-" 
						+ computerScore);
			}
			else{
				System.out.println("The score is tied: " + computerScore + "-" + humanScore);
			}
				
	} // End Main

} //  End Class
