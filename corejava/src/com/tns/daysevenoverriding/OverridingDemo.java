package com.tns.daysevenoverriding;

public class OverridingDemo {
	public static void main(String[] args) {
		RBI rbi;

//		Dynamic binding assigning child class object to parent class reference variable.
		rbi = new SBI();
		System.out.println(rbi.getRateOfInterest());

		rbi = new ICICI();
		System.out.println(rbi.getRateOfInterest());

		rbi = new Hdfc();
		System.out.println(rbi.getRateOfInterest());

	}


}
