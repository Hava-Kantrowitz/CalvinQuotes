
public class HappyQuotes extends AbsQuotes {
	
	
	public HappyQuotes(int num) {
		super(num);
	}
	
	public String dictionary() {
		String quote = "";
		if (num == 1) {
			quote = "'Here's a tiger hug for being my best friend.'";
		}
		else if (num == 2) {
			quote = "'You'll always be my kid. I'm glad you're back.'";
		}
		else if (num == 3) {
			quote = "'Here's another math problem I can't figure out. What's 9 + 4?...Ooh, that's a tricky one. Uou have to use calculus and imaginary numbers for this.'";
		}
		else if (num == 4) {
			quote = "'Believe it, lady. You know how Einstein got bad grades as a kid? Well, mine are even worse!'";
		}
		else if (num == 5) {
			quote = "'I haven't shaved for six years. I seem to be cursed with a thin beard.'";
		}
		else if (num == 6) {
			quote = "'Ever notice how tense grownups get when they're recreating?'";
		}
		else if (num == 7) {
			quote = "'Sometimes one should just look at things and think about things, without doing things.'";
		}
		else if (num == 8) {
			quote = "'My transmogrifier gun! Boy, these things come in handly all the time.'";
		}
		else if (num == 9) {
			quote = "'La da dee dee da I think I'll get a bucket...dum de doo...nothing's wrong...da dee doo ba...I just want a bucket to hold some...stuff. Ta tum ta tum let's see, how many buckets do we have? Dum de doo...no need to panic...I just want a few buckets, la la.'";
		}
		else if (num == 10) {
			quote = "'There's never enough time to do all the nothing you want.'";
		}
		
		return quote;
	}

}
