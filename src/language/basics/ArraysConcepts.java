package language.basics;

public class ArraysConcepts {

//Arrays are used to store multiple values of same data type in single variable	
//Array can store the multiple values with the similar data type at the same place	
	
	public static void main(String[] args) {
/*
 Storing data in Array
 1. When we know the values before itself
 
 		Data-type 	variable = data;
 		String [] employeename  = {"Pooja","Mayuri","Tejas","Dheeraj"};	
 		
 2. When we don't know the values but we know the size of an array	
 		int [] empid = new int [3];
 		empid [0] = 1;
 		empid [1] = 2;
 		empid [2] = 3;
 		
 */
		/*
		Multi dimensional array: array in arary
		
String project1 = {"Pooja","Mayuri","Tejas","Dheeraj"};	
String project2 = {"Saurabh" ,"Durga","Mayur","Asha"};	
1. When we know the values before itself
String porjects [] [] {{"Pooja","Mayuri","Tejas","Dheeraj"},{"Saurabh" ,"Durga","Mayur","Asha"}};
		
2.When we don't know the values but we know the size of an array

	 String [] [] projects = new String [2] [3]; 
	 projects[0][0] = "Pooja";
	 projects[1][3] = "Asha";
	 	 */
//3D Array
//Two organizations. In each organization, three projects,four employees are working
//Company 1 (0)
//(0)//Project 1: Vishal(0), Mayur(1), Anaji(2),Shruti(3)
//(1)//Project 2: Onkar, swapnil, Dheeraj,Pooja		
//(2)//Project 3: Saurabh, Mayuri, Durga,Maya
		
//Company 2 (1)
//Project 1 : Tejas,Sonali,Sheetal,Vaishnavi
//Project 2: Apurva, Samruddhi, Bhavana,Tejal
//Project 3: Priyanka, Asha, Siddhesh,Vishakha	
		
String [][][] empdata = new String [2][3][4];		
empdata[0][1][3] = "Pooja";	
empdata[0][1][2] = "Dheeraj";
	
	System.out.println(empdata[0][1][3]);
	System.out.println(empdata[0][1][2]);
	}

}
