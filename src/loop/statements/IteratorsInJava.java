package loop.statements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class IteratorsInJava {

//Iterators are default methods available in the collections. These methods are used to iterate over each and every value.
	// The Iterators interfacec provides three important methods:
//1. hasNext() ==> checks if there is any next value available in the collection.

//2. next() ==> moves the cursor to the next value and returns the value.

//3. remove() ==> removes the current value from the collection.	
	public static void main(String[] args) {

		System.out.println("************************List**************************************");

//create a list of employee names using ArrayList and iterate over each and every name using Iterator.

		List<String> names = new ArrayList<String>();
		names.add("Aaditi");
		names.add("Shivani");
		names.add("Vivek");
		names.add("Aakash");

//so now we need to print each and every value by using Iterator class
		Iterator<String> iteratorList = names.iterator();

		// to check and print the next value
		while (iteratorList.hasNext()) {
			String value = iteratorList.next();
			System.out.println(value);

			// to remove the value
			if (value.equals("Aakash")) {
				iteratorList.remove(); // removing the 'Aakash' from the list
			}
		}
		// to check whether it is removed or not
		System.out.println("After the removing the value of Aakash " + names);

		System.out.println("************************Map**************************************");
//Store values in the Map

		Map<Integer, String> emp = new HashMap<Integer, String>();
		emp.put(1, "Bharath");
		emp.put(2, "Tejas");
		emp.put(3, "Mayuri");
		emp.put(4, "Pooja");

		// so print all the values in the Map

		Iterator<String> empnames = emp.values().iterator();
		while (empnames.hasNext()) {

			String empvalues = empnames.next();
			System.out.println(empvalues);

			if (empvalues.equals("Bharath")) {
				empnames.remove();
			}
		}

		System.out.println(" After removing the values of Bharath " + emp);

//to print all the keys
		Iterator<Integer> key = emp.keySet().iterator();

//to check and print the key/value always use while loop to check and if to print next value/key

		while (key.hasNext()) {
			Integer keyvalue = key.next();
			System.out.println(keyvalue);

			// to remove the key
			if (keyvalue.equals(2)) {
				key.remove();
			}
		}
//to check that key is removed from the collection		
		System.out.println("After the removing the key " + emp);

	}

}
