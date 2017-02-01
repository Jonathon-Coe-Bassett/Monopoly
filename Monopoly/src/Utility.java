
public class Utility extends Property
	{
	private boolean ownBoth;
	public Utility(String s, int p)
	{
		super.name=s;
		super.price=p;
		owner=null;
	}
	@Override
	protected void landedOn(Player p)
		{
			System.out.println("You have landed on "+ getName());
			if(!owned)
				{
			System.out.println("Would you like to buy " + getName() + "?");
			if(GetInfo.yn())
			{
				p.buy(this);
				this.owned=true;
				this.owner=p;
			}
				}
			else
				{
					
				}
		}

	}
