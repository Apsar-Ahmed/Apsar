
public class Son11 extends Father11 {

	@Override
	void drive() {
		// TODO Auto-generated method stub
		
		System.out.println("He know driving");
	}
	
	void smoke()
	{
		System.out.println("He smokes alot");
	}
	
	public static void main(String[] args) {
		
		Father11 f = new Son11();
		f.drive();
		f.smoke();
	}

}
