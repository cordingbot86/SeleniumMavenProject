package day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Program03 {
 
	WebDriver driver;
	@Test(dataProvider = "demo")
	public void testcases(String userName,String passWord) 
	{
		driver = new EdgeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.findElement(By.name("uid")).sendKeys(userName);
         driver.findElement(By.name("passWord")).sendKeys(passWord);
         driver.findElement(By.name("btnLogin")).click();
	}
	  @DataProvider(name ="demo")
      public Object[][] tastData()
      {
    	  return new Object[][]  {{"user1","help1"},
    		  {"user2","help2"},
    		  {"user3","user3"}};
    	
    	  
      }
                      
}
