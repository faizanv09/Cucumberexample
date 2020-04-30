import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class EePractise {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver","C:\\Faizan\\Selenium\\Gecko\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Faizan\\Selenium\\chrome driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		/*driver.get("http://52.18.92.26:83/");
		driver.findElement(By.id("loginemail")).sendKeys("admin@mobiusservices.com");
		driver.findElement(By.name("loginpassword")).sendKeys("Mobius@123");
		driver.findElement(By.xpath("//*[@id='loginButton']")).click();
		driver.findElement(By.cssSelector("tr.even:nth-child(2) > td:nth-child(1) > a:nth-child(1)")).click();
		driver.findElement(By.cssSelector("#menu1")).click();*/
		
		driver.get("https://rportalbuild.hiperos.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("faizan_rpdh@mobiusservices.com");
		driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("coupa11");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.xpath("//*[@id='header-nav-ContxtSupplier']")).click();
		//driver.findElement(By.xpath("//*[@id='header-nav-ContxtCompliance']")).click();
		Thread.sleep(3000L);
		
		driver.findElement(By.cssSelector("#btnAddNew")).click();
		//driver.findElement(By.xpath("//a[contains(@href,'StandardObjects/AddNew?type=3')")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Add New')]")).click();
		//driver.findElement(By.xpath("//b[contains(text(),'Engagement')]")).click();
		//driver.findElement(By.xpath("//div[@class='span8']//a[@class='btn btn-primary pull-right']")).click();
		//driver.findElement(By.xpath("//a[contains(@style,'margin-left: 5px')]")).click();
		//driver.findElement(By.xpath("//*[text()='Add New Program']")).click();
		//driver.findElement(By.xpath("//a[@class='btn btn-purple']")).click();
			
		Thread.sleep(8000);
			
		//Select sup = new Select(driver.findElement(By.id("//div[contains(@id,'s2id_la_supplier_setup_data_dd-')]")));
		//sup.selectByVisibleText("Apartment");
		driver.findElement(By.xpath("//div[contains(@id,'s2id_la_supplier_setup_data_dd-')]//a[@class='select2-choice']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='QA Test Center']")).click();
		/*driver.findElement(By.xpath("//*[text()='QA Test Center']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[text()='QA Test Center']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[text()='QA Test Center']")).sendKeys(Keys.ENTER);*/
		
	    /*driver.findElement(By.xpath("//*[contains(@id,'s2id_la_supplier_setup_data_dd-')]")).click();
		driver.findElement(By.xpath("//*[contains(@id,'s2id_la_supplier_setup_data_dd-')]")).sendKeys("s");
		driver.findElement(By.xpath("//div[@class='select2-search']//input[@type='text']")).sendKeys("s");
		
		driver.findElement(By.xpath("//*[contains(@id,'s2id_la_supplier_setup_data_dd-')]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[contains(@id,'s2id_la_supplier_setup_data_dd-')]")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//*[contains(@id,'s2id_la_supplier_setup_data_dd-')]")).sendKeys(Keys.ENTER);*/
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[contains(@id,'Name-')]")).sendKeys("Aruntest");		
				
		//driver.findElement(By.xpath("//i[contains(@class,'icon-plus')]")).click();		
			
				
		//Thread.sleep(9000);
		
		//driver.findElement(By.name("Email")).sendKeys("test233581@gmail.com");
		//driver.findElement(By.name("FirstName")).sendKeys("test338");
		//driver.findElement(By.name("LastName")).sendKeys("new");
		
		//driver.findElement(By.xpath("//*[text()='Create User']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//*[@value='BMW~100'])[1]")).click();
		//driver.findElement(By.id("saveStandardObjectButton")).click();
		
		
		
				
				
				
				
				
		
		
		
		

	}

}
