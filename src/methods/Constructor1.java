package methods;

public class Constructor1 {
/*
 Constructor: Constructor is a special java method used to initialize the object.The Constructor is called when an object of any class is created.
 */
	
//Default Constructor: whenever you create a class java will automatically create a default constructor method for the class  
//purpose of this default constructor is just to initialize the object
	Constructor1(){
	
		}
//Parameterized Constructor: 		
	//Constructor1(int empid){
	
		//}
//Before Parameterized Constructor"

	void printEmployeeName(int empid, String empname ) {
		
System.out.println("Employee ID " + empid);
System.out.println("Employee name " + empname);
	}
	
	void printEmployeeAddress(int empid, String address ) {
		
		System.out.println("Employee ID " + empid);
		System.out.println("Employee address " + address);
			}
	
	void printEmployeeSalary(int empid, double salary ) {
		
		System.out.println("Employee ID " + empid);
		System.out.println("Employee salary " +  salary);
			}
String bloodGroup1 = "O +ve"	;

			//After parameterized construtor
		//Parameterized Constructor: 		
		Constructor1(int id){
			empoyeeid = id;
			
		}
		int empoyeeid;
		void printEmployeeName(String empname ) {
			
			System.out.println("Employee ID " + empoyeeid);
			System.out.println("Employee name " + empname);
				}
				
				void printEmployeeAddress(String address ) {
					
					System.out.println("Employee ID " + empoyeeid);
					System.out.println("Employee address " + address);
						}
				
				void printEmployeeSalary(double salary ) {
					
					System.out.println("Employee ID " + empoyeeid);
					System.out.println("Employee salary " +  salary);
						}
			String bloodGroup = "O +ve"	;
				

public static void main(String[] args) {
	
}

}
