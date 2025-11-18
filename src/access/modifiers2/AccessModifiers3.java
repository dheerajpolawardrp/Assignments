package access.modifiers2;

import access.modifiers1.AccessModifier1;

public class AccessModifiers3 extends AccessModifier1 {

	public static void main(String[] args) {
		AccessModifier1 am1 = new AccessModifier1();
		AccessModifiers3 am3 = new AccessModifiers3();

		System.out.println("Employee name is " + am1.name);
	am1.printempID();
	System.out.println("Accessing the public keyword outside package");
	
	
	System.out.println("Employee name is " +  am3.name1);
	am3.printempID1();
System.out.println("Accessing private keyword outside the package inside the sub-class");	
	}
	
	}


