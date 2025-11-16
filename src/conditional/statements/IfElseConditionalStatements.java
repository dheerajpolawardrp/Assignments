package conditional.statements;

public class IfElseConditionalStatements {

	public static void main(String[] args) {
//Sample program to demonstrate if, else if and else statements
		int number = 15;

		if (number > 0) {
			System.out.println(number + " The number is positive number ");
		} else if (number < 0) {
			System.out.println(number + " The number is negative number ");
		} else {
			System.out.println(" The number is zero ");
		}
//Sample program to demonstrate nested if-else statements
		
		//main if-else
	boolean isPrabhasmoviveavailable = true;
	boolean isMaheshbabumoviveavailable = false;
	boolean isChirnajivemoviveavailable = false;
		
	//nested if else
	boolean isReclineravailable = true;
	boolean isBalconyavailable = false;
	
	
	if(isPrabhasmoviveavailable) {
		System.out.println("Watch Prabhas movie");
		
		if(isReclineravailable) {
			System.out.println("Sit in Recliners");
		}
		else if(isBalconyavailable) {
			System.out.println("Sit in Balcony");
		}
		else {
			System.out.println("Sit in normal seat");
		}
		
	}
			else if(isMaheshbabumoviveavailable) {
				System.out.println("Watch Maheshbabu movie");
			}
			else if (isReclineravailable){
				System.out.println("Sit in Recliners");
			}
		
		else if(isChirnajivemoviveavailable) {
					System.out.println("Watch Chirnjivi movie");
				}
				else if(isReclineravailable) {
					System.out.println("Sit in Recliners");
				}
		else {
			System.out.println("Watch webseries at home ");
		}
	}
	
	
	}


