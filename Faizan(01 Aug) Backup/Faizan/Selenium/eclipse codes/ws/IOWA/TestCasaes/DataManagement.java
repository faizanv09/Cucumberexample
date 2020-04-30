package TestCasaes;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class DataManagement {
	
	public void dataMange(WebDriver driver,By by) throws InterruptedException{
		
		//driver.findElement(By.xpath("//a[contains(text(),'Data Management')]")).click();
		
		Actions dm = new Actions(driver);
		dm.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Data Management')]"))).perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'Upload')]")).click();
		
		Select period = new Select(driver.findElement(By.xpath("//select[@class='form-control custom-select ng-valid ng-dirty ng-touched']")));
		period.selectByValue("Annual");
		
		
		WebElement uploadElement = driver.findElement(By.xpath("//span[@class='ui-fileupload-choose ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left']//input"));
		uploadElement.sendKeys("F:\\Faizan(01 Aug) Backup\\Faizan\\Projects\\IOWA\\Upload\\Course.xlsx");
		
		Thread.sleep(2000);
		
		Actions upl = new Actions(driver);
		upl.moveToElement(driver.findElement(By.xpath("//p-button[1]//button[1]"))).perform();
	
		driver.findElement(By.xpath("//p-button[1]//button[1]")).click();
		
		driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']")).click();
		
		Thread.sleep(3000);
		
		JavascriptExecutor jr = (JavascriptExecutor) driver;
		jr.executeScript("window.scrollBy(0,-2500)");
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//th[@class='text-center ng-star-inserted']//label[@class='custom-control-label']")).click();
		
		Actions integ = new Actions(driver);
		integ.moveToElement(driver.findElement(By.xpath("//a[@id='ui-tabpanel-1-label']"))).perform();
		
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ui-tabpanel-5-label']")));
		
		WebElement Element =driver.findElement(By.xpath("//a[@id='ui-tabpanel-5-label']"));
 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
	    driver.findElement(By.xpath("//a[@id='ui-tabpanel-5-label']")).click();
	    
	    driver.findElement(By.xpath("//th[@class='text-center']//label[@class='custom-control-label']")).click();
  

	}
		
		
		
	}
	
	


