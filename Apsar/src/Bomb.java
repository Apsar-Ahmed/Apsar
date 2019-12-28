
public class Bomb {
	
	int add(int a,int b)
	{
		System.out.println("addition of two numbers");
	return a+b;	
	}
	
	int add(int a,int b,int c)
	{
		System.out.println("addition of three numbers");
	return a+b+c;	
	}
	
	int add(int a,int b,int c,int d)
	{
		System.out.println("addition of four numbers");
	return a+b+c+d;	
	}
	
	public static void main(String[] args) {
		
		Bomb t = new Bomb();
		System.out.println(t.add(10, 20));
		System.out.println(t.add(11, 23, 21));
		System.out.println(t.add(11, 15, 17, 19));
		
		
	}

}
