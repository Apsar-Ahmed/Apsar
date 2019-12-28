package com.Google.Gmail;

import com.Google.GDrive.Bar;


public class Restuarant_Bar extends Bar {
	Restuarant_Bar P = new Restuarant_Bar();
	

	Bar p = new Bar();
	p.supplyDrink();
	p.supplyDrink(150);
	p.supplyDrink(120, "Tubord");
	p.supplyDrink("Beer", 130);
	p.supplyDrink(130.5, "king Fisher");
	
	
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
