import java.util.*;
public class Player
	{
		private ArrayList<Property> owned =new ArrayList<Property>();
		private Property location;
		private int index;
		private int money, jailCount;
		private boolean jail;
		public static boolean run;
		private boolean directionNormal;
		public Player()
		{
			money=1500;
			location=MonopolyRunner.MAP.getSpace(0);
			jail=false;
			run=true;
			index=0;
			directionNormal=true;
		}
		public void gameDriver()
			{
				while(run && this.checkBankrupcy())
					{
				this.checkJail();
				this.printInfo();
				this.move();
				this.landsOn(this.getLocation());
					}
			}
		protected void printInfo()
		{
			System.out.println();
			System.out.println("You have " + this.getMoney() + " " + MonopolyRunner.edition.getCurrency());
			System.out.println("You are on " + this.getLocation().getName() + ".");
			System.out.println("You own these squares:");
			for(Property p: this.owned)
			{
				System.out.println("  " + p.getName() + "  $" + p.getPrice() + ".00");
			}
		}
		protected void buy(Property p)
		{
			owned.add(p);
			money-=p.getPrice();
		}
		protected void landsOn(Property p)
		{
			//System.out.println("You are on " +p.getName() + ".");
			p.landedOn(this);
		}
		protected void move()
		{
//			int y = GetInfo.rollDice(2, 6);
//
//			if(y + MonopolyRunner.MAP.getGameBoard().indexOf(this.location) > MonopolyRunner.MAP.getGameBoard().size())
//				{
////					x=(0+(MonopolyRunner.MAP.getGameBoard().size()-MonopolyRunner.MAP.getGameBoard().indexOf(this.getLocation())));
//					y = (y + MonopolyRunner.MAP.getGameBoard().indexOf(this.location))- MonopolyRunner.MAP.getGameBoard().size();
//					System.out.println("You passed GO: collected $200.00");
//					this.setMoney(this.getMoney()+200);
//				}
//			this.setLocation(MonopolyRunner.MAP.getSpace(y));
//			System.out.println();
			
			System.out.println("Press enter to roll.");
			Scanner ui=new Scanner(System.in);
			String in=ui.nextLine();
			int y = GetInfo.rollDice(2, 6);
			if(this.directionNormal)
				{
			if((this.getIndex() + y) >= MonopolyRunner.MAP.getGameBoard().size())
				{
					y=(MonopolyRunner.MAP.getGameBoard().size()+y)-MonopolyRunner.MAP.getGameBoard().size();
					this.setIndex(y);
					y=0;
					this.setMoney(this.getMoney()+200);
					System.out.println("Passed " + MonopolyRunner.MAP.getGameBoard().get(0) + ", gained 200 " + MonopolyRunner.edition.getCurrency());
				}
			this.setLocation(MonopolyRunner.MAP.getGameBoard().get(this.getIndex()+y));
			
				}
			else
				{
					if((this.getIndex() - y) < 0)
						{
							y=(MonopolyRunner.MAP.getGameBoard().size()+y)-MonopolyRunner.MAP.getGameBoard().size();
							this.setIndex(y);
							y=0;
							this.setMoney(this.getMoney()-200);
							System.out.println("Passed " + MonopolyRunner.MAP.getGameBoard().get(0) + ", lost 200 " + MonopolyRunner.edition.getCurrency());
						}
					this.setLocation(MonopolyRunner.MAP.getGameBoard().get(this.getIndex()-y));
					
				}
			
		}
		public int getIndex()
			{
				return index;
			}
		public void setIndex(int index)
			{
				this.index = index;
			}
		public static boolean isRun()
			{
				return run;
			}
		public static void setRun(boolean run)
			{
				Player.run = run;
			}
		protected boolean checkBankrupcy()
		{
			if(this.getMoney()<=0)
				{
					System.out.println("GAME OVER");
					this.run=false;
					return false;
				}
			return true;
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
			while(jail)
				{
					this.setLocation(MonopolyRunner.MAP.getSpace(Board.jailIndex));
					this.directionNormal=false;
					if(jailCount>=20)
						{
						System.out.println("You're out of " + MonopolyRunner.MAP.getGameBoard().get(Board.jailIndex));
							jail=false;
						}
					System.out.println("Would you like to pay off the city [1000.00 " + MonopolyRunner.edition.getCurrency() + "] to get out?");
					if(GetInfo.yn())
						{
							this.setMoney(getMoney()-1000);
							System.out.println("You're out of jail.");
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
				index=MonopolyRunner.MAP.getGameBoard().indexOf(location);
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
