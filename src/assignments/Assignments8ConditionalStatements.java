package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignments8ConditionalStatements {

	public static void main(String[] args) {

		List<Integer> transactionvalues = new ArrayList<Integer>();

		transactionvalues.add(50000);
		transactionvalues.add(-2000);
		transactionvalues.add(3000);
		transactionvalues.add(-15000);
		transactionvalues.add(-200);
		transactionvalues.add(-300);
		transactionvalues.add(4000);
		transactionvalues.add(-3000);

		List<Integer> value = transactionvalues;

		System.out.println(value); // print each value

		int creditCount = 0;
		int debitCount = 0;
		int totalCredit = 0;
		int totalDebit = 0;
		int balance = 0;
		int suspiciousCount = 0;

//print the credit values:
		for (int amount : transactionvalues) {

			if (amount > 0) {
				System.out.println(" This is the credit tranasaction " + amount);
				creditCount++;
				
				
				totalCredit += amount;
				System.out.println("Total credit count is " + creditCount);
				System.out.println("TotaL cedit amount is "+ totalCredit  );
				System.out.println("********************************************************");	
	
			} 
			else {
				System.out.println("This is the debit tranasaction " + amount);
				debitCount++;
				
				totalDebit += amount;
				System.out.println("Total credit count is " + debitCount);	
				System.out.println("TotaL cedit amount is "+totalDebit  );
			
				System.out.println("********************************************************");	

			}
			if (amount >= 10000 || amount <= -10000) {
				suspiciousCount++;
				suspiciousCount += amount;
				System.out.println("This is the suspicious tranasaction " + amount);
				balance += amount;
			
				System.out.println("********************************************************");	

			}
		}
		System.out.println(balance = totalCredit - totalDebit);
		// System.out.println(balance);
		System.out.println("********************************************************");	

	}

}
