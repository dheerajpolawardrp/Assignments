package assignments;

public class Assignments8ConditionalStatement2ndway {

	public static void main(String[] args) {
	
		//array of transactions
		int [] amount = {50000, -2000, 3000, -15000, -200, -300, 4000, -3000};
		
		//variables to store the data
		
		int totalcreditamount = 0;
		int totaldebitamount = 0;
		int totaldebitcount = 0;
		int totalcreditcount  = 0;
		int finalbalance =0;
		int suspicioustransactioncount = 0;
		
		for (int transaction :amount) {
			
			if (transaction > 0 ) {
				totalcreditcount++;
				totalcreditamount+=transaction;
				System.out.println(totalcreditamount);
				System.out.println("Total credit count is " + totalcreditcount);
			
			if(transaction>10000) {
				suspicioustransactioncount++;
				System.out.println("This is suspicious transaction " + transaction);
				System.out.println("Total suspicious transaction count is " + suspicioustransactioncount);

			}
			}else {
				totaldebitcount++;
				totaldebitamount-= transaction;
				System.out.println(totaldebitamount);
				System.out.println("Total debit count is " + totaldebitcount);
			
			if(transaction < -10000) {
				suspicioustransactioncount++;
				System.out.println	("This is suspicious transaction " + transaction);
				System.out.println("Total suspicious transaction count is " + suspicioustransactioncount);
			}
			}
		}
		finalbalance = totalcreditamount - totaldebitamount;
		System.out.println("Total final balance is " + finalbalance);
		System.out.println("Total suspicious transaction count is " + suspicioustransactioncount);
		System.out.println("Total credit count is " + totalcreditcount);
		System.out.println("Total debit count is " + totaldebitcount);
		System.out.println("Total debit amount is " + totaldebitamount);
		System.out.println("Total credit amount is " + totalcreditamount);
	}

}
