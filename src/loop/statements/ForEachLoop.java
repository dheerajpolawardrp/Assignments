package loop.statements;

import java.util.HashSet;
import java.util.Set;

public class ForEachLoop {
//for-each loop ==> enhanced for loop ==> Repeat the execution for each and every value of predefined  list.
	/*
	 * Syntax for-each loop is:
	 * 
	 * for(datatype variableName : Array/List/set) { //code to executed }
	 */
	public static void main(String[] args) {

		String[] empnames = new String[3];
		empnames[0] = "Pooja";
		empnames[1] = "Mayuri";
		empnames[2] = "Tejas";

//pre-defined list means any collection of data		
		/// Print each value using for-each loop
		for (String names : empnames) {

			System.out.println(names);
		}

		System.out.println("*************************************************************");
		System.out.println(empnames);
		System.out.println(empnames.length);

		System.out.println("*************************************************************");

//Print each value using for loop

		for (int i = 0; i < empnames.length; i++) {
			System.out.println(empnames[i]);
		}

		// for-each loop with HashSet
		Set<String> emphashSet = new HashSet<String>();

		emphashSet.add("Java");
		emphashSet.add("Javascript");
		emphashSet.add("Nodejs");
		emphashSet.add("Reactjs");
		emphashSet.add("Angular");

		System.out.println("*********************************************");
		for (String language : emphashSet) {

			System.out.println(language);
		}

		System.out.println("***************************************");

//for-each loop with HashSet

		Set<Integer> number = new HashSet<Integer>();
		number.add(10);
		number.add(11);
		number.add(12);
		number.add(13);
		number.add(14);

		for (Integer id : number) {

			System.out.println(id);
		}

	}

}