package day07;

import org.testng.annotations.Test;

public class Program01 {
	
	@Test(groups = {"smoke"})
	public void testcase01()
	{
		System.out.println("Test-01");
	}
	@Test(groups = {"smoke"})
	public void testcase02()
	{
		System.out.println("Test-02");
	}
	@Test(groups = {"smoke"})
	public void testcase03()
	{
		System.out.println("Test-03");
	}
	@Test(groups = {"smoke","bca"})
	public void testcase04()
	{
		System.out.println("Test-04");
	}
	@Test(groups = {"smoke"})
	public void testcase05()
	{
		System.out.println("Test-05");
	}
	@Test(groups = {"smoke"})
	public void testcase06()
	{
		System.out.println("Test-06");
	}
	@Test(groups = {"smoke"})
	public void testcase07()
	{
		System.out.println("Test-07");
	}
	@Test(groups = {"smoke","abc"})
	public void testcase08()
	{
		System.out.println("Test-08");
	}
}
