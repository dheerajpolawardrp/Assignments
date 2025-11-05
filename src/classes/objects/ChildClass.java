package classes.objects;

public class ChildClass extends MainClass {
//Inheritance is OOP concept
//Extendig parent class properties into child class without creating any object	
	public static void main(String[] args) {
	
		ChildClass cd = new ChildClass();
		System.out.println(cd.empID);
		System.out.println(cd.name);
		System.out.println(cd.VisaStatus);
	}

}
