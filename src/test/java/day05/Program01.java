package day05;

import org.junit.jupiter.api.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class Program01 {
	@Test

    public void testcase01()
   {
	System.out.println("Log-IN");
   }
	@Test
	public void testcase02()
	{
		System.out.println("Log-OUT");
	}
	@AfterClass
	public static void afterTestCase()
	{
		System.out.println("Close Browser");
		
	}
	
	@BeforeClass
	public static void beforeTestCase()
	{
		System.out.println("Open Browser");
		System.out.println("Open Application");
	}

}
