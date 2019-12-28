
public class Constructor {
	
	public Constructor()
	{
		this(20);
		System.out.println("He issues tickets");
	}
	
	public Constructor(int price)
	{
		this(25,365);
		System.out.println("He issues tickets of cost"+"   "+price);
	}
	
	public Constructor(int price , int bus_num)
	{
		System.out.println(price +"   "+bus_num);
	}
	
public static void main(String[] args) {
	
	Constructor c = new Constructor();
	
}

}
