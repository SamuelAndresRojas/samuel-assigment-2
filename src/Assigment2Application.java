import java.util.Random;
import java.util.Scanner;

public class Assigment2Application {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int randomnumber = random.nextInt(100);
		System.out.println(randomnumber);
		
		System.out.println("Hello, Let's see if you guess the number");
		System.out.println("Pick a number between 1 and 100");
		
		int userinput =  scanner.nextInt();
		if (userinput == randomnumber);
		System.out.println("You win!!!");
			while (randomnumber != userinput) {
			if (userinput == randomnumber);
			System.out.println("You win!!!");				
			if (userinput < randomnumber);
			System.out.println("Please pick a higher number");
			if (userinput > randomnumber);
			System.out.println("Please pick a lower number");
							
			}
	}

}
