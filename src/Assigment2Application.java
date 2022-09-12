import java.util.Random;
import java.util.Scanner;

public class Assigment2Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		Random random = new Random();

		int randomnumber = random.nextInt(100) + 1;

//		System.out.println(randomnumber);

		System.out.println("Hello, Let's see if you guess the number");
		System.out.println("Pick a number between 1 and 100");

		int tries = 0;	
		while(tries < 5) {
			int userInput =  scanner.nextInt();
			if (userInput == randomnumber) {
				System.out.println("Really Good, You win!!!");
				break;
			}else if (userInput < 1 || userInput > 100) {
				System.out.println("Your guess is not between 1 and 100, please try again");
			}else if (userInput < randomnumber) {
				tries++;
				System.out.println("Please pick a higher number ");
			}else if (userInput > randomnumber){
				tries++;
				System.out.println("Please pick a lower number ");
			}
			
		} if (tries == 5) {
			System.out.println("You Lose");
			System.out.println("The number was: " + randomnumber );
		}
			
		scanner.close();
	}
}
