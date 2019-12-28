package com.Google.Gmail;

public class Bill extends Food {

	protected void pay_bill()
	{
		System.out.println("Pay the due Bill");
	}
	
	public static void main(String[] args) {
		
		Bill b = new Bill();
		b.supply_food();
		b.pay_bill();
		b.biryani();
		
		
		Food f = new Food();
		f.supply_food();
		f.biryani();
		
		
		Restuarant r = new Restuarant();
		r.supply_food();
		
	}
}
