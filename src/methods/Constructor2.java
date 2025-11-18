package methods;

public class Constructor2 {

	public static void main(String[] args) {
		
		
		Constructor1 obj = new Constructor1();//creating object of Constructor1 class (Default Constructor)
//object is always combination of new keyword and constructor method		
//before parameterized constructor	
	
		System.out.println("Blood group is " + obj.bloodGroup);
	
	obj.printEmployeeAddress(101, "Stockholm");
	obj.printEmployeeName(101, "Mark");
	obj.printEmployeeSalary(101, 245678.00);
	
System.out.println("***************************************");
Constructor1 obj1 = new Constructor1(101);//creating object of Constructor1 class (Parameterized Constructor)
		//After parameterized construction
		System.out.println("Blood group is " + obj1.bloodGroup);
		obj1.printEmployeeAddress("Stockholm");
		obj1.printEmployeeName("Mark");
		obj1.printEmployeeSalary(245678.00);
	}

}
