import java.util.ArrayList;
public class Player
	{
		private ArrayList<Property> owned =new ArrayList<Property>();
		private Property location;
		private int money, jailCount;
		private boolean jail;
		public static boolean run;
		public Player()
		{
			money=1500;
			location=MonopolyRunner.MAP.getSpace(0);
			jail=false;
			run=true;
		}
		public void gameDriver()
			{
				while(run)
					{
				this.checkBankrupcy();
				this.checkJail();
				this.move();
				this.landsOn(this.getLocation());
					}
			}
		protected void printInfo()
		{
			
		}
		protected void buy(Property p)
		{
			owned.add(p);
			money-=p.getPrice();
		}
		protected void landsOn(Property p)
		{
			System.out.println("You are on " +p.getName() + ".");
			p.landedOn(this);
		}
		protected void move()
		{
			int y = GetInfo.rollDice(2, 6);

			if(y + MonopolyRunner.MAP.getGameBoard().indexOf(this.location)>=MonopolyRunner.MAP.getGameBoard().size())
				{
//					x=(0+(MonopolyRunner.MAP.getGameBoard().size()-MonopolyRunner.MAP.getGameBoard().indexOf(this.getLocation())));
					y = (y + MonopolyRunner.MAP.getGameBoard().indexOf(this.location))- MonopolyRunner.MAP.getGameBoard().size();
				}
			this.setLocation(MonopolyRunner.MAP.getSpace(y));
		}
		public static boolean isRun()
			{
				return run;
			}
		public static void setRun(boolean run)
			{
				Player.run = run;
			}
		protected void checkBankrupcy()
		{
			if(this.getMoney()<=0)
				{
					System.out.println("GAME OVER");
					this.run=false;
				}
		}
		
		protected void displayOwned()
		{
			for(Property p: owned)
				{
					System.out.println(p.getName());
				}
		}
		protected void checkJail()
		{
			if(jail)
				{
					this.setLocation(MonopolyRunner.MAP.getSpace(10));
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
