package testNG;

import org.testng.annotations.Test;

public class Dependenciesmanagement {

	@Test(enabled = true)
	public void highschool(){
		System.out.println("HSSC");
		
	}
	@Test(dependsOnMethods="highschool")
	public void UG(){
		System.out.println("BA");
		
	}
	@Test(dependsOnMethods="UG")
	public void PG(){	
		System.out.println("MBA");
}
	
}
