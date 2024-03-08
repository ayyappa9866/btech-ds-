package userdefinedexception;
public class VoterDemo {
	public static void main(String[] args) {
		Voter v1 = new Voter();
		try {
			v1.eligibleToVote(21);
		} catch (NotEligibleToVote e) {
			System.out.println(e.getMessage());
		}
	}
}
