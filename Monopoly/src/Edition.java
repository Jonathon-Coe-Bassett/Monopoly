import java.io.IOException;
import java.util.*;

public class Edition
	{
		private static ArrayList<Edition> editions=new ArrayList<>();
		private String name;
		private String currency;
		private  ArrayList<Property> map;
		public Edition(String n, String c, ArrayList<Property> m)
		{
			currency=c;
			map=m;
			name=n;
		}
		private static void makeEditions() throws IOException
		{
			//Edition classic=new Edition("Classic", "dollars", Board.fillClassicBoard());
			editions.add(new Edition("CO 14ers", "pelts", Board.fill14erBoard()));
			editions.add(new Edition("Classic", "dollars", Board.fillClassicBoard()));
			
		}
		public String getCurrency()
			{
				return currency;
			}
		public static Edition askEditions() throws IOException
		{
			makeEditions();
			System.out.println("Editions are:");
			int i=1;
			for(Edition e: editions)
				{
					System.out.println(i + ")  " + e.getName());
					i++;
				}
			System.out.println("Input the number of which you'd like to play!");
			Scanner ui=new Scanner(System.in);
			int e=ui.nextInt();
			return editions.get(e-1);
			
		}
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public ArrayList<Property> getMap()
		{
			return this.map;
			
		}
	}
