package test04;

public class Project extends Framework{

	public static void main(String[] args) throws Exception {
		startReport("demoapplication");
		startTest("demo", "testing application");
		browser("edge");
		appUrl("https://demo.automationtesting.in/Register.html");
		typeIn("firstName");
		typeIn("lastName");
		typeIn("EmailAdress");
		endTest();
		endReport();
	}

		
		
		
		
	

	
}
