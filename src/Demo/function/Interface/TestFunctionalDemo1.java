package Demo.function.Interface;

import java.util.Scanner;
import java.util.function.Function;

public class TestFunctionalDemo1 {

	public static void main(String[] args) {
		Function<Integer,String> fun1=(num)->
		{
			if(num==1)
			{
				return "january";
			}else if(num==2)
			{
				return "feb";
			}
			else if(num==3)
			{
				return "march";
			}
			else if(num==4)
			{
				return "April";
			}
			return "Invalid input";
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month number");
		int month = sc.nextInt();
		String month_in_words = fun1.apply(month);
		System.out.println(" "+month+ " "+"is"+" "+month_in_words);
	}

}
