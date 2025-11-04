package language.basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class PrintStatements {
//benefits of print statements
//1. Educational and learning purpose
//2.Debugging and error detection
//3. Monitoring the program execution
//4. Testing and validating the results
//5.Log the system results to analyze later.
	public static void main(String[] args) throws FileNotFoundException {
	
//Print the information and go to next line.
	System.out.println("Java, Automation  !");	
	
	
	//Print the information and stay on the same line.
	System.out.print("Hello");
	System.out.print(" World !");
	System.out.println();
	
//print the formatted content and stay on the same line.
System.out.println("Pooja is completed B.Tech, and employee ID is 1232. Her visa status is true");	
System.out.println("Mayuri is completed B.Tech, and employee ID is 1234. Her visa status is true");
System.out.println("Tejas is completed B.Tech, and employee ID is 1236. His visa status is false");
System.out.println("Dheeraj is completed B.Tech, and employee ID is 1238. His visa status is false");

// %s refers to string or text value.
// %d refers to digit or number.
// %f refers to decimal point, number with decimal
// %b refers to boolean value, true or false
System.out.printf("%s is completed B.Tech, and employee ID is %d. Her visa status is %b", "Anusha",1240, true);
System.out.println();	

//to print error message in java
System.out.println();

System.out.println("There is an error in line no. 27");

System.err.println("There is an error in line no. 27");

//Print the logs
Logger logger = Logger.getLogger("HelloWord");
logger.info("There is informaion withing line no.45. Program is going well");
System.out.println();
logger.warning("There is something wrong in line no. 47");
System.out.println();

//Print and export the logs in text file
PrintWriter log = new PrintWriter ("C:\\AutomationTraining\\JavaTraining\\HelloWord.txt");
log.println("Currently line no. 54 is executed successfully");
log.println("Currently line no. 55 is executed successfully");
log.println("Program is executed successfully");
log.close();
	}

}
