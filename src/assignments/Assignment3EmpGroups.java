package assignments;

public class Assignment3EmpGroups extends Assignment3Employees{

	public static void main(String[] args) {
		Assignment3EmpGroups a3 = new Assignment3EmpGroups();
		
		System.out.println(a3.emp1id);
		System.out.println(a3.emp1);
		System.out.println(a3.emp2id);
		System.out.println(a3.emp2);
		System.out.println(a3.emp3id);
		System.out.println(a3.emp3);
		
String [] empname = {"Bharath" ,"John","Aarav"};
int [] empid = {1234,1235,1236};

System.out.println("employee name is " +empname[0] + " and " + "Employee ID is " + empid [0] );
System.out.println("employee name is " +empname[1] + " and " + "Employee ID is " + empid [1] );
System.out.println("employee name is " +empname[2] + " and " + "Employee ID is " + empid [2] );

	}

}
