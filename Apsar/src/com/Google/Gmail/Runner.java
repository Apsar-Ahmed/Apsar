package com.Google.Gmail;

public class Runner  extends Addition{

	@Override
	int add() {
		
		return 10;
	}
	public static void main(String[] args) {
		
		Runner r = new Runner();
		System.out.println(r.add());
	}
	

}
