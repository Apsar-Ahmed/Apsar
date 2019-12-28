package com.Google.Gmail;

public class Bike {
	
	public Bike()
	{
		System.out.println("This is a Bike constructor");
	}
	
	public Bike(int Speed)
	{
		System.out.println("The Speed of Bike is "+"     "+Speed);
	}
	
	public Bike(int Speed , String name)
	{
		System.out.println("The Speed of Bike is "+"     "+Speed +"    "+ "The name of the Bike is"+"     "+name);
	}
	
	public static void main(String[] args) {
		
		Bike b3 = new Bike();
		Bike b1 = new Bike(150);
		Bike b2 = new Bike(150 , "KTM");
	}

}
