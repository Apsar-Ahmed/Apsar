package com.Google.Gmail;

public class Addition1 {
	
	int a;
	int b;
	void add(int a , int b)
	{
		System.out.println(this.a+"  "+this.b);
		this.a=a;
		this.b=b;
		System.out.println(this.a+"  "+this.b);
		this.add(8);
	}
	
	void add(int a)
	{
		System.out.println(a);
	}
	
	
	
public static void main(String[] args) {
	
	Addition1 a = new Addition1();
	a.add(2, 3);
}	

}
