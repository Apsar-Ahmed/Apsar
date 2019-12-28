package com.Google.Gmail;

public class Employee {
	
	public Employee()
	{
		System.out.println("he is TCS Employee ");
	}
	
	public Employee(String name)
	{
		System.out.println("His name is "+"     "+name);
	}

	public Employee(int Salary , String name)
	{
		System.out.println("His Salary is "+"   "+Salary +"    "+"His Company name is "+"     "+name);
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		Employee e1 = new Employee("PREm");
		Employee e2 = new Employee(10000 , "GOOGLE");
	}
}
