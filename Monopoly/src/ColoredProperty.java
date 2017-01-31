
public class ColoredProperty extends Property
	{
		private boolean isOwned;

		protected boolean isOwned()
			{
				return isOwned;
			}

		protected void setOwned(boolean isOwned)
			{
				this.isOwned = isOwned;
			}

		@Override
		protected void landedOn()
			{
				System.out.println("Would you like to buy " + getName() + "?");
			}
	}
