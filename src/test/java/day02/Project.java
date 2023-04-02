package day02;

public class Project extends Framework{

	public static void main(String[] args) {
		
			startReport("demoapplication");
			startTest("demo", "testing application");
			browser("edge");
			appUrl("https://accounts.google.com/signup");
			typeIn("//input[@name='firstName']", "testA","firstName");
			typeIn("//input[@name='lastName']", "testA","lastName");
			clickIn("//input[@type='checkbox']","showPassword");
			clearAll("//input[@name='firstName']","firstName");
			endTest();
			endReport();
		}

	public static void endReport() {
		// TODO Auto-generated method stub
		
	}

	public static void endTest() {
		// TODO Auto-generated method stub
		
	}

	public static void clearAll(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	public static void clickIn(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	public static void typeIn(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		
	}

	public static void appUrl(String string) {
		// TODO Auto-generated method stub
		
	}

	public static void browser(String string) {
		// TODO Auto-generated method stub
		
	}

	public static void startTest(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	public static void startReport(String string) {
		// TODO Auto-generated method stub
		
	}

	}


