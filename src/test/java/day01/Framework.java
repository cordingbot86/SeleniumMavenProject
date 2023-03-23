package day01;

import java.io.File;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public abstract class Framework {
	
	private static final String url = null;
	private static final CharSequence dataValue = null;
	static WebDriver driver;
	private static Select dropDown;
	@SuppressWarnings("unused")
	private static String frameNameId;
	
	public static void browser(String browserValue)
	{
		switch (browserValue) {
		case "Chrome":
			driver =new ChromeDriver();
			break;
		case "firefox":
			driver =new FirefoxDriver();
			break;
		case "edge":
			driver =new EdgeDriver();
			break;
		case "ie":
			driver =new InternetExplorerDriver();
			break;
			
					
			default:
				break;
		
		}
	}
	
	public static void appUrl(String url) {
		
	}
	{
     driver.get(url);
	}
    public static void typeIn(String xpathValue)
    {
    	driver.findElement(By.xpath(xpathValue)).sendKeys(dataValue);
    }
    public static void clickIn(String xpathValue)
    {
    	driver.findElement(By.xpath(xpathValue)).click();
    }
    public static void clearIn(String xpathValue)
    {
    	driver.findElement(By.xpath(xpathValue)).clear();
    }
    public static void selDrpodownByIndex(String xpathValue,int dataValue)
    {
    	new Select(driver.findElement(By.xpath(xpathValue)));
    	dropDown.selectByIndex(dataValue);
    }
    public static void selDrpodownByValue(String xpathValue,String dataValue)
    {
    	new Select(driver.findElement(By.xpath(xpathValue)));
    	dropDown.selectByValue(dataValue);
    }
    public static void selDrpodownByText(String xpathValue,String dataValue)
    {
    	new Select(driver.findElement(By.xpath(xpathValue)));
    	dropDown.selectByVisibleText(dataValue);
    }
    public static void WindowMax()
    {
    	driver.manage().window().maximize();
    }
    public static void WindowMin()
    {
    	driver.manage().window().minimize();
    }
    public static void Windowfullscreen()
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
    
    public static void browserRefresh()
    {
    	driver.navigate().refresh();
    }
    public static void close()
    {
    	driver.close();
    }
    public static void quit()
    {
    	driver.quit();
    }
    
    public static String getPageTitle()
    {
		return driver.getTitle();
    	
    }
    
    public static String getPageUrl()
    {
		return driver.getCurrentUrl();
    	
    }
    public static void alertOk()  
    {
    	driver.switchTo().alert().accept();
    }
    public static void alertCancel()  
    {
    	driver.switchTo().alert().dismiss();
    }
    public static void alerttypeIn(String dataValue)  
    {
    	driver.switchTo().alert().sendKeys(dataValue);
    }
    
    public static String getAlertText()
    {
		return driver.switchTo().alert().getText();
    	
    }
    public static Set<String>getPageWindowIds()
    {
		return driver.getWindowHandles();
    	
    }
    public static String getPageWindowId()
    {
		return driver.getWindowHandle();
    	
    }
    public static void switchToFrame(String frameNameId)
    {
		driver.switchTo().frame(frameNameId);
    	
    }
    public static void switchToFrameByXpath(String xpathValue)
    {
		driver.switchTo().frame(driver.findElement(By.xpath(xpathValue)));
    	
    }
    
     public static void switchToMainFrame()
    {
		driver.switchTo().defaultContent();
    	
    }
   
 	
 	public static void takeScreenShot(String fileName) throws Exception
 	{
 		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 		File des = new File("./ScreenShot/"+fileName+".png");
 		FileUtils.copyFile(scr, des);		
 	}
}







