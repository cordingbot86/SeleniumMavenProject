package day02;

import java.io.File;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Framework {

	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest test;

	public static void browser(String browserValue)
	{
		switch (browserValue) {
		case "chrome":
			driver = new ChromeDriver();
			test.log(LogStatus.INFO, "Open Chrome Browser");
			break;
		case "firefox":
			driver = new FirefoxDriver();
			test.log(LogStatus.INFO, "Open Firefox Browser");
			break;
		case "edge":
			driver = new EdgeDriver();
			test.log(LogStatus.INFO, "Open Edge Browser");
			break;
		case "ie":
			driver = new InternetExplorerDriver();
			test.log(LogStatus.INFO, "Open IE Browser");
			break;
		}
	}

	public static void appUrl(String url)
	{
		driver.get(url);
		test.log(LogStatus.INFO, "Open application url: "+url);
	}

	public static void typeIn(String xpathValue,String dataValue,String fieldName)
	{
		driver.findElement(By.xpath(xpathValue)).sendKeys(dataValue);
		test.log(LogStatus.INFO, "User Enter Value in "+fieldName+" as "+dataValue);
	}

	public static void clickIn(String xpathValue,String fieldName)
	{
		driver.findElement(By.xpath(xpathValue)).click();
		test.log(LogStatus.INFO, "User clicked in "+fieldName);
	}

	public static void clearAll(String xpathValue,String fieldName)
	{
		driver.findElement(By.xpath(xpathValue)).clear();
		test.log(LogStatus.INFO, "User cleared data in "+fieldName);
	}

	public static void selDropdownByIndex(String xpathValue,int dataValue,String fieldName)
	{
		Select dropDown = new Select(driver.findElement(By.xpath(xpathValue)));
		dropDown.selectByIndex(dataValue);
		test.log(LogStatus.INFO, "User Selected dropdown in "+fieldName+ " as "+dataValue);
		
	}

	public static void selDropdownByValue(String xpathValue,String dataValue,String fieldName)
	{
		Select dropDown = new Select(driver.findElement(By.xpath(xpathValue)));
		dropDown.selectByValue(dataValue);
		test.log(LogStatus.INFO, "User Selected dropdown in "+fieldName+ " as "+dataValue);
		
	}
	public static void selDropdownByText(String xpathValue,String dataValue,String fieldName)
	{
		Select dropDown = new Select(driver.findElement(By.xpath(xpathValue)));
		dropDown.selectByVisibleText(dataValue);
		test.log(LogStatus.INFO, "User Selected dropdown in "+fieldName+ " as "+dataValue);
		
	}

	public static void windowMax()
	{
		driver.manage().window().maximize();
	}

	public static void windowMin()
	{
		driver.manage().window().minimize();
	}
	public static void windowFullScreen()
	{
		driver.manage().window().fullscreen();
	}

	public static void browserBack()
	{
		driver.navigate().back();
	}

	public static void browserForward()
	{
		driver.navigate().forward();
	}

}
