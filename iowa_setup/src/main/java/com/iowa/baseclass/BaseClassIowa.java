package com.iowa.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClassIowa {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browserName) {

		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"F:\\Iowa_Workspace\\iowa_project\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty(("user.dir") + "\\driver\\IEDriverServer.exe"));
				driver = new InternetExplorerDriver();
			} else if (browserName.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty(("user.dir") + "\\driver\\geckoDriver.exe"));
				driver = new FirefoxDriver();
			} else {
				System.out.println("Invalid browsername");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void getUrl(String Url) {
		driver.get(Url);
	}

	public static void inputOnElement(WebElement element, String arg1) {
		element.sendKeys(arg1);

	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void clearOnElement(WebElement element) {
		element.clear();
	}

	public static void robotClass(WebElement element, String value) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void quit(WebElement element) {
		driver.quit();
	}

	public static void close(WebElement element) {
		driver.close();
	}

	public static void navigateTo(WebElement element) {
		driver.navigate().to("Url");
	}

	public static void refersh(WebElement element) {
		driver.navigate().refresh();
	}

	public static void forward(WebElement element) {
		driver.navigate().forward();
	}

	public static void back(WebElement element) {
		driver.navigate().back();
	}

	public static void iframe(WebElement elements) {
		elements.click();
		driver.switchTo().frame(elements);
	}

	public static void scroll(WebElement elements) {
		waitforvisibilityofelement(elements);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", elements);
	}

	public static void scrollUp(Object element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("Window.ScrollBy(0,1000)");
	}

	public static void ScrollDown(Object element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.ScrollBy(0,-1000)");
	}

	public static void screenShot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		File destfile = new File(System.getProperty("user.dir") + "\\takesScreenshot\\" + filename);
		FileUtils.copyFile(sourcefile, destfile);
	}

	public static void screenshotForParticularElement() throws IOException {
		
		// Element Xpath which to take screenshot
			WebElement screenshotElements = driver.findElement(By.xpath("//table/tbody/tr/td[3]"));
			// output type of screenshot
				File screenshotAs = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				//scroll(driver.findElement(By.xpath("//table/thead/tr/th[3]")));
				// get full page screenshot
				BufferedImage fullImg = ImageIO.read(screenshotAs);
				// get location of particular screenshot element
				Point Elementlocation = screenshotElements.getLocation();
				// get width and height of the element
				int width = screenshotElements.getSize().getWidth();
				int height = screenshotElements.getSize().getHeight();
				
				// crop the entire page screenshot to get particular element screenshot
				BufferedImage ParticularElementScreenshot = fullImg.getSubimage(Elementlocation.getX(), Elementlocation.getY(),
						width, height);
				ImageIO.write(ParticularElementScreenshot, "png", screenshotAs);
				// copy element screenshot to disk
				FileUtils.copyFile(screenshotAs, new File("View nd Download.jpeg"));
	}
	
	public static void dropdowntext(WebElement element ,String value) {
		Select s = new Select(element);
		s.selectByVisibleText("value");
		
	}
	
	public static void dropdownGetoptions(WebElement element) {
		Select se = new Select(element);
		List<WebElement> options = se.getOptions();
		for (WebElement option : options) {
			System.out.println(option.getText());
			
		}
	}

	public static void waitforvisibilityofelement(WebElement elements) {
		try {
			WebDriverWait wb = new WebDriverWait(driver, 160);
			wb.until(ExpectedConditions.visibilityOf(elements));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void waitforvisibilityofelements(List<WebElement> elements) {
		try {
			WebDriverWait wb = new WebDriverWait(driver, 90);
			wb.until(ExpectedConditions.visibilityOfAllElements(elements));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void waitforclicktoelement(WebElement elements) {
		try {
			WebDriverWait wb = new WebDriverWait(driver, 160);
			wb.until(ExpectedConditions.elementToBeClickable(elements));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
