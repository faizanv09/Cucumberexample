package Inhabtir;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Addtocartcard {
    @Test
	public void Criflow1() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Faizan(01 Aug) Backup\\Faizan\\Selenium\\Gecko\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://internaltesting.inhabitr.com");

		driver.findElement(By.xpath("//a[@id='login']")).click();

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("faizan@inhabitr.in");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Mobius@123");

		driver.findElement(By.xpath("//button[@id='login_button']")).click();

		driver.findElement(By.xpath("//span[@class='currentCityDisplay']")).click();

		driver.findElement(By.xpath("//a[contains(@class,'dropdown-item')][contains(text(),'Chicago')]")).click();

		Thread.sleep(3000);

		Actions FS = new Actions(driver);
		FS.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Furniture Sets')]"))).perform();

		driver.findElement(By.xpath("//a[contains(text(),'Bedroom Sets')]")).click();

		driver.findElement(By.xpath("//div[2]//div[1]//div[1]//a[1]//img[1]")).click();

		driver.findElement(By.xpath("//button[contains(text(),'Rent Now')]")).click();

		Thread.sleep(6000);
		
		//driver.findElement(By.xpath("//div[@class='overlay jx_ui_Widget']")).click();
		// driver.findElement(By.xpath("//div[@class='input-group
		// product-quantity']//button[@class='btn btn-secondary
		// qUp'][contains(text(),'+')]")).click();

		driver.findElement(By.xpath("//button[@class='i_button float-left']")).click();

		// driver.findElement(By.xpath("//div[@class='input-group
		// product-quantity']//button[@class='btn btn-secondary
		// qUp'][contains(text(),'+')]")).click();

		Thread.sleep(2000);

		driver.findElement(By
				.xpath("/html[1]/body[1]/main[1]/section[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/form[1]/div[1]/div[1]/button[1]"))
				.click();
		Thread.sleep(2000);

		// Delivery date
		
		//driver.findElement(By.xpath("//div[@class='box']//a[@class='next'][contains(text(),'Next')]")).click();
		Thread.sleep(2000);

		

		driver.findElement(By.xpath("//span[contains(text(),'18')]")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@class='timeSlot slots-18-11-2019 showThis']//span[contains(text(),'11:00am (+$0)')]"))
				.click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//li[@id='li-19-11-2019']//span[contains(text(),'19')]")).click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//div[@class='timeSlot slots-19-11-2019 showThis']//span[contains(text(),'05:00pm (+$0)')]"))
				.click();
		
		driver.findElement(By.xpath("//li[@id='li-20-11-2019']//span[contains(text(),'20')]")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//div[@class='timeSlot slots-20-11-2019 showThis']//span[contains(text(),'05:00pm (+$0)')]"))
				.click();
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[2]/form[1]/div[2]/div[2]/button[1]")).click();

		// Delivery Adress
		
		driver.findElement(By.xpath("//input[@id='Address']")).sendKeys("new street");
		
		driver.findElement(By.xpath("//input[@id='AptNo']")).sendKeys("new apt");
		
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("cigo");
		
		driver.findElement(By.xpath("//input[@id='zip_code']")).sendKeys("60611");
		
		//driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("");
		
		driver.findElement(By.xpath("//span[@class='custom-control-label custom-control-description']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[2]/form[1]/div[1]/div[2]/div[1]/div[10]/div[1]/button[1]")).click();
		
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//div[@class='field']")).click();
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='payment_block doPay']")));
		
		/*new Actions(driver).moveToElement(driver.findElement(By.xpath("//label[contains(text(),'Credit Card Number')]"
				))).click().sendKeys(Keys.NUMPAD4).build().perform();
		
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//label[contains(text(),'Credit Card Number')]"
				))).click().sendKeys().build().perform();
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//label[contains(text(),'Credit Card Number')]"
				))).click().sendKeys(Keys.NUMPAD2).build().perform();
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//label[contains(text(),'Credit Card Number')]"
				))).click().sendKeys(Keys.NUMPAD4).build().perform();
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//label[contains(text(),'Credit Card Number')]"
				))).click().sendKeys(Keys.NUMPAD2).build().perform();*/
			
		
		Thread.sleep(2000);
		
	
		
		//new Actions(driver).moveToElement(driver.findElement(By.xpath("//label[contains(text(),'Credit Card Number')]"))).click().sendKeys("4242").build().perform();
		
		
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//label[contains(text(),'Credit Card Number')]"
				))).click().sendKeys("0 0 4 2 4 2 4 2 4 2 4242 4242").build().perform();
		
		Thread.sleep(2000);
		 
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//label[contains(text(),'Expiration')]"
				))).click().sendKeys("0 1 2 2 5").build().perform();
		
		Thread.sleep(2000);
		
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//label[contains(text(),'CVC')]"
				))).click().sendKeys("0 4 2 5").build().perform();
		
		
		
		

		//driver.findElement(By.xpath("//label[contains(text(),'Credit Card Number')]")).click();
		//driver.findElement(By.xpath("//label[contains(text(),'Credit Card Number')]")).sendKeys("4242424242424242");
		//driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]")).sendKeys("4242424242424242");
		
		
		/*driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]")).sendKeys("1225");
		
		driver.findElement(By.xpath("/html[1]/body[1]/main[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[2]/div[2]/label[1]")).sendKeys("425");*/
		
		driver.findElement(By.xpath("//input[@name='stripeCheckout']")).click();
		
				
		

	}

}
