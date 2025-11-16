package loop.statements;

public class WhileLoop {

	// 2. while loop ===> When we don't know the total number of iterations to be
	// executed itself and we need to check the condition
	/*
	 * Syntax for while loop is:
	 * 
	 * while(condition){ 
	 * 		System.out.println(); 
	 * 		condition to break the loop;
	 *    }
	 */
	public static void main(String[] args) {
		
		int i =1;
		while ( i > 0 ) {
			
			boolean ispagedisplayed = false;
			
			if(ispagedisplayed || i==5) {
				
				System.out.println("Page is displayed successfully. Exiting the loop now");
			break;
			}
			System.out.println("Refresh the page");
			i++;
			
		}

	}

}
