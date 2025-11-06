package assignments;

public class Assignment3EmpGroups1 {
/*
 Create an Employees class that stores the following employee names and IDs in separate variables:
• Employee Names: "Bharath", "John", "Aarav"
• Employee IDs: 1234, 1235, 1236

Then, create another class called EmpGroups that contains two arrays to store the employee names
and IDs.

Retrieve the data from the Employees class, store it in these arrays, and finally print each employee's
name along with their corresponding ID.
 */
	public static void main(String[] args) {
	
		Assignment3Employees obj = new Assignment3Employees();
	//to access the data and store in arrays, for this we need to create an array and then store the values in it
//by accessing from the another class		
		String [] Employee = new String [3];
		Employee[0] = obj.emp1; 
		Employee[1] = obj.emp2;
		Employee[2] = obj.emp3;
		
//Similar way need to create an array for employeeId, for this need to create an array and store the values in it
		
int[] EmployeeId = new int [3];	

EmployeeId [0]	= obj.emp1id;
EmployeeId [1]	= obj.emp2id;
EmployeeId [2]	= obj.emp3id;


System.out.println("Name of the employee " + Employee[0] + "and id of the employee is " + EmployeeId [0] );
		
System.out.println("Name of the employee " + Employee[1] + "and id of the employee is " + EmployeeId [1] );

System.out.println("Name of the employee " + Employee[2] + "and id of the employee is " + EmployeeId [2] );

	}

}
