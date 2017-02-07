import java.io.IOException;
import java.util.*;
public class MonopolyRunner
	{
		public static final Board MAP=new Board();
		public static Edition edition;
		public static Player player1;
		public static void main(String[] args) throws IOException
			{
				welcomePlayer();
				//MAP.fillClassicBoard();
				player1.gameDriver();
			}
		public static void welcomePlayer() throws IOException
		{
			System.out.println("Welcome to Monopoly!");
			edition=(Edition.askEditions());
			MAP.setGameBoard(edition.getMap());
			player1=new Player();
			System.out.println("You are on " + MAP.getGameBoard().get(0).getName() + " and have " + player1.getMoney() + " " + edition.getCurrency());
			System.out.println("Press enter to begin.");
			Scanner ui=new Scanner(System.in);
			String in=ui.nextLine();
		}
		

	}
