
public class FunnyQuotes extends AbsQuotes {
	
	public FunnyQuotes(int num) {
		super(num);
	}
	
	public String dictionary() {
		String quote = "";
		if (num == 1) {
			quote = "'Ha! I pulled the plug! Down the drain with you! Die, fiend! DIE, DIE!'";
		}
		else if (num == 2) {
			quote = "'Leave it to a girl to take all the fun out of sex discrimination.'";
		}
		else if (num == 3) {
			quote = "'Hello, Dad! It is now three in the morning. Do you know where I am?'";
		}
		else if (num == 4) {
			quote = "'Calvin! What are you doing to the coffee table?!...Is this some sort of trick question, or what?'";
		}
		else if (num == 5) {
			quote = "'Make a prediction, Hobbes...Ok, I predict you'll find an irresistible attraction to a mud hole.'";
		}
		else if (num == 6) {
			quote = "'Do you have any money?...Nope...Who do we know that we could sue?'";
		}
		else if (num == 7) {
			quote = "'I still don't think giving her bambi eyes is going to get you a flamethrower.'";
		}
		else if (num == 8) {
			quote = "'Quick, Mom! Aliens just landed in the backyard! They demand to talk to you! You go on out! I'll guard the cookies in the kitchen!'";
		}
		else if (num == 9) {
			quote = "'I take it there's no qualifying exam to be a dad, huh?'";
		}
		else if (num == 10) {
			quote = "'We must've gone back in time instead of forwards!...What tipped you off, the dinosaur?!'";
		}
		
		return quote;
	}
}
