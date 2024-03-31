package test05;
import org.junit.*;
import org.junit.Test;

public class Program01 {
	
   @Test
	public void testcase01(){
		System.out.println("Log-In");
	}
   @Test
	public void testcase02() {
		System.out.println("Log-Out");
	}
   @After
	public void afterTestCase() {
		System.out.println("Close Browser");
		System.out.println("..............");
		
	}
   @Before
	public void BeforTestCase() {
		System.out.println("..............");
		System.out.println("Open Browser");
		System.out.println("Open Application");
	}
	
	
}
