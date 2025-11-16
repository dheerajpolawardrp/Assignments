package assignments;

public class Assignment6 {

	public static void main(String[] args) {
/*Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and
		marks [75, 80, 82] Add 10 marks to each students using assignment operators and
		store it into another array, after adding 10 marks identify the average marks of all
		students */		
		
	String [] studentname = {"Suresh","Mahesh","Naresh"}; 	
	int [] studentmarks =  {75, 80, 82};
	
	//to increase the value of each student by 10
	int Marks1 = studentmarks[0]+=10;
	int Marks2 = studentmarks[1]+=10;
	int  Marks3 = studentmarks[2]+=10;
	
	System.out.println(Marks1);
	System.out.println(Marks2);
	System.out.println(Marks3);
	
	int [] increasedmarks = { Marks1,Marks2,Marks3 };//stored in array
	
	double average = ((Marks1+Marks2+Marks3)/3);
	
	System.out.println("Average of the increased marks of the students is " + average);
	}

	}


