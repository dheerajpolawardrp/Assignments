package classes.objects;

public class TestClass {


	
	public static void main(String[] args) {
	//object creation
		MainClass obj = new MainClass();
	//to access the data
System.out.println("Employee ID is " + obj.empID);
System.out.println("Employee name is " +  obj.name);
System.out.println("Employee visa status is " + obj.VisaStatus);	
System.out.println("Employee age is " + MainClass.age);	
	
	}

}
