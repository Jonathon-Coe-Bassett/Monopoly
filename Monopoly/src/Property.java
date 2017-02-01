
public abstract class Property
	{
		protected String name;
		protected int price;
		protected Player owner;
		protected boolean owned;
//		public Property(String s, int p)
//		{
//			name=s;
//			price=p;
//		}
		protected abstract void landedOn(Player p);
		protected String getName()
			{
				return name;
			}
		protected void setName(String name)
			{
				this.name = name;
			}
		protected int getPrice()
			{
				return price;
			}
		protected void setPrice(int price)
			{
				this.price = price;
			}
	}
