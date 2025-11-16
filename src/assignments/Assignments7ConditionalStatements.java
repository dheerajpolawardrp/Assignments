package assignments;

public class Assignments7ConditionalStatements {

	public static void main(String[] args) {

		int creditscore = 720;
		int income = 55000;
		boolean isEmployed = true;
		double debtToIncomeRatio = 35.0;

		if (creditscore > 750) {

			System.out.println("Loan is automatically approved");

		} else if (creditscore >= 650 && creditscore <= 750) {

			System.out.println("Additional checks needs to be performed");

			if (income < 50000) {
				System.out.println("Loan is denied to due to low incom");
			}

			else if (!isEmployed) {
				System.out.println("loan is denied due to user is unemployed");

			} else if (debtToIncomeRatio >= 40) {
				System.out.println("loan is denied due due user debtToIncomeRatio check not satisfied");
				System.out.println("Additional checks are not passed and loan is not approved");

			} else {
				System.out.println("Additional checks are passed and loan is approved");
			}

		}
	}
}
