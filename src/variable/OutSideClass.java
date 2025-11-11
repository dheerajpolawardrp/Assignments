package variable;

public class OutSideClass {

	public static void main(String[] args) {
	//to access the instance variable of another class inthis class
//we need to create object of that class
		
CategoriesOfVariables ct = new CategoriesOfVariables();
System.out.println(ct.course);

//Accessing the static variable outside the class
System.out.println(CategoriesOfVariables.language);
	}

}
