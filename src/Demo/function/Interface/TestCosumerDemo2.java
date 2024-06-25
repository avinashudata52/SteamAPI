package Demo.function.Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class TestCosumerDemo2 {

	public static void main(String[] args) {
		Consumer<List<Double>> con = (listOfSalary)->
		{
			for(Double d:listOfSalary)
			{
				if(d>15000.00)
				{
					System.out.println(d);
				}
			}
		};
		//return;
		List<Double> list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary of 5 Employee");
		for(int i=0; i<5; i++)
		{
			System.out.println("enter salary for"+" "+(i+1)+" "+"emp");
			double sal = sc.nextDouble();
			list.add(sal);
		}
		con.accept(list);

	}

}
