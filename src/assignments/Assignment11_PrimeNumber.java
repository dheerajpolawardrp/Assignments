package assignments;

public class Assignment11_PrimeNumber {

	
	
	public static void main(String[] args) {
		// A Prime number is a number greater than 1
				// that is divisible only by 1 and itself.
				// Example: 2, 3, 5, 7, 11, ...
		
	//first need to check whether it is greater than 1
		int number  = 7;
		boolean prime = true;
		if( number <=1) {
			System.out.println("Number is not prime number " + number);
			prime = false; //for any value less than or eqaul to 1 is not prime
			
		}
	//now we need to check whether it is divisible by 1 and itself so prime number starts from 2 
		for ( int i =2 ; i<=number; i++) {
			
			if(number%2==0) {
				System.out.println("Number is not prime number " + number);
				prime = false;
			}
		}
		if(prime) {
			System.out.println("Number is prime number " + number);
		}
		else {
			System.out.println("Number is not prime number " + number);
		}
	}

}
