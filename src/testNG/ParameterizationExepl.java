package testNG;

import java.io.StringWriter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExepl {

	@Test
	@Parameters("name")
	public void printl(String name) {
		System.out.println("Name is"+name);
		
	}
	
}
