package com.Google.Gmail;

public class BabyDog extends Dog {
	void weep()
	{
		System.out.println("dog is weeping");
	}

	public static void main(String[] args) {
		
		BabyDog b = new BabyDog();
		
		b.weep();
		b.bark();
		b.eat();
		
		
		Dog d = new Dog();
		d.bark();
		d.eat();
		
		Animal a =  new Animal();
		a.eat();
	}
}
