package conditional.statements;

public class SwitchCaseConditionalStatements {
/*
3. Switch-case statements: When we know the result of a condition, and we want to chose the one option among multiple.
 
			 Syntax:
			 switch(expression) {
			 case value 1:
			 statement //line of code
			 break; 
			 switch(expression){
			 case value 2:
			 statement //line of code
			 break; 
			 ......
			 default:
			 statement //line of code
			}*/

	public static void main(String[] args) {
//select the school day based on the day
//   - if it is monday to friday, regular school dress
//	-  if it is saturday, sports dress	
//	- it it is sunday, color dress  
		
		String day = "Saturday";
		
		switch(day) {
		case "Monday":
			System.out.println("Regular School Uniform ");
		break;
		
	
		case "Tuesday":
			System.out.println("Regular School Uniform ");
		break;
		
		
		
		case "Wednesday":
			System.out.println("Regular School Uniform ");
		break;
		
	
		case "Thursday":
			System.out.println("Regular School Uniform ");
		break;
		
		
	case "Friday":
		System.out.println("Regular School Uniform ");
	break;
	
	
	
	case "Saturday":
		System.out.println("Regular Sports Uniform ");
	break;
	


case "Sunday":
	System.out.println("Regular Color Uniform ");
break;

default:
	System.out.println("This is invalid day ");
		}


}}