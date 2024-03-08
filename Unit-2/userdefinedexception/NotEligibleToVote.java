package userdefinedexception;

public class NotEligibleToVote extends Exception{
	public NotEligibleToVote(String message) {
		super(message);
	}
}
