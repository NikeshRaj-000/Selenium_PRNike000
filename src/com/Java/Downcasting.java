package com.Java;

public class Downcasting extends Upcasting {

	
	private void car() {
		// TODO Auto-generated method stub

		System.out.println("i am");
	}
	
	public static void main(String[] args) {
		
		//Upcasting
		
		Upcasting v = new Downcasting();
		v.parent();
			
		
	}
}
