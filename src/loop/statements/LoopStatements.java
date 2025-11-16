package loop.statements;

public class LoopStatements {
//LoopStatements ===> Loop the statements ===> Execute the statements based on the condition. {for, while, do-while loop}
//Types of loop statements:
//1. for loop ===> when we know the total number of iterations to be executed before itself.
//2. while loop ===> When we don't know the total number of iterations to be executed itself and we need to check the condition	
	
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