package day05;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;

public class Program02 {
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
	
	@After
	public void afterTestCase()
	{
		System.out.println("Close Browser");
		System.out.println("###################");
	}
	@Before
	public void beforeTestCase()
	{
		System.out.println("###################");
		System.out.println("Open Browser");
		System.out.println("Open Application");
	}
	
	
}
