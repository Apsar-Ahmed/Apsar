package com.Google.Gmail;

public class Food extends Restuarant {
	
	 void biryani()
	{
		System.out.println("Biryani is supplied");
	}

	
	static void main(String[] args) {
		
		Food f = new Food();
		f.supply_food();
		
		Restuarant r = new Restuarant();
		r.supply_food();
	}
}
