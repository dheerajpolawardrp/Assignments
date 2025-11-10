package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

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

/********************************Key-word*********************************/
//1. Hash (Randomly storing the values order wise) ---> Random order
//2. Linked (Connecting each other always follow insertion order) ---> Insertion order
//3. Tree ( Ascending order from lowsest to highest like a to z and tress won't allow null values)---sorted/ascending order

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
	//empNamesHashSet = new HashSet<String>();
	
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

/********************** TreeSet*************************************/

System.out.println("******************TreeSet**************************");
//Syntax to initialize: Set<Data Type> variable = new TreeSet<Data Type>();
//Syntax to add the data data: variable.add(value);
//Syntax to get the value: variable.get(index);
//Syntax to remove the value: variable.remove(index/value);
//Syntax to get the size: variable.size();
//Syntax to initialize : Set <Data type> variable = new HashSet<Data type>();   

//Nature of HashSet:
//1. HashSet follows sorted/ascending order
//2. HashSet does not allows null values
//3. HashSet follows contiguous memory allocation

//Store employees using the TreeSet
Set<String> empNamesTreeSet = new TreeSet<String>();
	//Set<Data Type> variable = new TreeSet<Data Type>();
	
empNamesTreeSet.add("Bharath");
empNamesTreeSet.add("Pooja");
empNamesTreeSet.add("Mayuri");
empNamesTreeSet.add("Tejas");
empNamesTreeSet.add("Dheeraj");
empNamesTreeSet.add("Bharath"); //Duplicate Value
//empNamesTreeSet.add(null); //Null value
empNamesTreeSet.add("Binoy");
empNamesTreeSet.remove("Binoy");
	
//total no. of employees
System.out.println("Total number of employees are " + empNamesTreeSet.size());
// to get the particular employee
//System.out.println("Employee at the index 2 is " + empNamesTreeSet.get(2));
//to print the complete employee list
System.out.println("Employee names are " + empNamesTreeSet);



/********************** HashMap*************************************/

System.out.println("******************HashMap**************************");
//Syntax to initialize: Map<key, value> variable = new HashMap<Key, Value>();
//Syntax to add the data data: variable.put(key, value);
//Syntax to get the value: variable.get(key);
//Syntax to remove the value: variable.remove(key);
//Syntax to get the size: variable.size();
//Syntax to initialize : Map<key, value> variable = new HashMap<Key, Value>();   

//Nature of HashMap:
//1. HashMap follows random order of keys
//2. HashMap allows null keys and null values


//Store employees using the HashMap
Map<String,Integer> EmpNamesHashMap = new HashMap<String, Integer>();
	//Map<key, value> variable = new HashMap<Key, Value>();
//Internally key is treated as 'Reference Variable only it should not be duplicate	
EmpNamesHashMap.put("Bharath",1234);
EmpNamesHashMap.put("Pooja",1235);
EmpNamesHashMap.put("Mayuri",1237);
EmpNamesHashMap.put("Tejas",1237);
EmpNamesHashMap.put("Dheeraj",1238);
EmpNamesHashMap.put("Bharath",1239); //Duplicate Value
EmpNamesHashMap.put("Archana" , null); //Null value
EmpNamesHashMap.put(null , 1240); //Null key
EmpNamesHashMap.put("Binoy",1340);
EmpNamesHashMap.remove("Binoy");
	
//total no. of employees
System.out.println("Total number of employees are " + EmpNamesHashMap.size());
// to get the particular employee
System.out.println("Employee at the index 2 is " + EmpNamesHashMap.get("Bharath"));
//to print the complete employee list
System.out.println("Employee names are " + EmpNamesHashMap);


	
/********************** LinkedHashMap*************************************/

System.out.println("******************LinkedHashMap**************************");
//Syntax to initialize: Map<key, value> variable = new LinkedHashMap<Key, Value>();
//Syntax to add the data data: variable.put(key, value);
//Syntax to get the value: variable.get(key);
//Syntax to remove the value: variable.remove(key);
//Syntax to get the size: variable.size();
//Syntax to initialize : Map<key, value> variable = new LinkedHashMap<Key, Value>();   

//Nature of LinkedHashMap:
//1. LinkedHashMap follows Insertion order of keys
//2. LinkedHashMap allows null keys and null values


//Store employees using the LinkedHashMap
Map<String,Integer> EmpNamesLinkedHashMap = new LinkedHashMap<String, Integer>();
	//Map<String,Integer> EmpNamesLinkedHashMap = new LinkedHashMap<String, Integer>();
//Internally key is treated as 'Reference Variable only it should not be duplicate	
EmpNamesLinkedHashMap.put("Bharath",1234);
EmpNamesLinkedHashMap.put("Pooja",1235);
EmpNamesLinkedHashMap.put("Mayuri",1237);
EmpNamesLinkedHashMap.put("Tejas",1237);
EmpNamesLinkedHashMap.put("Dheeraj",1238);
EmpNamesLinkedHashMap.put("Bharath",1239); //Duplicate Value
EmpNamesLinkedHashMap.put("Archana" , null); //Null value
EmpNamesLinkedHashMap.put(null , 1240); //Null key
EmpNamesLinkedHashMap.put("Binoy",1340);
EmpNamesLinkedHashMap.remove("Binoy");
	
//total no. of employees
System.out.println("Total number of employees are " + EmpNamesLinkedHashMap.size());
// to get the particular employee
System.out.println("Employee at the index 2 is " + EmpNamesLinkedHashMap.get("Bharath"));
//to print the complete employee list
System.out.println("Employee names are " + EmpNamesLinkedHashMap);	



/********************** TreeMap*************************************/

System.out.println("******************TreeMap**************************");
//Syntax to initialize: Map<key, value> variable = new TreeMap<Key, Value>();
//Syntax to add the data data: variable.put(key, value);
//Syntax to get the value: variable.get(key);
//Syntax to remove the value: variable.remove(key);
//Syntax to get the size: variable.size();
//Syntax to initialize : Map<key, value> variable = new TreeMap<Key, Value>();   

//Nature of TreeMap:
//1. TreeMap follows Insertion order of keys
//2. TreeMap allows null values but it won't allows null keys



//Store employees using the TreeMap
Map<String,Integer> EmpNamesTreeMap = new TreeMap<String, Integer>();
	//Map<String,Integer> EmpNamesTreeMap = new TreeMap<String, Integer>();
//Internally key is treated as 'Reference Variable only it should not be duplicate	
EmpNamesTreeMap.put("Bharath",1234);
EmpNamesTreeMap.put("Pooja",1235);
EmpNamesTreeMap.put("Mayuri",1237);
EmpNamesTreeMap.put("Tejas",1237);
EmpNamesTreeMap.put("Dheeraj",1238);
EmpNamesTreeMap.put("Bharath",1239); //Duplicate Value
EmpNamesTreeMap.put("Archana" , null); //Null value
//EmpNamesTreeMap.put(null , 1240); //Null key
EmpNamesTreeMap.put("Binoy",1340);
EmpNamesTreeMap.remove("Binoy");
	
//total no. of employees
System.out.println("Total number of employees are " + EmpNamesTreeMap.size());
// to get the particular employee
System.out.println("Employee at the index 2 is " + EmpNamesTreeMap.get("Bharath"));
//to print the complete employee list
System.out.println("Employee names are " + EmpNamesTreeMap);	
	
	
	
/********************** Hashtable*************************************/

System.out.println("******************Hashtable**************************");
//Syntax to initialize: Map<key, value> variable = new Hashtable<Key, Value>();
//Syntax to add the data data: variable.put(key, value);
//Syntax to get the value: variable.get(key);
//Syntax to remove the value: variable.remove(key);
//Syntax to get the size: variable.size();
//Syntax to initialize : Map<key, value> variable = new Hashtable<Key, Value>();   

//Nature of Hashtable:
//1. Hashtable follows random	
//2. Hashtable won't allow both null values and null keys



//Store employees using the Hashtable
Map<String,Integer> EmpNamesHashtable = new Hashtable<String, Integer>();
	//EmpNamesHashtable = new Hashtable<String>();
//Internally key is treated as 'Reference Variable only it should not be duplicate	
EmpNamesHashtable.put("Bharath",1234);
EmpNamesHashtable.put("Pooja",1235);
EmpNamesHashtable.put("Mayuri",1237);
EmpNamesHashtable.put("Tejas",1237);
EmpNamesHashtable.put("Dheeraj",1238);
EmpNamesHashtable.put("Bharath",1239); //Duplicate Value
//EmpNamesHashtable.put("Archana" , null); //Null value
//	EmpNamesHashtable.put(null , 1240); //Null key
EmpNamesHashtable.put("Binoy",1340);
EmpNamesHashtable.remove("Binoy");
	
//total no. of employees
System.out.println("Total number of employees are " + EmpNamesHashtable.size());
// to get the particular employee
System.out.println("Employee at the index 2 is " + EmpNamesHashtable.get("Bharath"));
//to print the complete employee list
System.out.println("Employee names are " + EmpNamesHashtable);		
	}

}
