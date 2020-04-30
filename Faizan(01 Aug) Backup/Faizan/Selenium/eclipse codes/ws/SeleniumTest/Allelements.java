import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Faizan\\Selenium\\chrome driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rportalbuild.hiperos.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		
		driver.get("https://rportalbuild.hiperos.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("faizan_rpdh@mobiusservices.com");
		driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("coupa11");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.xpath("//*[@id='header-nav-ContxtSupplier']")).click();
		driver.findElement(By.cssSelector("#btnAddNew")).click();
		
		driver.findElement(By.xpath("//div[contains(@id,'s2id_la_supplier_setup_data_dd-')]//a[@class='select2-choice']")).click();
		driver.findElement(By.xpath("//div[@class='select2-search']//input[@type='text']")).sendKeys("Ware");
		driver.findElement(By.xpath("//div[@class='select2-search']//input[@type='text']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//input[@type='checkbox']")).getSize();
		//System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).getSize());
		
		driver.findElements(By.xpath("//input[@value='300']")).get(2).click();
		
		/*int count1 =driver.findElements(By.xpath("//input[@value='300']")).size();
		for (int i=0;i<count1;i++){
			
			driver.findElements(By.xpath("//input[@value='300']")).get(1).click();
		}*/
		
		int count = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		for(int i=0;i<count;i++){
		String text = driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).getAttribute("value");
		if(text.equals("Civic")){
			
			driver.findElements(By.xpath("//input[@type='checkbox']")).get(i).click();
			
			
		}

		
		}

	}

}