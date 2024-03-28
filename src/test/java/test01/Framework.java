package test01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class Framework {
	static WebDriver driver;
	
	public static void browser(String browserValue)
	{
		switch(browserValue) {
		case"chrome":
			driver=new ChromeDriver();
			break;
		case"firefox":
			driver=new FirefoxDriver();
			break;
		case"edge":
			driver=new EdgeDriver();
			break;
		case"ie":
			driver=new InternetExplorerDriver();
			break;
					
		}
	}
	public static void appUrl(String url)
	{
		driver.get(url);
	}
	public static void typeIn(String xpathValue,String dataValue)
	{
		driver.findElement(By.xpath(xpathValue)).sendKeys(dataValue);
	}
	public static void clickIn(String xpathValue)
	{
		driver.findElement(By.xpath(xpathValue)).click();
	}
	public static void clearAll(String xpathValue)
	{
		driver.findElement(By.xpath(xpathValue)).clear();
	}
	public static void selDropdownByIndex(String xpathValue,int dataValue)
	{
		Select dropDown=new Select(driver.findElement(By.xpath(xpathValue)));
		dropDown.selectByIndex(dataValue);
	}
	public static void selDropdownByValue(String xpathValue,String dataValue)
	{
		Select dropDown=new Select(driver.findElement(By.xpath(xpathValue)));
		dropDown.selectByValue(dataValue);
	}
	public static void selDropdownByText(String xpathValue,String dataValue)
	{
		Select dropDown=new Select(driver.findElement(By.xpath(xpathValue)));
		dropDown.selectByVisibleText(dataValue);
	}
	
	
}
