package access.modifiers1;

public class AccessModifier1 {

//Access Modifiers in Java: Keywords that we are going to use in Java to control the access of Java elements 
//(java element meaning classes, data and methods).	
	
//Types of Access Modifiers
	//1.public ==> accessible from anywhere (within the project)
	//2.protected ==> accessible within the same package and also in subclass of different package
	//3.default (no keyword) ==> accessible only within the same package
	//4.private ==> accessible only within the same class
	
//public ==> can be used before class, method and variable	
	public String name = "Bharath";
	
	public void printempID() {
		
		System.out.println("Employee ID is 1234 ");
	}
//protected ==>
		protected String name1 = "Anusha";
		
		protected void printempID1() {
			
			System.out.println("Employee ID is 12345 ");		
	}
		
//default access modifier
		 String name2 = "Saumya";
		
		 void printempID2() {
			
			System.out.println("Employee ID is 123456 ");		
	}
		 
//private access modifier		 
		 private String name3 = "Janhavi";
			
		 private void printempID3() {
			
			System.out.println("Employee ID is 1234567 ");	
		 }
	public static void main(String[] args) {
		
		
		AccessModifier1 am1 = new AccessModifier1();
		System.out.println("Employee name is " + am1.name);
	am1.printempID();
	
	System.out.println("Accessing the public keyword inside the same class");
	
	System.out.println("Employee name is " +  am1.name1);
	am1.printempID1();
System.out.println("Accessing private keyword inside the same class");	
	
System.out.println("Employee name is " +  am1.name2);
am1.printempID2();
System.out.println("Accessing default keyword inside the same class");	
	
System.out.println("Employee name is " +  am1.name3);
am1.printempID3();
System.out.println("Accessing private keyword inside the same class");	

	}

}
