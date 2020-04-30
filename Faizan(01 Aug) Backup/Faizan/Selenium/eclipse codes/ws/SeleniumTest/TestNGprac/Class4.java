package TestNGprac;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class4 {
	
	@Test(dependsOnMethods={"checkTest"})
	public void Befortest(){
		System.out.println("Execute before every method");
	}
	
	@Test
	public void checkTest(){
		
		System.out.println("test");
	}
	
	@Test(dependsOnMethods={"checkTest"})
	public void afterTest(){
		System.out.println("Execute after test");
	}

}
