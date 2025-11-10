package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignemnt4 {

	public static void main(String[] args) {
//1.Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th
//		cities combined.
		//Syntax to initialize: List<Data Type> variable = new ArrayList<Data Type>();
		List <Double> cityarea = new ArrayList <Double>();
		
		cityarea.add(34394.9834); //Mumbai
		cityarea.add(4394.78); //Delhi
		cityarea.add(3738.34); //Hyderabad
		cityarea.add(4740.47); //Chennai
		cityarea.add(63854.45); //Kanpur
		cityarea.add(7349.45); //Vishakhapattanam
		
		double totalarea = cityarea.get(2) + cityarea.get(3); //here we have stored the values of 3 and 4th in variable called total area
		
	System.out.println("Total area of city 3rd and 4th is " + totalarea + " sq. km ");	
	
	//2.Create a set of the top 10 most visited tourist attractions in the world and print out all
	//of them and its size.
	
	//Syntax to initialize: Set<Data Type> variable = new HashSet<Data Type>();
	
	Set<String> attractions = new HashSet<String>();
	attractions.add("Raigad");
	attractions.add("Shivneri");
	attractions.add("Rajgad");
	attractions.add("Sindhudurg");
	attractions.add("Pratapgad");
	attractions.add("Torna");
	attractions.add("Lohagad");
	attractions.add("Sinhagad");
	attractions.add("Vijaydurg");
	attractions.add("Panhala");
	
System.out.println("Total no. attactions are " + attractions.size());
System.out.println(attractions);

//3.Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and
//6th Value.
	
	int [] numbers = {11,22,33,44,55,66,77,8,99,100};
	
	double average = (numbers[4] + numbers[5]) /2.0;
	
	System.out.println(" Average of 5th and 6th values is " + average);
	
//4. Create a list of the top 5 highest-grossing movies of all time and print out the third
//	movie on the list.	
	List<String> movies = Arrays.asList("Chatrapati","Bahubali : The Begining","Bahubali : The Conclusion","Salaar","Kalki");
	System.out.println("Third movie from the list is " + movies.get(2));
	
//Another way
	
	List<String>movie = new ArrayList <String>();
	movie.add("Pushpa: Part one");
	movie.add("Pushpa : Part two");
	movie.add("Samajavaragamana");
	movie.add("Aarya : Part one");
	movie.add("Aarya : Part one");
	
	System.out.println("Third movie from the list is " + movie.get(2));
	}

}
