	package assignments;
	
	import java.util.HashMap;
	import java.util.Map;
import java.util.Map.Entry;
	
	public class Assignment10NewClass {
	
		public static void main(String[] args) {
			
			String[] namesemp = { "Alice Johnson","Bob Smith","Carol Davis","David Brown","Eva Green"};
	
			Assignments10CommonMethods a10 = new Assignments10CommonMethods();
	
			 double emp1 = a10.emplooyeeHike("Alice Johnson", 75000.0, 15, 1500, 5000);
	
			double emp2 = a10.emplooyeeHike("Bob Smith", 82000.0, 10, 1200, 0);
	
			double emp3 = a10.emplooyeeHike("Carol Davis", 82000.0, 15, 1500, 5000);
	
		double emp4 = 	a10.emplooyeeHike("David Brown", 90000.0, 15, 300, 5000);
	
			double emp5 = a10.emplooyeeHike("Eva Green", 60000.0, 15, 1200, 0);
			
			Map <String, Double> emphike = new HashMap<>();
			
			emphike.put(namesemp[0], emp1);
			emphike.put(namesemp[1], emp2);
			emphike.put(namesemp[2], emp3);
			emphike.put(namesemp[3], emp4);
			emphike.put(namesemp[4], emp5);
			
			for ( Entry<String, Double> finaloutput :emphike.entrySet() ) {
				
				//System.out.println("Final percentage hike for the employee " + finaloutput.getKey() + " is " + finaloutput.getValue());
			}
		}
	
	}
