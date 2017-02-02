import java.util.ArrayList;

public class Board
	{
		ArrayList<Property> gameBoard;
		public Board()
		{
			gameBoard =new ArrayList<Property>();
			gameBoard.add(null);
			gameBoard.add(0, new Square("GO", 200, false));
		}
		public void fillBoard()
		{
			gameBoard.add(new ColoredProperty("Old Kent Road", 50));
			gameBoard.add(new Utility("Electric CO", 50));
			gameBoard.add(new ColoredProperty("Baltic Avenue", 0));
			gameBoard.add(new Square("Income Tax", -200, false));
			gameBoard.add(new ColoredProperty("Railroad Marylebone Station", 500));

			//more to be added
		}
		public ArrayList<Property> getGameBoard()
			{
				return gameBoard;
			}
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
	}
