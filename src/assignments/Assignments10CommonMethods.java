package assignments;

public class Assignments10CommonMethods {

	
		 double emplooyeeHike (String name, double BaseSalary, double variablepay , int bonus , int reward) {
			 
			 
			double Hike = ((BaseSalary) * (variablepay)/100) + bonus + reward;
			double percentageHike = Hike/BaseSalary;
			
			System.out.println("Percentage Hike for the " + name + " is " + percentageHike);
			 return percentageHike;
		 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
