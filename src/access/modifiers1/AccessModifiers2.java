package access.modifiers1;

public class AccessModifiers2 {

	public static void main(String[] args) {
		AccessModifier1 am1 = new AccessModifier1();
		System.out.println("Employee name is " + am1.name);
	am1.printempID();
	System.out.println("Accessing the public keyword inside the same package outside the class");

	
	System.out.println("Employee name is " +  am1.name1);
	am1.printempID1();
System.out.println("Accessing private keyword inside the same package outside the class");	

System.out.println("Employee name is " +  am1.name2);
am1.printempID2();
System.out.println("Accessing default keyword inside the same package outside the class");	
	}

}
