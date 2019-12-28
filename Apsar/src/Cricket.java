
public class Cricket {
	
	public static void main(String[] args) {
		
		String s = new String("Sachin");
		String s1 = new String("SACHIn");
		
		if(s.equalsIgnoreCase(s1))
		{
			System.out.println(s.hashCode());
			System.out.println(s1.hashCode());
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
