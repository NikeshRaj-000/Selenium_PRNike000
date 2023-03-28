package org.clay;

public class Service {

	private void customer() {
	System.out.println("Customer Deteils");
	System.out.println();
}
	private void customer_1() {
		System.out.println("Name : ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Service l = new Service ();
		l.customer();
		l.customer_1();
	}
}