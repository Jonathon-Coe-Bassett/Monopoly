
public class Square extends Property
	{
		private boolean toJail;
		private int space;
		public Square(String s, int p, boolean t)
		{
			super.name=s;
			super.price=p;
			owner=null;
			toJail=t;
			space=(Board.MAP.size()-1);
		}
	@Override
	protected void landedOn(Player p)
		{
			System.out.println("You have landed on " + getName());
			if(toJail)
				{
					p.setJail(true);
				}
			p.setMoney(p.getMoney()+price);
		}

	}
