
public class DeepQuotes extends AbsQuotes {
	
	public DeepQuotes(int num) {
		super(num);
	}
	
	public String dictionary() {
		String quote = "";
		if (num == 1) {
			quote = "'When you're old, you'll wish you had more than memories of this tripe to look back on.'";
		}
		else if (num == 2) {
			quote = "'I think it's better to accept danger and live life to the fullest! I take it by your silence that you agree.'";
		}
		else if (num == 3) {
			quote = "'How come we play war and not peace?...Too few role models.'";
		}
		else if (num == 4) {
			quote = "'Do you ever wonder if the person in the puddle is real, and you're just a reflection of him?'";
		}
		else if (num == 5) {
			quote = "'War is a manly art!...I suppose anything so idiotic would have to be.'";
		}
		else if (num == 6) {
			quote = "'You know, there are times when it's a source of personal pride to not be human.'";
		}
		else if (num == 7) {
			quote = "'Someday I hope you have a kid that puts you through what I've gone through...Yeah, Grandma says that's what she used to tell you.'";
		}
		else if (num == 8) {
			quote = "'You know, Calvin, sometimes the anticipation of something is more fun than the thing itself once you get it.'";
		}
		else if (num == 9) {
			quote = "'Sometimes it's good to hush up a while and let autumn stick in a few words.'";
		}
		else if (num == 10) {
			quote = "'Why do you suppose we're here?...Because we walked here.'";
		}
		
		return quote;
	}
}
