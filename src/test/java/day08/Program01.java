package day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Program01 {
    WebDriver driver;
    @Parameters({"userName","passWord"})
	@Test()
	public void testcases(String userName,String passWord) 
	{
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.findElement(By.name("uid")).sendKeys(userName);
         driver.findElement(By.name("passWord")).sendKeys(passWord);
         driver.findElement(By.name("btnLogin")).click();
	}

}
