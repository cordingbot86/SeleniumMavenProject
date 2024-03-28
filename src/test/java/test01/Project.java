package test01;

public class Project extends Framework{

	public static void main(String[] args) {
		browser("edge");
		appUrl("https://demo.automationtesting.in/Register.html");
		typeIn("//input[@placeholder='First Name']", "testA");
		typeIn("//input[@placeholder='Last Name']", "testB");
		typeIn("//input[@ng-model='EmailAdress']", "gp13455@gmail.com");
		
		
		
		
		
	}

	
}
