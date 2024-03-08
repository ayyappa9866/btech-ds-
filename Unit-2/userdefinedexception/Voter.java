package userdefinedexception;
public class Voter {
	public void eligibleToVote(int age)throws NotEligibleToVote {
		if(age >= 18) {
			System.out.println("Person is Eligible To Vote");
		}else {
			throw new NotEligibleToVote("Age is Below 18");
		}
	}
}
