package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdvertisingReport {
	
	
	WebDriver driver;
	public AdvertisingReport(WebDriver driver){
		
		this.driver =driver;
	}

	By Report=By.xpath("//li[4]//a[1]");
	By AdvReport=By.xpath("//aside[@class='sidebar']//li[6]//a[1]");
	By Userlist=By.xpath("//select[@class='custom-select']");
	By Range=By.xpath("//select[@id='DateType']");
	
	public WebElement report(){
		
		return driver.findElement(Report);
	}
	
    public WebElement adReport(){
		
		return driver.findElement(AdvReport);
	}
    
    public void Usrlst(){
    	
        Select s = new Select(driver.findElement(Userlist));
    	s.selectByValue("110");
    	
    }
    public void rng(){
    	
        Select s = new Select(driver.findElement(Range));
    	s.selectByValue("Customized");
    	
    }
    
    
}
