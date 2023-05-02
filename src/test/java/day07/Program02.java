package day07;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Program02 {
	
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
	@Test(groups = {"smoke"})
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
	@Test(groups = {"smoke"})
	public void testcase08()
	{
		System.out.println("Test-08");
	}
	@BeforeGroups(groups = {"smoke"})
	public void beforeGrp()
	{
		System.out.println("Before Group");
	}
	@AfterGroups(groups = {"smoke"})
	public void afterGrp()
	{
		System.out.println("After Group");
	}
}
