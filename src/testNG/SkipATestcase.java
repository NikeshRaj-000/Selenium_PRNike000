package testNG;

import org.testng.annotations.Test;

public class SkipATestcase {

	
		@Test(priority=0)
		public void startthecar() {
			System.out.println("Start the Car");
		}
		@Test(priority=1)
		public void PutFirstGear () {
			System.out.println("FirstGear");
		}
		@Test(priority=2)
		public void PutSecGear() {
			System.out.println("SecGear");
		}
		@Test(priority=4)
		public void PutThirdGear() {
			System.out.println("ThirdGear");
		}
		@Test(priority=3,enabled=false)
		public void PutFourthGear() {
			System.out.println("FourthGear");
		}
		
		@Test
		public void Turnthemusicon() {
			System.out.println("Music turn on");
		}
		
}
