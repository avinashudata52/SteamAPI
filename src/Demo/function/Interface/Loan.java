package Demo.function.Interface;

import java.util.Scanner;
import java.util.function.Predicate;

class PersonalLoan
{
	private double income;
	private String jobtype;
	private String nationality;
	private String IncomeTaxStatus;
	private int creditScore;
	public PersonalLoan(double income, String jobtype, String nationality, String incomeTaxStatus, int creditScore) 
	{
		super();
		this.income = income;
		this.jobtype = jobtype;
		this.nationality = nationality;
		IncomeTaxStatus = incomeTaxStatus;
		this.creditScore = creditScore;
	}
	public double getIncome() {
		return income;
	}
	public String getJobtype()
	{
		return jobtype;
	}
	public String getNationality() 
	{
		return nationality;
	}
	public String getIncomeTaxStatus() 
	{
		return IncomeTaxStatus;
	}
	public int getCreditScore() 
	{
		return creditScore;
	}
	@Override
	public String toString() 
	{
		return "PersonalLoan [income=" + income + ", jobtype=" + jobtype + ", nationality=" + nationality
				+ ", IncomeTaxStatus=" + IncomeTaxStatus + ", creditScore=" + creditScore + "]";
	}
	public static boolean test(PersonalLoan pl) {
		// TODO Auto-generated method stub
		return false;
	}
}

public class Loan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your income in month");
		double income = sc.nextDouble();
		
		System.out.println("Enter Job Type");
		String jobtype = sc.next();
		
		System.out.println("Enter Nationality");
		String nationality = sc.next();
		
		System.out.println("IncomeTaxStatus");
		String IncomeTaxStatus = sc.next();
		
		System.out.println("CreditScore");
		int crediscore = sc.nextInt();
		
		//  based on input I am going to Construct object of PersonalLoan
		PersonalLoan pl = new PersonalLoan(income, jobtype, nationality, IncomeTaxStatus, crediscore);
		
		Predicate<PersonalLoan> Loan=(ploan)->
		{
			
			// reading all value from PersonalLoan object by calling getter method
			double salary  = ploan.getIncome();
			String jt=ploan.getJobtype();
			String nat=ploan.getNationality();
			String incn=ploan.getIncomeTaxStatus();
			int cred=ploan.getCreditScore();
			if(salary>30000.00 && jt.equals("permanent") && nat.equals("India") && 
					incn.equals("ok") && cred>500)
				return true;
			
				return false;
		};
			boolean Status=PersonalLoan.test(pl);
			if(Status)
			{
				System.out.println("Valid");
			}
			else
			{
				System.out.println("Not valid");
			}
			
	}

}



















