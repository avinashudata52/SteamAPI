package Demo.function.Interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class TestPredicateDemo2 {

	public static void main(String[] args) {
		
		Predicate<String> prd = (name)->
		{
			String regEx = "[A-Z/a-z//s]+";
			if(name.matches(regEx))
			{
				return true;
			}
			return false;
		};
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Name");
		String n = sc.nextLine();
		boolean res = prd.test(n);
		if(res)
		{
			System.out.println("Valid Name");
		}
		else
		{
			System.out.println("Not Valid");
		}
	}

}
