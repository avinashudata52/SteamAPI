package Demo.function.Interface;

import java.util.*;
import java.util.function.Consumer;

public class TestConsumerAssi {
	public static void main(String args[])
	{
		Consumer<List<String>> con = (listCandidate)->{
			for(int i=0; i<listCandidate.size(); i++)
			{
				String name=listCandidate.get(i);
				System.out.println(name.toUpperCase());
			}
		};
		List<String> list = new ArrayList();
		list.add("Avinash");
		list.add("Yuvraj");
		con.accept(list);
	}
	
}
