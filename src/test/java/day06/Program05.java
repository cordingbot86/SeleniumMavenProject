package day06;

import org.testng.annotations.*;

public class Program05 {
	@BeforeTest
	
	public void testBefore()
	{
		System.out.println("Befor Test"); 
	} 
	@AfterTest
	public void testAfter()
	{
		System.out.println("After Test"); 
	}
	
	
	@Test
	public void testCases04()
	{
		System.out.println("TC-04");
	}
	@Test
	public void testCases05()
	{
		System.out.println("TC-05");
	}
	
	@Test
	public void testCases01()
	{
		System.out.println("TC-01");
	}
	@Test
	public void testCases02()
	{
		System.out.println("TC-02");
	}
	@Test
	public void testCases03()
	{
		System.out.println("TC-03");
	}
	
}
