
public class Sample {

	int q=10;
	void m1()
	{
		int x = 234;
		System.out.println("value is given");
		
	}
	static double m1(String s)
	{
		int x = 235;
		System.out.println("value is"+s);
		return x;
	}
	static int m1(int a , long i)
	{
		int x = 236;
		System.out.println("value is given"+"  "+a+"   "+i);
		return x;
	}
	static int m1(byte a , int b , int c)
	{
		int y = 239;
		System.out.println("value is given"+"  "+a+"  "+b+"  "+c);
		return y;
	}
	public static void main(String[] args) {
		
		Sample p = new Sample();
		System.out.println(p.q);
		System.out.println(p.m1("Roshan"));
		System.out.println(p.m1(10, 55));
		System.out.println(p.m1((byte) 5, 6, 7));
		
	}
}
