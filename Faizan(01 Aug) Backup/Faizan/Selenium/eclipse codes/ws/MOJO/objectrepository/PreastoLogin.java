package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PreastoLogin {
	
	
	WebDriver driver;
	public PreastoLogin(WebDriver driver){
		
		this.driver=driver;
	}
	By login=By.id("email");
	By password=By.xpath("//input[@id='password']");
	By submit=By.xpath("//*[text()='Login']");
	
	public WebElement EmailId(){
		
		return driver.findElement(login);
	}
	public WebElement pwd(){
		
		return driver.findElement(password);
	}
	
	public WebElement subm(){
		
		return driver.findElement(submit);
	}

}
