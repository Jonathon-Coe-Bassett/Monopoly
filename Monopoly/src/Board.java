import java.util.ArrayList;

public class Board
	{
		ArrayList<Property> gameBoard;
		public static int jailIndex;
		public Board()
		{
			gameBoard =new ArrayList<Property>();
			//gameBoard.add(null);
			gameBoard.add(0, new Square("GO", 200, false));
		}
		public void fillBoard()
		{
			gameBoard.add(new ColoredProperty("Old Kent Road", 60));
			gameBoard.add(new CardSquare("Community Chest", 1));
			gameBoard.add(new ColoredProperty("Baltic Avenue", 60));
			gameBoard.add(new Square("Income Tax", -200, false));
			gameBoard.add(new ColoredProperty("Railroad Marylebone Station", 500));
			gameBoard.add(new ColoredProperty("Oriental Avenue", 100));
			gameBoard.add(new CardSquare("Chance", 0));
			gameBoard.add(new ColoredProperty("Vermont Avenue", 100));
			gameBoard.add(new ColoredProperty("Connecticut Avenue", 100));
			gameBoard.add(new Square("JAIL", 0, false)); /*SUPER IMPORTANT*/jailIndex=gameBoard.size()-1;
			gameBoard.add(new ColoredProperty("St. Charles Place", 140));
			gameBoard.add(new Utility("Electric CO", 150));
			gameBoard.add(new ColoredProperty("States Avenue", 140));
			gameBoard.add(new ColoredProperty("Virginia Avenue", 160));
			gameBoard.add(new ColoredProperty("Railroad Pennsylvania", 200));
			gameBoard.add(new ColoredProperty("St. James Place", 180));
			gameBoard.add(new CardSquare("Community Chest", 1));
			gameBoard.add(new ColoredProperty("Tennessee Avenue", 180));
			gameBoard.add(new ColoredProperty("New York Avenue", 200));
			gameBoard.add(new Square("Free Parking", 0, false));
			gameBoard.add(new ColoredProperty("Kentucky Avenue", 220));
			gameBoard.add(new CardSquare("Chance", 0));
			gameBoard.add(new ColoredProperty("Indiana Avenue", 220));
			gameBoard.add(new ColoredProperty("Illinois Avenue", 240));
			gameBoard.add(new ColoredProperty("Railroad B&O", 200));
			gameBoard.add(new ColoredProperty("Atlantic Avenue", 260));
			gameBoard.add(new ColoredProperty("Ventnor Avenue", 260));
			gameBoard.add(new Utility("Water Works", 150));
			gameBoard.add(new Square("Go to Jail", 0, true));
			gameBoard.add(new ColoredProperty("Pacific Avenue", 300));
			gameBoard.add(new ColoredProperty("North Carolina Avenue", 300));
			gameBoard.add(new CardSquare("Community Chest", 1));
			gameBoard.add(new ColoredProperty("Pennsylvania Avenue", 320));
			gameBoard.add(new ColoredProperty("Railroad Short Line", 200));
			gameBoard.add(new CardSquare("Chance", 0));
			gameBoard.add(new ColoredProperty("Park Place", 350));
			gameBoard.add(new Square("Luxury Tax", -100, false));
			gameBoard.add(new ColoredProperty("Boardwalk", 400));
			//phew
			
		}
//		public ArrayList<Property> getGameBoard()
//			{
//				return gameBoard;
//			}
		public void setGameBoard(ArrayList<Property> gameBoard)
			{
				this.gameBoard = gameBoard;
			}
		public Property getSpace(int x)
		{
			return this.gameBoard.get(x);
		}
		public int size()
		{
			return gameBoard.size();
		}
		public ArrayList<Property> getGameBoard() {
			// TODO Auto-generated method stub
			return this.gameBoard;
		}
	}
