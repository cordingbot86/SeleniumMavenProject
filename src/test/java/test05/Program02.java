package test05;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Program02 {
	  @Test
		public void testcase01(){
			System.out.println("Log-In");
		}
	   @Test
		public void testcase02() {
			System.out.println("Log-Out");
		}
	   @AfterClass
		public static void afterTestCase() {
			System.out.println("Close Browser");
			System.out.println("..............");
			
		}
	   @BeforeClass
		public static void BeforTestCase() {
			System.out.println("..............");
			System.out.println("Open Browser");
			System.out.println("Open Application");
		}
		
}
