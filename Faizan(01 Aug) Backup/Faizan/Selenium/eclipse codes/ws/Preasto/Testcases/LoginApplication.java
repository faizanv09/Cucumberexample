package Testcases;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.AdvertisingReport;
import objectrepository.PreastoLogin;

public class LoginApplication {
   @Test
   
   public void login(){
	   
	   System.setProperty("webdriver.chrome.driver", "F:\\Faizan(01 Aug) Backup\\Faizan\\Selenium\\Gecko\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("http://52.55.35.111/praesto_test/users/login");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	   driver.manage().deleteAllCookies();
	   PreastoLogin pl =new PreastoLogin(driver);
	   pl.EmailId().sendKeys("admin@mobiusservices.com");
	   pl.pwd().sendKeys("mMobius123!");
	   pl.subm().click();
	   AdvertisingReport ad = new AdvertisingReport(driver);
	   ad.report().click();
	   
	   //System.out.println(driver.getTitle());
	   Set<String> wh =driver.getWindowHandles();
	   Iterator <String>it =wh.iterator();
	   String parent = it.next();
	   String child = it.next();
	   driver.switchTo().window(child);
	   ad.adReport().click();
	   ad.Usrlst();
	   ad.rng();
	   
   }
}
