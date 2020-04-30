import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javafx.scene.chart.BubbleChart;


public class account {
	


	public static void main(String[] args) {
		
		//System.setProperty("webdriver.gecko.driver","C:\\Faizan\\Selenium\\Gecko\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Faizan\\Selenium\\chrome driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		 
        //Launch the Online Store Website
      driver.get("http://52.18.92.26:83/");
 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the application EE docker");
        
        WebElement email = driver.findElement(By.id("loginemail"));
        WebElement password = driver.findElement(By.name("loginpassword"));
        
        email.sendKeys("admin@mobiusservices.com");
        password.sendKeys("Mobius@123");
        
        driver.findElement(By.id("loginButton")).click();
        
        //WebDriverWait wait = new WebDriverWait(driver,1000);

        
       // Thread.sleep(1000);
        
       // WebDriverWait wait=new WebDriverWait(driver, 100);
        
        //driver.findElement(By.linkText("")).click();
        
        //WebElement element = driver.findElement(By.linkText("Search"));
       // driver.findElement(By.("/DocumentSearch/DocumentSearch")).click();
        
       // WebElement User = driver.findElement(By.className("chosen-search-input"));
        //User.sendKeys("faizan");
        
      
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        
        System.out.println("---------");
         driver.findElement(By.id("FilterSearch")).sendKeys("test");
        //System.out.println("---------");
        //driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        //Search.sendKeys("test");
        
        System.out.println("test");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        
        WebElement button = (WebElement) driver.findElements(By.id("btnDocumentSearch"));
        button.click();
        
        
        
       // Select.click("rel=1");
        
       //WebElement searchBtn = driver.findElement(By.id("menu1"));

       // Actions action = new Actions(driver);
        //action.moveToElement(searchBtn).click();
        
        
 //Wait for 5 Sec
    //   Thread.(5000);
 
        // Close the driver
       // driver.quit();
    }
		
		
		// TODO Auto-generated method stub

	}


