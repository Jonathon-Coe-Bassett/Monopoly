import java.util.ArrayList;
public class Player
	{
		private ArrayList<Property> owned =new ArrayList<Property>();
		private Property location;
		private int money;
		private boolean jail;
		public Player()
		{
			money=0;
			//location=Board.get(0);
			jail=false;
		}
		protected void buy(Property p)
		{
			owned.add(p);
			money-=p.getPrice();
		}
		protected void landsOn(Property p)
		{
			p.landedOn();
		}
		protected ArrayList<Property> getOwned()
			{
				return owned;
			}
		protected void setOwned(ArrayList<Property> owned)
			{
				this.owned = owned;
			}
		protected Property getLocation()
			{
				return location;
			}
		protected void setLocation(Property location)
			{
				this.location = location;
			}
		protected int getMoney()
			{
				return money;
			}
		protected void setMoney(int money)
			{
				this.money = money;
			}
		protected boolean isJail()
			{
				return jail;
			}
		protected void setJail(boolean jail)
			{
				this.jail = jail;
			}
	}
