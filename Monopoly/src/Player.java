import java.util.ArrayList;
public class Player
	{
		private ArrayList<Property> owned =new ArrayList<Property>();
		private Property location;
		private int money, jailCount;
		private boolean jail;
		public Player()
		{
			money=1500;
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
			p.landedOn(this);
		}
		protected void checkJail()
		{
			if(jail)
				{
					this.setLocation(Board.MAP.getSpace(10));
					//10 is temp
					if(jailCount>=3)
						{
							System.out.println("You're out of jail.");
							jail=false;
						}
					System.out.println("would you like to pay [$50] to get out?");
					if(GetInfo.yn())
						{
							this.setMoney(getMoney()-50);
							jail=false;
						}
					jailCount++;
				}
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
