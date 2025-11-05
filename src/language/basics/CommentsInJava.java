package language.basics;

public class CommentsInJava {

//1.Single-line comments. ====> Single line comments always starts with forward slash ===>  //
//shortcut ===> cntrl + / (for comment and uncomment) 	
	
//2.Multi-line comments. ====> /* ------ */
//shortcut ===> cntrl + shift + / ( for comment) and for uncomment 	cntrl + shift + \
	
//3.Documentation comments. ===> comments we are need to write to generate documentation ===> /** --- */
//shortcut ====> alt + shift + J
	
/* 
This line refers to main method.
This is always going to act like a starting point for java execution.
If there is no main method, we cannot execute any program.	
Then, we need to write all the instructions inside the main method only. 
*/
	
	/**
     * The {@code main} method serves as the entry point for any Java application.
     * <p>
     * It is the first method that the Java Virtual Machine (JVM) invokes when a program starts.
     * Every Java class that is intended to be run as a standalone application must contain a
     * {@code main} method with the exact signature {@code public static void main(String[] args)}.
     * </p>
     *
     * <h3>Method Signature Explanation:</h3>
     * <ul>
     *   <li><b>public</b> – The method is accessible from anywhere, allowing the JVM to call it from outside the class.</li>
     *   <li><b>static</b> – The method can be called without creating an instance of the class.</li>
     *   <li><b>void</b> – The method does not return any value to the JVM.</li>
     *   <li><b>main</b> – The predefined name recognized by the JVM as the starting point of the program.</li>
     *   <li><b>String[] args</b> – An array of command-line arguments passed to the program at runtime.</li>
     * </ul>
     *
     * <h3>Functionality:</h3>
     * <p>
     * This implementation simply prints the message <b>"Hello Word"</b> to the console.
     * </p>
     *
     * @param args an array of {@code String} arguments passed to the program from the command line.
     * @return This method has no return value since its return type is {@code void}.
     * @version 1.0
     * @author Dheeraj Polawar
     */	
	public static void main(String[] args) {
		System.out.println("Hello World..!");
		

	}

}
