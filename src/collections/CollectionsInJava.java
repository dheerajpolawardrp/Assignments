package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CollectionsInJava {
//An Array is a data structure that is going to allow us to store multiple values with similar data types together
//in the same memory location	
	public static void main(String[] args) {

String [] Empnames = new String [3];//this can hold 3 employee names	

Empnames [0] = "Bharath";
Empnames [1] = "Raja";
Empnames [2] = "Suresh";

System.out.println(Empnames.length);

/*
 Challenges with Array
1. Arrays are fixed in size.
2. Memory will be allocated at the beginning of creating the array. That means static memory allocation. 
3. Array allows similar data types only.
4. Arrays don't allow modifications.
to overcome this problem there is a use of collection framework */

/*********** Collections Framework ********/
//Advantages
//1. Collections are dynamic in size, meaning no need to declare the size at the beginning
//2. Memory will be allocated dynamically based on the data that we are going to store.
//3. Collections allow different data types within the same data structure.
//4. Collections allow modifications

//Major categories of collections that we are going to use in our day-to-day automation roles. ===> List, Set, Map
	
//List ===> ArrayList, LinkedList
//1. List can store the multiple values with similar data type together at one place by allocating the memory dynamically
//2. List follows dynamic memory allocation
//3. List allows duplicate values
//4. List allows modification

//Set ===> HashSet, LinkedHashSet, TreeSet 
//1. Set can store the multiple values with similar data type together at one place by allocating the memory dynamically
//2. Set follows dynamic memory allocation
//3. Set won't allow duplicate values
//4. Set allows modification


//Map ===> HashMap, LinkedHashMap, TreeMap, Hashtable
//1. Map can store the multiple values with different data type together (like key and value) at one place by allocating the memory dynamically
//2. Map follows dynamic memory allocation
//3. Map won't allow duplicate keys, but allows duplicate values
//4. Map allows modification	

//Difference between each sub-category of List, Set, Map is based on following three factors:
//1. Order of storing values: Insertion order, sorted/Ascending order, Random order
//2. Allocating the null values: Allowed and Not Allowed
//3. Memory Allocation Techniques: Contiguous Memory Allocation/ Non-Contiguous Memory Allocation

/************************Wrapper classes******************************/
//Collections do not allowed the primitive data type so to solve this question there is a solution wrapper classes
//so for each and every primitive data type there is a separate class to make it dynamic as well as to hold the nature of primitive data type
//so wrapper classes are used to convert primitive data type into class data types, following are the classes for each data type
//byte ----> Byte
//short ----> Short
//int ----> Integer
//long ----> Long
//float -----> Float
//double ----> Double
//char -----> Character
//boolean ----> Boolean

/********************** ArrayList*************************************/

System.out.println("******************ArrayList**************************");
//Syntax to initialize: List<Data Type> variable = new ArrayList<Data Type>();
//Syntax to add the data data: variable.add(value);
//Syntax to get the value: variable.get(index);
//Syntax to remove the value: variable.remove(index/value);
//Syntax to get the size: variable.size();
//Syntax to initialize : List <Data type> variable = new ArrayList <Data type>();   

//Nature of ArrayList:
//1. ArrayList follows insertion order
//2. ArrayList allows null values
//3. ArrayList follows contiguous memory allocation


//Store employees using the ArrayList
	List <String> empNamesArrayList = new ArrayList <String>();
	//empNamesArrayList = new LinkedList<String>();
	
	empNamesArrayList.add("Bharath");
	empNamesArrayList.add("Pooja");
	empNamesArrayList.add("Mayuri");
	empNamesArrayList.add("Tejas");
	empNamesArrayList.add("Dheeraj");
	empNamesArrayList.add("Bharath"); 
	empNamesArrayList.add("Bharath"); //Duplicate Value
	empNamesArrayList.add(null); //Null value
	empNamesArrayList.add("Binoy");
	empNamesArrayList.remove("Binoy");
	empNamesArrayList.remove(5);
	
//total no. of employees
System.out.println("Total number of employees are " + empNamesArrayList.size());
// to get the particular employee
System.out.println("Employee at the index 2 is " + empNamesArrayList.get(2));
//to print the complete employee list
System.out.println("Employee names are " + empNamesArrayList);

System.out.println("========================================================================================================");
/********************** LinkedList*************************************/

System.out.println("******************LinkedList**************************");
//Syntax to initialize: List<Data Type> variable = new LinkedList<Data Type>();
//Syntax to add the data data: variable.add(value);
//Syntax to get the value: variable.get(index);
//Syntax to remove the value: variable.remove(index/value);
//Syntax to get the size: variable.size();
//Syntax to initialize : List <Data type> variable = new LinkedList <Data type>();   

//Nature of LinkedList:
//1. LinkedList follows insertion order
//2. LinkedList allows null values
//3. LinkedList follows non-contiguous memory allocation

//Store employees using the LinkedList
List <String> empNamesLinkedList = new LinkedList <String>();
	//empNamesLinkedList = new LinkedList<String>();
	
	empNamesLinkedList.add("Bharath");
	empNamesLinkedList.add("Pooja");
	empNamesLinkedList.add("Mayuri");
	empNamesLinkedList.add("Tejas");
	empNamesLinkedList.add("Dheeraj");
	empNamesLinkedList.add("Bharath"); //Duplicate Value
	empNamesLinkedList.add(null); //Null value
	empNamesLinkedList.add("Binoy");
	empNamesLinkedList.remove("Binoy");
	
//total no. of employees
System.out.println("Total number of employees are " + empNamesLinkedList.size());
// to get the particular employee
System.out.println("Employee at the index 2 is " + empNamesLinkedList.get(2));
//to print the complete employee list
System.out.println("Employee names are " + empNamesLinkedList);


System.out.println("=========================================================================================");


/********************** HashSet*************************************/

System.out.println("******************HashSet**************************");
//Syntax to initialize: Set<Data Type> variable = new HashSet<Data Type>();
//Syntax to add the data data: variable.add(value);
//Syntax to get the value: variable.get(index);
//Syntax to remove the value: variable.remove(index/value);
//Syntax to get the size: variable.size();
//Syntax to initialize : Set <Data type> variable = new HashSet<Data type>();   

//Nature of HashSet:
//1. HashSet follows random order
//2. HashSet allows null values
//3. HashSet follows non-contiguous memory allocation

//Store employees using the HashSet
Set<String> empNamesHashSet = new HashSet<String>();
	//empNamesLinkedList = new HashSet<String>();
	
	empNamesHashSet.add("Bharath");
	empNamesHashSet.add("Pooja");
	empNamesHashSet.add("Mayuri");
	empNamesHashSet.add("Tejas");
	empNamesHashSet.add("Dheeraj");
	empNamesHashSet.add("Bharath"); //Duplicate Value
	empNamesHashSet.add(null); //Null value
	empNamesHashSet.add("Binoy");
	empNamesHashSet.remove("Binoy");
	
//total no. of employees
System.out.println("Total number of employees are " + empNamesHashSet.size());
// to get the particular employee
//System.out.println("Employee at the index 2 is " + empNamesHashSet.get(2));
//to print the complete employee list
System.out.println("Employee names are " + empNamesHashSet);


	}

}
