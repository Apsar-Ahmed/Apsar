package com.Google.GDrive;

public class Cat extends Animal {

	void meow()
	{
		System.out.println("Cat is Meowing");
	}
	
	public static void main(String[] args) {
		
		Cat c = new Cat();
		c.meow();
		c.eat();
		
		Dog d = new Dog();
		d.bark();
		d.eat();
		
		Animal a = new Animal();
		a.eat();
	}
}
