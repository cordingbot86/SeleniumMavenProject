package test04;

public class Project extends Framework{

	public static void main(String[] args) {
		startReport("demoapplication");
		startTest("demo", "testing application");
		browser("edge");
		appUrl("https://demo.automationtesting.in/Register.html");
		typeIn("//input[@placeholder='First Name']", "testA", "testC");
		typeIn("//input[@placeholder='Last Name']", "testB", "testB");
		typeIn("//input[@ng-model='EmailAdress']", "testC", "testA");
		endTest();
		endReport();
	}

		
		
		
		
	

	
}
