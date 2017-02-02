
public class ColoredProperty extends Property
	{
		
		private int houses, hotels;
		String color;
		public ColoredProperty(String s, int p)
		{
			super.name=s;
			super.price=p;
			owner=null;
			owned=false;
			houses=0;
			hotels=0;
			color=null;
		}
		protected boolean isOwned()
			{
				return owned;
			}

		protected void setOwned(boolean isOwned)
			{
				this.owned = isOwned;
			}

		@Override
		protected void landedOn(Player p)
			{
				System.out.println("You have landed on "+ getName());
				if(!owned)
				System.out.println("Would you like to buy " + getName() +" for "+ getPrice() + "?");
				if(GetInfo.yn())
				{
					p.buy(this);
					this.owned=true;
					this.owner=p;
				}
			}
		public int getHouses()
			{
				return houses;
			}
		public void setHouses(int houses)
			{
				this.houses = houses;
			}
		public int getHotels()
			{
				return hotels;
			}
		public void setHotels(int hotels)
			{
				this.hotels = hotels;
			}
	}
