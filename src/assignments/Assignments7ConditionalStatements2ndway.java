package assignments;

public class Assignments7ConditionalStatements2ndway {

	public static void main(String[] args) {

		// first we need to initiate variables:

		String customerName = "John Doe";
		int creditScore = 720;
		double income = 55000.0;
		boolean isEmployed = true;
		double debtToIncomeRatio = 35.0;

//if the credit score is more than 750
		if (creditScore > 750) {

			System.out.println("Loan is approved automatically");
		}
		// here checked the credit score
		else if (creditScore >= 650) {

			System.out.println("Additional checks needs to performed for the customer " + customerName);

			// here checked the income
			if (income >= 55000.0) {
				System.out.println("Meets Income criteria as income is equals 55000.0 ");

				if (isEmployed) {
					System.out.println("Meets the employement criteria as customer is employed");

					if (debtToIncomeRatio < 40) {

						System.out.println("Meets debtToIncomeRatio criteria as it is less than 40 ");
						System.out.println("Loan approved meets all criteria ");
					} // debtToIncomeRatio if block is closed

					else {
						System.out.println(" Does not meets debtToIncomeRatio criteria ");
					} // debtToIncomeRatio else block is closed

					
				} // isEmployed if block is closed

				else {
					System.out.println("Loan Denied: customer unemployed.");
				} // isEmployed else block is closed
			} // income if block is closed
			
			else {
				System.out.println("Loan is denied as income is less");
			}  //come else block is closed
			
		} //credit score if block is closed
			else {
				System.out.println("Loan is not approved does not creditScore criteria ");
			}	//credit score else block is closed
		}
	}
			/*
			 * A bank evaluates loan applicants based on the following criteria: 1. Credit
			 * Score: o If the credit score is above 750, the loan is automatically
			 * approved. o If the credit score is between 650 and 750, additional checks are
			 * performed. o If the credit score is below 650, the loan is denied. 2. Income:
			 * o For credit scores between 650 and 750, the customer’s income must be at
			 * least $50,000 for the loan to be considered.
			 * 
			 * 3. Employment Status: o If the customer’s income is at least 50,000, the
			 * system checks whether the customer is employed. o If the customer is
			 * unemployed, the loan is denied. 4. Debt-to-Income Ratio: o If the customer is
			 * employed, the system checks the debt-to-income (DTI) ratio. o If the DTI
			 * ratio is less than 40%, the loan is approved. o If the DTI ratio is 40% or
			 * greater, the loan is denied.
			 * 
			 * Now based on below details, print whether user is eligible to get the loan or
			 * not customerName = "John Doe"; creditScore = 720; income = 55000.0;
			 * isEmployed = true; debtToIncomeRatio = 35.0;
			 */

		
	
