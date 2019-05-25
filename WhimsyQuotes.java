
public class WhimsyQuotes extends AbsQuotes {
	
	
	public WhimsyQuotes(int num) {
		super(num);
	}
	
	public String dictionary() {
		String quote = "";
		if (num == 1) {
			quote = "'Houston, we have a negative on that orbit trajectory.'";
		}
		else if (num == 2) {
			quote = "'Never argue with a six year old who shaves.'";
		}
		else if (num == 3) {
			quote = "'Hey Hobbes, want to go time traveling with me?'";
		}
		else if (num == 4) {
			quote = "'Well, if you didn't get into a fight at school, what on earth happened to you?...Let's just say sometimes I wish I had a gerbil.'";
		}
		else if (num == 5) {
			quote = "'Animals sometimes make a lot more sense than people do...And we're cuter, too!'";
		}
		else if (num == 6) {
			quote = "'I call a ten-year timeout to grow some more.'";
		}
		else if (num == 7) {
			quote = "'1812! Gettysburg! 16 fluid ounces! I before E! Thomas Edison!...Perhaps someone who has been paying attention can help out Calvin?'";
		}
		else if (num == 8) {
			quote = "'Santa Claus: Kindly old elf, or CIA spook?'";
		}
		else if (num == 9) {
			quote = "'It's him! It's Santa! Shhh! He's saying something!...Slippin' rippin' dang fang rotten zarg barg-a-ding dong!...Quiet, dear! Calvin willl hear you!'";
		}
		else if (num == 10) {
			quote = "'Nobody ever closed a school on account of prettiness.'";
		}
		
		return quote;
	}

}
