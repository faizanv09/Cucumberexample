package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class vendorOrder {

	WebDriver driver;
	public vendorOrder(WebDriver driver){
		
		this.driver =driver;
	}
	
	By Purchaseord= By.xpath("//div[@id='VSS_Navbar_Tab_Order_pop']");
	By fltr=By.xpath("//span[contains(@id,'gridFilter')]");
	By clfilter=By.xpath("//*[contains(@id,'gridFilterColumns')]");
	By vsubmit=By.xpath("//input[@id='signInSubmit']");
	
	
	public void PurchaseOrder(){
		
		Actions ae =new Actions((WebDriver) driver.findElements(Purchaseord));
		ae.moveToElement(driver.findElement(By.xpath("//div[@id='po-mgmt_text']"))).click();
				
	}
	
	public WebElement filter(){
		
		return driver.findElement(fltr);
	}
	public void Columnfil(){
		
		 Select s = new Select(driver.findElement(clfilter));
	    s.selectByValue("orderDate");
	}
	
	public WebElement vsubm(){
		
		return driver.findElement(vsubmit);
	}
	
	

}

