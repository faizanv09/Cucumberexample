package Alackra;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void test(){
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Faizan(01 Aug) Backup\\Faizan\\Selenium\\Gecko\\chromedriver.exe");
 ChromeDriver driver
		 = new ChromeDriver();

		driver.manage().window().maximize();
	}

}
