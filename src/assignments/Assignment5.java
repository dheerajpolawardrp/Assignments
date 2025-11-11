package assignments;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Assignment5 {

	public static void main(String[] args) {
	
//Students Table
//First we are creating a map for each row
		
	Map <String , String> row1 = new LinkedHashMap <>();
	row1.put("Name", "John Doe");
	row1.put("Age", "Twenty");
	row1.put("Gender", "Male");
	row1.put("Roll Number", "SBA12345");
	row1.put("Grade", "A++");
	row1.put("Major", "Computer Science");
	row1.put("GPA", "A3.8");
	row1.put("Email", "john@example.com");
	row1.put("PAN Number", "SDF6543210");
	row1.put("Address", "123 Elm St");
	
	Map <String , String> row2 = new LinkedHashMap < >();
	row2.put("Name", "Jane Smith");
	row2.put("Age", "Twenty One");
	row2.put("Gender", "Female");
	row2.put("Roll Number", "SBA12346");
	row2.put("Grade", "B+");
	row2.put("Major", "Mathematics");
	row2.put("GPA", "A3.5");
	row2.put("Email", "jane@example.com");
	row2.put("PAN Number", "REW6543211");
	row2.put("Address", "456 Oak St");
	
	Map <String , String> row3 = new LinkedHashMap <>();
	row3.put("Name", "Mike Brown");
	row3.put("Age", "Twenty Two");
	row3.put("Gender", "Male");
	row3.put("Roll Number", "SBA12347");
	row3.put("Grade", "A+");
	row3.put("Major", "Physics");
	row3.put("GPA", "A3.9");
	row3.put("Email", "mike@example.com");
	row3.put("PAN Number", "TYR6543212");
	row3.put("Address", "789 Pine St");
	
//Now we are accumulating all the rows into a single table
	List<Map <String, String>> studentstable = new ArrayList<>();
	  studentstable.add(row1);
	  studentstable.add(row2);
	  studentstable.add(row3);
	
	//Employee details Table
	//First we are creating a map for each row
	  Map <String , String> row4 = new LinkedHashMap < >();
		row4.put("Employee ID", "E001");
		row4.put("Name", "Alice Green");
		row4.put("Age", "Thirty");
		row4.put("Gender", "Female");
		row4.put("Department", "Engineering");
		row4.put("Position", "Software Engineer");
		row4.put("Salary", "75K Pounds");
		row4.put("Email", "alice@example.com");
		row4.put("PAN Number", "SDF6543210");
		
		Map <String , String> row5 = new LinkedHashMap < >();
		row5.put("Employee ID", "E002");
		row5.put("Name", "Bob Johnson");
		row5.put("Age", "Thirty Five");
		row5.put("Gender", "Male");
		row5.put("Department", "Marketing");
		row5.put("Position", "Marketing Manager");
		row5.put("Salary", "85K Pounds");
		row5.put("Email", "bob@example.com");
		row5.put("PAN Number", "REW6543211");
		
		Map <String , String> row6 = new LinkedHashMap < >();
		row6.put("Employee ID", "E003");
		row6.put("Name", "Carol White");
		row6.put("Age", "Twenty Eight");
		row6.put("Gender", "Female");
		row6.put("Department", "Sales");
		row6.put("Position", "Sales Executive");
		row6.put("Salary", "65K Pounds");
		row6.put("Email", "carol@example.com");
		row6.put("PAN Number", "TYR6543212");
		
	//Now we are accumulating all the rows into a single table
		List<Map <String, String>> Employeedetails = new ArrayList<>();
		Employeedetails.add(row4);
		Employeedetails.add(row5);
		Employeedetails.add(row6);	  
		
		
////product details Table
		//First we are creating a map for each row		
		
	Map <String, String> row7 = new LinkedHashMap<>();
	   row7.put("Product ID", "P001");
	   row7.put("Name", "Laptop");
	   row7.put("Category", "Electronics");
	   row7.put("Price", "12K Pounds");
	   row7.put("Stock Quantity", "Not Available");
	   row7.put("Supplier", "Tech Supplies");
	   row7.put("Warranty", "2 years");
	   row7.put("Rating", "4.5 Stars");
	   row7.put("Manufacturing Date", "Aug 2023");
	   row7.put("Expiry Date", "Aug 2028");
	   
	   Map <String, String> row8 = new LinkedHashMap<>();
	   row8.put("Product ID", "P002");
	   row8.put("Name", "Desk Chair");
	   row8.put("Category", "Furniture");
	   row8.put("Price", "150K Pounds");
	   row8.put("Stock Quantity", "Two");
	   row8.put("Supplier", "Office Depot");
	   row8.put("Warranty", "1 year");
	   row8.put("Rating", "4 Stars");
	   row8.put("Manufacturing Date", "Sep 2024");
	   row8.put("Expiry Date", "N/A");
	      
	   Map <String, String> row9 = new LinkedHashMap<>();
	   row9.put("Product ID", "P001");
	   row9.put("Name", "Coffee Maker");
	   row9.put("Category", "Kitchen");
	   row9.put("Price", "75 Pounds");
	   row9.put("Stock Quantity", "Two Hundred");
	   row9.put("Supplier", "KitchenWorld");
	   row9.put("Warranty", "6 months");
	   row9.put("Rating", "4.2 Stars");
	   row9.put("Manufacturing Date", "Jan 2025");
	   row9.put("Expiry Date", "Jan 2027");
	   
//Accumulating all the rows into the single table:
	   List<Map<String, String>> productdetailstable = new ArrayList<>();
	   productdetailstable.add(row7);
	   productdetailstable.add(row8);
	   productdetailstable.add(row9);
	   
	   
//Now we are collecting all the tables together
	   
	   Map<String, List<Map<String, String>>> alltables = new LinkedHashMap<>();
	   alltables.put("StudentDetailsTable", studentstable);
	   alltables.put("EmployeeDetailsTable", Employeedetails);
	   alltables.put("ProductDetailsTable", productdetailstable);
	   
	   
//so to get the details from the product we need to fetch this from tables and store into the variable	   
	
	//Map<String<List<Map<String, String>>>> products = alltables.get("productdetailstable").get(1).get("Supplier");
	System.out.println(alltables.get("ProductDetailsTable").get(1).get("Supplier")); //Getting null value
	}

}
