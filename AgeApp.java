package exceptionAssignment;

class AgeException extends Exception{
	String message;

	public AgeException(String message) {
		super();
		this.message = message;
		System.out.println("This is a constructor in Age exception class:");
	}
}
class CheckEligibility{
	void checkAge(int age) throws AgeException
	{
		if(age>18)
		{
			throw new AgeException("You are eligible for vote");
		}
		else
		{
			System.out.println("you are Not eligible for vote");
		}
	}
}
public class AgeApp {

	public static void main(String[] args) throws AgeException
	{
		CheckEligibility obj=new CheckEligibility();
		obj.checkAge(10);
	}

}
