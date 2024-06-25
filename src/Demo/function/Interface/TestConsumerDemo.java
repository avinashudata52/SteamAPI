package Demo.function.Interface;

import java.util.function.Consumer;

public class TestConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<Integer> con =(day)->
		{
			if(day==1)
			{
				System.out.println("Monday");
			}
			else if(day==2)
			{
				System.out.println("Tuesday");
			}
			else if(day==3)
			{
				System.out.println("wenesday");
			}
			else {
				System.out.println("no valid inout");
			}
		};
		con.accept(4);
	}

}
