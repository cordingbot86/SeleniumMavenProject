package test02;

public class Project extends Framework{

	public static void main(String[] args) {
		startReport("demoapplication");
		startTest("demo", "testing application");
		browser("edge");
		appUrl("https://demo.automationtesting.in/Register.html");
		typeIn("//input[@placeholder='First Name']", "testA", "testB");
		typeIn("//input[@placeholder='Last Name']", "testB", "testA");
		typeIn("//input[@ng-model='EmailAdress']", "gp13455@gmail.com", "testB");
		endTest();
		endReport();
	}

		
		
		
		
	

	
}
