import java.util.*;
public class GetInfo
	{
		public static boolean yn()
		{
			System.out.println("Answer yes[y] or no[n].");
			Scanner ui=new Scanner(System.in);
			String in=ui.nextLine();
			if(in.equals("y") || in.equals("yes"))
					return true;
			return false;
		}
		public static int rollDice (int a, int b)
			{
				//a is times, b is sides
				int count=0;
				int total=0;
				while(count<a)
					{
						int roll=(int)((Math.random()*b)+1);	
						total=total+roll;
						count++;
					}
				return total;
				
			}
	}
