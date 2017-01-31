
public abstract class Property
	{
		protected String name;
		protected int price;
		protected abstract void landedOn();
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
