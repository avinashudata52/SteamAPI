package Demo.function.Interface;

import java.util.Scanner;
import java.util.function.*;

class User{
		private String userName;
		private String userPassword;
		public User(String userName,String userPassword)
		{
			super();
			this.userName=userName;
			this.userPassword =userPassword ;
			
		}
		public String getUserName()
		{
			return userName;
		}
		public String getuserPassword()
		{
			return userPassword;
		}
}
public class TestPredicateDemo3 {

		public static void main(String[] args) {
		
		Predicate<User> predicateObj=(u)->
		{
			if(u.getUserName().equalsIgnoreCase("admin") &&
					u.getuserPassword().equals("admin@123"))
			{
				return true;
			}
			return false;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter user name");
			String un = sc.next();
			System.out.println("Enter user password");
			String pw = sc.next();
			
			User uObj = new User(un,pw);
			boolean res = predicateObj.test(uObj);
			if(res)
			{
				System.out.println(" "+"welcome"+ " "+un);
			}
			else
			{
				System.out.println("Invalid Credential");
			}
				
		};
		
	}
}
}
