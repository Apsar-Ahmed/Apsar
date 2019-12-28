
public class AddNumbers {
	
	void addNum()
	{
		System.out.println("Adding the Numbees");
	}
	
	void addNum(int a,int b)
	{
		int g = a;
		int h = b;
		int j = g+h;
		System.out.println("Addition of two numers is ="+"   "+ j);
	}
	void addNum(int a,float b)
	{
		int g = a;
		float h = b;
		float j = g+h;
		System.out.println("Addition of two numers is ="+"   "+ j);
	}
	void addNum(float a,double b)
	{
		float g = a;
		double h = b;
		//byte u = c;
		double j = g+h;
		System.out.println("Addition and division of two numers is ="+"   "+ j);
	}
	public static void main(String[] args) {
		
		AddNumbers z = new AddNumbers();
		z.addNum();
		z.addNum(10, 20);
		z.addNum(30, 20.0f);
		z.addNum(13.0f, 15.0);
		
		
	}

}
