
public class Arithmatic {

	String arith()
	{
		byte a = 3;
		short b = 10;
		int c = 15;
		float e = 15.0f;
		//char g = 'A';
	    float   h = (a*b+c)/e;
		return "by performing all Arithmatic operations we get"+h;
	}

	public static void main(String[] args) {
		
		Arithmatic m = new Arithmatic();
		System.out.println(m.arith());
		
	}
	}
