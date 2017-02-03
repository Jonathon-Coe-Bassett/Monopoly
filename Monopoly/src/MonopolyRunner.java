import java.util.*;
public class MonopolyRunner
	{
		public static final Board MAP=new Board();
		public static Player player1=new Player();
		public static void main(String[] args)
			{
				welcomePlayer();
				MAP.fillBoard();
				player1.gameDriver();
			}
		public static void welcomePlayer()
		{
			System.out.println("Welcome to Monopoly!");
			System.out.println("You are on GO");
			System.out.println("Press enter to begin.");
			Scanner ui=new Scanner(System.in);
			String in=ui.nextLine();
		}
		

	}
