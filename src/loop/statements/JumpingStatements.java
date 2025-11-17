package loop.statements;

public class JumpingStatements {

	public static void main(String[] args) {

		// JumpingStatements:JumpingStatements is nothing but the set of keywords used
		// to jump from current iteration to other iteration.

		// There are mainly three different jumping statements available:
		// 1. break statement: used to terminate the current loop or switch statement
		// and transfer execution to the statement immediately following the loop or
		// switch.
		// 2. continue statement: used to skip the current iteration of a loop and
		// transfer execution to the beginning of the next iteration of the loop.
		// 3. return statement: used to exit from a method and optionally return a value
		// to the caller.

		
		System.out.println("*****************break***************************");
		for (int i = 1; i <= 10; i++) {

			if (i == 5) {
				break; // break the loop and come out of the loop
			}
			System.out.println(i);
		}
		System.out.println("******************continue**************************");
		for (int j = 1; j <= 10; j++) {

			if (j == 5) {
				continue; //skip the current iteration and move to next iteration
			}
			System.out.println(j);
		}
		System.out.println("******************return**************************");
	}

}
