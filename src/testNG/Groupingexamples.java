package testNG;

import org.testng.annotations.Test;

public class Groupingexamples {

	@Test(groups={"Acer"})
	public void Acer0() {
		System.out.println(" Acer testing");
	}

	@Test(groups={"Acer1"})
	public void Acer1() {
		System.out.println(" VAcer testing");
	}
	
	@Test(groups={"Sony"})
	public void sony0() {
		System.out.println(" Sony testing");
	}
	
	@Test(groups={"Sony1"})
	public void sony1() {
		System.out.println(" QSony testing");
	}
	@Test(groups={"hp1"})
	public void hp() {
		System.out.println(" Qhp testing");
	}
	@Test(groups={"hp"})
	public void hp1() {
		System.out.println(" hp testing");
	}
	@Test(groups={"Mac"})
	public void mac() {
		System.out.println(" iMac testing");
	}
	@Test(groups={"Mac1"})
	public void mac1() {
		System.out.println(" iiMac testing");
	}
	
	

	
}
