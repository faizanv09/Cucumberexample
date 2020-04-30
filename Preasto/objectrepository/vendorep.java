package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



	public class vendorep {
		
		WebDriver driver;
		public vendorep(WebDriver driver){
			
			this.driver =driver;
		}
		
		By vsign= By.xpath("//span[@id='login-button-container']");
		By vlogin=By.xpath("//input[@id='ap_email']");
		By vpassword=By.xpath("//input[@name='password']");
		By vsubmit=By.xpath("//input[@id='signInSubmit']");
		
		public WebElement vsgn(){
			
			return driver.findElement(vsign);
		}
		
		public WebElement vEmailId(){
			
			return driver.findElement(vlogin);
		}
		public WebElement vpwd(){
			
			return driver.findElement(vpassword);
		}
		
		public WebElement vsubm(){
			
			return driver.findElement(vsubmit);
		}
		
		

	}



