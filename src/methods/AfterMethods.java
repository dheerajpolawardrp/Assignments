package methods;

public class AfterMethods {

	
		
		/*
		  
/Method: a method is a block of code { } or collection of statements written together to complete specific task.	
	
//How to create method in Java?
	

	//1. Identify the duplicate code in your program that is going to complete a specific task.
	//2. Separate the duplicate code from each and every program and create a block outside of the main method and store duplicate code inside that.
	//3. Update each and every method block with meaningful names that reflect what tasks we are trying to complete.
	//4. Add the data-type before each and every method based on the data that we are expecting at the end.
	//5. Call the method inside the main method to execute the code.
	
	//Different types of methods in Java.
	
	//1. Method without return type.
	//2. Method with return type.
	//3. Method with parameters.
	//4. Method without parameters.
	//5. Static method.
	//6. Constructor methods.		 

 */	 
		public static void main(String[] args) {
			CommonMethods cm = new CommonMethods();
		
 	//Test Case 1: Validating the Home Page
		System.out.println("==============Test Case 1: Validating the Home Page==================");
		//System.out.println("Launch the chrome browser");
		//System.out.println("Enter url 'www.icici.com' and launch application");
		cm.launchBrowserAndApplicaton();
		//System.out.println("Enter username as Bharath");
		//System.out.println("Enter password as bharath123");
		//System.out.println("Click on Login button");
		cm.logintoApplication("Bharath" , "bharath123");
		System.out.println("Execute Test Case 1 Steps Related to HomePage....");
		//System.out.println("Logout from application");
		//System.out.println("Close the browser");
		cm.logoutandCloseBrowser();

		// Test Case 2: Validating the Fund Transfer Page
		System.out.println("==============Test Case 2: Validating the Fund Transfer Page==================");
		//System.out.println("Launch the chrome browser");
		//System.out.println("Enter url 'www.icici.com' and launch application");
		cm.launchBrowserAndApplicaton();
		//System.out.println("Enter username as Bharath");
		//System.out.println("Enter password as bharath123");
		//System.out.println("Click on Login button");
		cm.logintoApplication("Bharath" , "bharath123");
		//System.out.println("Execute Test Case 2 Steps Related to Fund Transfer Page....");
		//System.out.println("Logout from application");
		//System.out.println("Close the browser");
		cm.logoutandCloseBrowser();
		// Test Case 3: Validating the Login Page with Valid Credentials
		System.out.println(
				"==============Test Case 3: Validating the Login Page with Valid Credentials==================");
		//System.out.println("Launch the chrome browser");
		//System.out.println("Enter url 'www.icici.com' and launch application");
		cm.launchBrowserAndApplicaton();
		//System.out.println("Enter username as Bharath");
		//System.out.println("Enter password as bharath123");
		//System.out.println("Click on Login button");
		cm.logintoApplication("Bharath" , "bharath123");
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");
		//System.out.println("Logout from application");
		//System.out.println("Close the browser");
		cm.logoutandCloseBrowser();
		// Test Case 3: Validating the Login Page with Invalid Credentials
		System.out.println(
				"==============Test Case 3: Validating the Login Page with Invalid Credentials==================");
		//System.out.println("Launch the chrome browser");
		//System.out.println("Enter url 'www.icici.com' and launch application");
		cm.launchBrowserAndApplicaton();
		//System.out.println("Enter username as Invalid");
		//System.out.println("Enter password as invalid123");
		//System.out.println("Click on Login button");
				cm.logintoApplication("Invalid" , "invalid123");
		System.out.println("Execute Test Case 3 Steps Related to Login Page....");
		//System.out.println("Logout from application");
		//System.out.println("Close the browser");
		cm.logoutandCloseBrowser();
		// Test Case 4: Validating the Account Balance Page and get the balance
		System.out.println(
				"==============Test Case 4: Validating the Account Balance Page and get the balance==================");
		//System.out.println("Launch the chrome browser");
		//System.out.println("Enter url and launch application");
		cm.launchBrowserAndApplicaton();
		//System.out.println("Enter username as Bharath");
		//System.out.println("Enter password as bharath123");
		//System.out.println("Click on Login button");
		cm.logintoApplication("Bharath", "bharath123");
		System.out.println("Execute Test Case 4 Steps Related to Check the balance Page....");
		//System.out.println("Navigate to account section");
		//System.out.println("Capture the Account balance");
		//double balance = 1000.50;
		//System.out.println(balance);
		cm.getBalance();
		System.out.println(cm.getBalance());
		//System.out.println("Logout from application");
		//System.out.println("Close the browser");
		cm.logoutandCloseBrowser();


		
	}

}
