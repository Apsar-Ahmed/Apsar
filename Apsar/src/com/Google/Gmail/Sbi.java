package com.Google.Gmail;

public class Sbi extends Rbi{
	

	public void getRateofInterest()
	{
		System.out.println("Interest for sbi is 5");
	}
	
	
	public static void main(String[] args) {
		
		Rbi r = new Rbi();
		
		r.getRateofInterest();
		
		Axis a = new Axis();
		
		a.getRateofInterest();
		
		Sbi s  = new Sbi();
		
		s.getRateofInterest();
		
	}
}
