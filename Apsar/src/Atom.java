
public class Atom {

	void addNum()
	{
		System.out.println("addition operation will perform");
		
	}
	
	void addNum(int a)
	{
	char c ='r';
	char d='h';
	float e=10;
	System.out.println("Addition of two numbers is ="+"    "+(c+d+e));
		
		
	}
	public static void main(String[] args) {
		Atom y = new Atom();
		y.addNum();
		y.addNum(10);
	}
}
