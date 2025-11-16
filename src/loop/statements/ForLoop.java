package loop.statements;

public class ForLoop {

	//1. for loop ===> when we know the total number of iterations to be executed before itself.

	/*
	 Syntax for for loop is:
	 
	 for(initialization; condition to end; increment/decrement){
	   System.out.println()
	 
	 }
	 */
	
	public static void main(String[] args) {
		//Before loop 
		//If we need to print the name "Bharath" 5 times:
				System.out.println("Bharath");		
				System.out.println("Bharath");	
				System.out.println("Bharath");	
			System.out.println("Bharath");	
			System.out.println("Bharath");	

		//After using for loop
			
			for ( int i=1; i<=5; i++) {
				System.out.println("Print the name Bharath");
			}
	}

}
