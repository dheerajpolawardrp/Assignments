package assignments;

public class Assignments9ConditionalStatements {

	public static void main(String[] args) {
		// Given values are 12 ,34,11,36,87,98,93.

		int[] num = { 12, 34, 11, 36, 87, 98, 93 };

		for (int numbers : num) {
			if (numbers > 36 && numbers < 98) {

				System.out.println(numbers);
			} else {

			}

		}
	System.out.println("*************************************************");	
		
//Another way 
		int[] numbers = { 12, 34, 11, 36, 87, 98, 93 };
		int largest = numbers [0] ;
		int secondlarges = numbers [0] ;
		
		for ( int n : numbers) {
			
			if ( n > largest) {
				
				largest = n;
				
			}
		}
			
for ( int n : numbers) {
			
			if ( n > secondlarges && n < largest) {
				
				secondlarges = n;
	}

}
System.out.println(largest);
System.out.println(secondlarges);
			
}}