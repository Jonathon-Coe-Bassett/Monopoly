
public class CardSquare extends Property 
{
	public CardSquare(String s, int p)
	{
		super.name=s;
		super.price=p;
		owner=null;
		//space=(getNextSpace());
	}
	@Override
	protected void landedOn(Player p) {
		System.out.println("You have landed on " + getName());
		
	}

}
