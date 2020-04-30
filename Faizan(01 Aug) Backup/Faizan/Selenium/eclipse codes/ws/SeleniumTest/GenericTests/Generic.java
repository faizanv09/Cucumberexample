package GenericTests;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Generic {

	public void CreateSupplier(WebDriver driver,By by){
		
		driver.findElement(By.xpath("//*[@id='header-nav-ContxtSupplier']")).click();
		driver.findElement(By.xpath("//div[@class='k-header k-grid-toolbar']//a[1]")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[contains(@id,'s2id_la_supplier_setup_data_dd-')]//a[@class='select2-choice']")).click();
		driver.findElement(By.xpath("//div[@class='select2-search']//input[@type='text']")).sendKeys("Ware");
		driver.findElement(By.xpath("//div[@class='select2-search']//input[@type='text']")).sendKeys(Keys.ENTER);
		String setp =driver.findElement(By.xpath("//div[contains(@id,'s2id_la_supplier_setup_data_dd-')]//a[@class='select2-choice']")).getText();
		System.out.println(setp);
		
		WebElement dt = driver.findElement(By.xpath("//span[contains(@aria-controls,'dateofbirth')]"));
		dt.click();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//dt.sendKeys(Keys.ARROW_RIGHT);
		//dt.sendKeys(Keys.ARROW_LEFT);
		//driver.findElement(By.xpath("//a[@title='Friday, March 01, 2019']")).click();
		
		int count= driver.findElements(By.xpath("//input[@type='radio']")).size();
		System.out.println(count);
		for(int i =0;i<count;i++){
			
			String text = driver.findElements(By.xpath("//input[@type='radio']")).get(i).getAttribute("value");
			if(text.equals("Bugatti~90")){
				
				driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
			}
		}
		
		
		int countcb = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		for(int i=0;i<countcb;i++){
			String ntext = driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).getAttribute("value");
			if(ntext.equals("cvc")){
				
				driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).click();
			}
			
		}
		
		driver.findElement(By.xpath("//a[@class='nav-profile']")).click();
		driver.findElement(By.xpath("//ul[@class='nav pull-right menu']//li[4]//a[1]")).click();
		
		System.out.println(driver.getTitle());
		Set<String> whd =driver.getWindowHandles();
		Iterator<String> it=whd.iterator();
		/*String parentId=it.next();
		String childId=it.next();
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());*/
		

		while(it.hasNext())
		{
			
		   driver.switchTo().window(it.next());
		   System.out.println(driver.getTitle());
		
		}
			
			
		
				
		//System.out.println(rsize);
		/*for(int i=0;i>4;i++){
			
			WebElement sltdate = driver.findElement(By.xpath("//span[contains(@aria-controls,'dateofbirth')]"));
			sltdate.sendKeys(Keys.LEFT);
					
			
			String date = driver.findElement(By.xpath("//span[contains(@aria-controls,'dateofbirth')]")).getText();
			System.out.println(date);
			
		}*/
		
		
		
		
	}
	
}
