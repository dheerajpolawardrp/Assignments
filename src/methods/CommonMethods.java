package methods;

public class CommonMethods {

	
	//1. Identify the duplicate code in your program that is going to complete a specific task.
	//2. Separate the duplicate code from each and every program and create a block outside of the main method and
			//store duplicate code inside that.	
		void launchBrowserAndApplicaton(){
			System.out.println("Launch the edge browser");
			System.out.println("Enter url 'www.icici.com' and launch application");
		}
		
		void logintoApplication(String username, String password){
			System.out.println("Enter username as " + username);
			System.out.println("Enter password as " + password);
			System.out.println("Click on Login button");
		}
		
		void logoutandCloseBrowser(){
			System.out.println("Logout from application");
			System.out.println("Close the browser");
		}
		double getBalance(){
			System.out.println("Navigate to account section");
			System.out.println("Capture the Account balance");
			double balance = 1000.50; //local variable
			return balance;
		}
		
		
	public static void main(String[] args) {
		

	}

}
