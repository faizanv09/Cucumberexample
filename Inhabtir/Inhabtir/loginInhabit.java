package Inhabtir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class loginInhabit extends selectMulti {
	@Test
	public void inhabit() throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver","F:\\Faizan(01 Aug) Backup\\Faizan\\Selenium\\Gecko\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://internaltesting.inhabitr.com");

	driver.findElement(By.xpath("//a[@id='login']")).click();

	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("faizan@inhabitr.in");

	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Mobius@123");

	driver.findElement(By.xpath("//button[@id='login_button']")).click();
	
	selectMulti sm = new selectMulti();
	sm.sltMult(driver, By.xpath("//span[@class='currentCityDisplay']"));
	
	bedRoom bm = new bedRoom();
	bm.bdrm(driver, By.xpath("//body/div[@id='wrapper']/div[@id='header']/nav[@class='navbar navbar-expand-lg nav-bg']/div[@class='container-fluid']/div[@id='navbarSupportedContenta']/nav[@id='furnitureMenu']/ul/li[2]/a[1]"));
	
	livingRoom lr = new livingRoom();
	lr.lvnroom(driver, By.xpath("//body/div[@id='wrapper']/div[@id='header']/nav[@class='navbar navbar-expand-lg nav-bg']/div[@class='container-fluid']/div[@id='navbarSupportedContenta']/nav[@id='furnitureMenu']/ul/li[3]/a[1]"));
	
	//dining dn = new dining();
	//dn.din(driver, By.xpath("//body/div[@id='wrapper']/div[@id='header']/nav[@class='navbar navbar-expand-lg nav-bg']/div[@class='container-fluid']/div[@id='navbarSupportedContenta']/nav[@id='furnitureMenu']/ul/li[4]/a[1]"));
	
	//homeOffice ho = new homeOffice();
	//ho.hoff(driver, By.xpath("//body/main/header/div[@id='header']/nav[@class='navbar navbar-expand-lg']/div[@class='container-fluid']/div[@id='navbarSupportedContenta']/nav[@id='furnitureMenu']/ul/li[5]/a[1]"));
	
	}

}
