package testNG;

import org.testng.annotations.Test;

public class Driveacar {
	@Test(priority=0)
	public void startTheCar() {
		System.out.println("Start the Car");
	}
	@Test(priority=1)
	public void PutFirstGear () {
		System.out.println("Switch to FirstGear and Accelorate");
	}
	@Test(priority=2)
	public void PutSecGear() {
		System.out.println("Switch to SecGear and Accelorate");
	}
	@Test(priority=-0)
	public void PutEnginekillswitch() {
		System.out.println("Please process the Access Key ");
	}
	
	@Test(priority=3)
	public void PutThirdGear() {
		System.out.println("Switch to ThirdGear and Accelorate");
	}
	@Test(priority=4)
	public void PutFourthGear() {
		System.out.println("Switch to FourthGear and Accelorate");
	}
	
	
	
	
	
}
