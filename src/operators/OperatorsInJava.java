package operators;

public class OperatorsInJava {
//Operators: Operators are the special characters used in Java programming language to perform different types of operations
//There are five types of operators in Java
//1.Arithmetic operators ==> Set of special characters used in mathematical operations ( +,-,/,*,%(modulus),++(Increment by 1),--(Decrement by 1)
	
//2. Assignment operators==>these are used to assign values to variables(=, +=, -=, *=, /=, %=) 
	
//3. Comparison operators==>used to compare two values and return a boolean result (==, !=, >, <, >=, <=)
	
//4. Logical operators==> used to combine multiple conditions and build logic (&& (AND), || (OR), ! (NOT) )
	
//5. Ternary operator==> used to evaluate a condition and return one of two values based on the result (condition ? value 1 : value 2)
	public static void main(String[] args) {
    System.out.println("**********Arithmetic operators***************");
int a = 10;
int b = 5;

System.out.println("Addition of two numbers is " + (a+b)); //15
System.out.println("Substraction of two numbers is " + (a-b)); //5
System.out.println("Multiplication of two numbers is " + (a*b)); //50
System.out.println("Division of two numbers is " + (a/b)); //2
System.out.println("Modulus of two numbers is " + (a%b)); //0

//++ is called increment operator ==> increase the value of variable by 1
 System.out.println(a++);//10 (++ added at the end of variable is called as post-increament) 
 System.out.println("The value of variable after the post increamet is " + a); //11
 System.out.println(++b); //pre-increment //6
 System.out.println("The value of variable after the pre increment is " + b); //6 (++ added at the begining of the variable is called as pre-increment)
 System.out.println(++b); //7
//-- is called decrement operator ==> decrease the value of variable by 1
System.out.println(a--); //11
System.out.println("The value of variable afer the post-decrement is " + a); //10

System.out.println(--b); //6 (pre-decrement)


System.out.println("**********Assignment operators***************");
//2. Assignment operators==>these are used to assign values to variables(=, +=, -=, *=, /=, %=) 
 int c = 20;  // = is the assignment operator
 System.out.println("Intitial value of c is " + c); //20
 
 c+=10;  //i.e c =  c+10 = 30 
	System.out.println("Value of c after += is " + c); //30
	
c-=15;//30 i.e c = c-15 i.e 30-15 = 15
System.out.println("Value of c after the -= is " + c); //15
	
c*=5; //15 i.e c = c*5 i.e 15*5 =75;
System.out.println("Value of c after *= is " + c); //75

c/=	15; //75 i.e c= c/15 i.e 75/15  = 5
System.out.println("Value of c after /= is " + c); //5

c%=5; //5 i.e c=c%5 i.e 5%5 modulus is zero
System.out.println("Value of c after %= is " +  c); //0


System.out.println("**********Comparison operators***************");
//3. Comparison operators==>used to compare two values and return a boolean result (==, !=, >, <, >=, <=)
int d = 10;
int e = 20;
System.out.println(" is d equal to e " + (d==e)); //false
System.out.println(" is d is not equal to e " + (d!=e));//true
System.out.println(" is d greater than e " + (d>e)); //false
System.out.println(" is d less than e " + (d<e));//true
System.out.println(" is d greater than equal to e " + (d>=e));//false
System.out.println(" is d less than equal to e " + (d<=e)); //true


System.out.println("**********Logical operators***************");
//4. Logical operators==> used to combine multiple conditions and build logic (&& (AND), || (OR), ! (NOT) )
int f =15;
int g = 25;
int h = 30;
System.out.println((f>g)&&(g<h)); //false AND true = false 
System.out.println((f<g)&&(g<h)); // true AND true = true

System.out.println((f>g) || (g<h)); //false OR true = true 
System.out.println((f<g) || (g<h)); // true OR true = true

System.out.println(!((f>g) || (g<h))); //NOT (false OR true) = NOT (true) = false 
System.out.println(!((f>g) && (g<h))); //NOT (false AND true) = NOT (false) = true


System.out.println("**********Ternary operators***************");
//5. Ternary operator==> used to evaluate a condition and return one of two values based on the result (condition ? value 1 : value 2)
	//Syntax: Output = (condition)? value 1: value 2;
	int i =50;
	int j = 40;
	
	int max= (i>j) ? 50:40; //if i>j is true, assign i to max, else assign j to max
	System.out.println("Maximum value between i and j is " +  max);  //50
	
	int min = ( i<j) ? 50:40;
	System.out.println("Minimum value between i and j is " + min);
	
	}

}
