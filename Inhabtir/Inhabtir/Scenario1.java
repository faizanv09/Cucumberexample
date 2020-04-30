package Inhabtir;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\Faizan(01 Aug) Backup\\Faizan\\Selenium\\Gecko\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		String[] itemsNeeded= {"Clarinet Loveseat","Posh Sofa"};

		driver.manage().window().maximize();

		driver.get("https://internaltesting.inhabitr.com");
		
		//Thread.sleep(5000);
		
		Actions FS = new Actions(driver);
		FS.moveToElement(driver.findElement(By.xpath("//body/main/header/div[@id='header']/nav[@class='navbar navbar-expand-lg']/div[@class='container-fluid']/div[@id='navbarSupportedContenta']/nav[@id='furnitureMenu']/ul/li[3]/a[1]"))).perform();
        
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[3]//ul[1]//div[1]//div[1]//li[2]//a[1]")).click();
		
		
		Thread.sleep(3000);
		addItems(driver,itemsNeeded);
		
		//addItems(driver, By.xpath("//*[@id='header-nav-ContxtSupplier']"));
		
		//addItems tst = new addItems();

		
		
						

	}
	
	public static  void addItems(WebDriver driver,String[] itemsNeeded)

	{

	int j=0;

	List<WebElement> products=driver.findElements(By.xpath("//a[@itemprop='url']"));

	for(int i=0;i<products.size();i++)

	{

	
	//String[] name=products.get(i).getText().split("-");

	//String formattedName=name[0].trim();

	
	List itemsNeededList = Arrays.asList(itemsNeeded);

	if(itemsNeededList.contains(products))

	{

	j++;

	//click on Add to cart

	driver.findElements(By.xpath("//button[contains(text(),'Rent Now')]")).get(i).click();

	if(j==itemsNeeded.length)

	{

	break;

	}

	}

	}

	}

}
