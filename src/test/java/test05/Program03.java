package test05;




import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;


public class Program03 {
	@RepeatedTest(10)
	public void testcase01(){
		System.out.println("Log-In");
	}
	@BeforeAll
	public static void BeforeTestCase() {
		System.out.println("..............");
		System.out.println("Close Browser");
		System.out.println("Close Application");
	}
	
	
	@BeforeEach
	public void BeforeEachTestCase() {
		System.out.println("..............");
		System.out.println("Close Browser");
		System.out.println("Close Application");
	}
	
	
}
