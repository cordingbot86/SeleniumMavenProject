package day01;

public class Project extends Framework{

	public static void main(String[] args) {
	
		browser("edge");
		appUrl("https://accounts.google.com/signup");
		typeIn("//input[@name='firstName']");
		typeIn("//input[@name='lastName']");
		clickIn("//input[@type='checkbox']");
		clearAll("//input[@name='firstName']");
	}

}
