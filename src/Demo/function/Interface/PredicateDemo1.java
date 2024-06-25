package Demo.function.Interface;

//here function is subpackage of util package which introduced in jdk1.8
import java.util.function.*;


public class PredicateDemo1 {

	public static void main(String[] args) {
		// () -> { }
		// implementing the method of Predicate using Lambda expression
		Predicate<Integer> pred1 =(p1) ->{
			if(p1>=18)
			{
				return true;
			}
			return false;
		};
		//calling test() method of Predicate using Predicate Object
		boolean status = pred1.test(17);
		if(status)
		{	
			System.out.println("You are eligible for Vote");
		}
		else
		{
			System.out.println("You are not eligible for Vote");
		}
	}

}
