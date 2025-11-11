package variable;

public class CategoriesOfVariables {
	//There are total four types of variables in JAVA
	//1.Local Variable: LocaL variables are nothing but the variables created inside the block/method.Local variables can be accessed within that method/block only
			
	//2. Instance Variable or Class Variable: These variables are defined outside the method but inside the class
			
	//3. Static variable:Static variables are declared with the Static keyword inside the class but outside the method
			
	//4. Parameter variables are arguments: These variables are used to pass the value to methods.These are also local variables 
	
	String course = "Java"; //Instance Variable
	
//Static variable
	
	static String language = "Javascript";
	
	public static void main(String[] args) {
	 sum (10,20);
	
	 //Local Variable
	String name = "Selenium"; //This 'name'is the local variable
		System.out.println(name);
		
//Accessing instance variable
CategoriesOfVariables cd = new CategoriesOfVariables();	
System.out.println(cd.course);	
	
//Accessing the static variable within the class
System.out.println(CategoriesOfVariables.language);
System.out.println(language);

	}
	
	public static void sum ( int a, int b) { // a and b are parameter variables or method arguments
		System.out.println(a+b);
		
	}
	public void accessdata() {
		//System.out.println(name); //cannot access local variable here
System.out.println(course);	
	}

}
