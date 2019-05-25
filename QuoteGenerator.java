import java.util.Random;
import java.util.Scanner;

public class QuoteGenerator {

	public static void main(String[] args) {
		System.out.println("What type of quote would you like? Please choose happy (1), whimsical (2), deep (3), funny (4), or surprise(5)!");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		Random randy = new Random();
		sc.close();
		
		if(number == 5) {
			number = randy.nextInt(4)+1;
		}
		
		int randNum = randy.nextInt(10) + 1;
		if (number != 0 && number != 5) {
			if (number == 1) {
				HappyQuotes happy = new HappyQuotes(randNum);
				System.out.println("Your happy quote is " + happy.dictionary());
			}
			else if (number == 2) {
				WhimsyQuotes whimsy = new WhimsyQuotes(randNum);
				System.out.println("Your whimsical quote is " + whimsy.dictionary());
			}
			else if (number == 3) {
				DeepQuotes deep = new DeepQuotes(randNum);
				System.out.println("Your deep quote is " + deep.dictionary());
			}
			else if (number == 4) {
				FunnyQuotes funny = new FunnyQuotes(randNum);
				System.out.println("Your funny quote is " + funny.dictionary());
			}
		}
		
		else {
			System.out.println("Debug error, number is " + number);
		}

	}

}
