
public class Borewell {
	void pump()
	{
		Water w = new Water();

		System.out.println(w.name);
	}
	public class Water {
		String name = "why Apsar is pumping water";
	}


	public static void main(String[] args) {
		Borewell b = new Borewell();
		b.pump();
	}

}





























