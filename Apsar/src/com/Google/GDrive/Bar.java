package com.Google.GDrive;

public class Bar {

	void supplyDrink()
	{
		System.out.println("Bar supplies drinks");
	}
	
	void supplyDrink(int price)
	{
		System.out.println("bar supplies drint with cost"+"   "+price);
	}

	void supplyDrink(int price , String name)
	{
		System.out.println("bar supplies drink"+name+"   "+"of cost"+"  "+price);
	}
	void supplyDrink( String name ,int price)
	{
		System.out.println("bar supplies drink"+price+"   "+"of cost"+"  "+name);
	}
	void supplyDrink(double price , String name)
	{
		System.out.println("bar supplies drink"+name+"   "+"of cost"+"  "+price);
	}
	
	public static void main(String[] args) {
		
		Bar b = new Bar();
		b.supplyDrink();
		b.supplyDrink(150);
		b.supplyDrink(120, "Tubord");
		b.supplyDrink("Beer", 130);
		b.supplyDrink(130.5, "king Fisher");
	}
}

