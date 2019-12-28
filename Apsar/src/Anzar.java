
public class Anzar {
	String Bottlecolour = "Blue colour bottle";
	void fills()
	{
		
		Water w = new Water();
		System.out.println(w.name);
		
		
	}
	public class Water
	{
		String name = "Anzar fills water in the bottle";
	}
		public static void main(String[] args) {
			
			Anzar a = new Anzar();
			System.out.println(a.Bottlecolour);
			a.fills();
		}
	}

