/* ***************************************
   AUTHOR: Timothy Luckcock
		   
		   This program gives information about underground stations saying whether they
		   have toilets and the cost.
   ****************************************/
import java.util.Scanner; //import the Scanner class
class stationinfo 
{
    public static void main (String[] param)
    {
    	String name; //Declares variable name 
		name = inputStation(); //calls method inputStation
		stationDetails(name); //calls method stationDetails
		  
		
		System.exit(0);
		
    } // END main

	
	/* ***************************************
	*
	*	***PUT A COMMENT HERE TO EXPLAIN WHAT THIS METHOD IS FOR
	*/
	
    public static String inputStation () //method to ask user for what station they want to know about. 
    {        
		String name;
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("What station do you need to know about?");
		name = scanner.nextLine();
		scanner.close();
		return name;
    } // END inputStation           
	         
		
	
    public static void stationDetails(String name)   //method for storing details of record
    {
    	Station s1 = new Station();
    	s1.name = "Stepney Green";
    	s1.isToilet = false;
    	
    	
    	Station s2 = new Station();
    	s2.name = "Kings Cross";
    	s2.isToilet = true;
    	s2.cost = 10;
    	
    	Station s3 = new Station();
    	s3.name = "Green Park";
    	s3.isToilet = true;
    	s3.cost = 30;
    	
    	Station s4 = new Station();
    	s4.name = "Oxford Circus";
    	s4.isToilet = false;    	
    	
    	if (name.equals(s1.name)) { //if name is equal to name is first row
    		if (s1.isToilet == true) {
    			System.out.println(name + " does have a toilet costing " + s1.cost + "p"); 
    		}
    		else {
    			System.out.println(name + " does not have a toilet.");
    		}
    	}
    	else if (name.equals(s2.name)) {
    		if (s2.isToilet == true) {
    			System.out.println(name + " does have a toilet costing " + s2.cost + "p"); 
    		}
    		else {
    			System.out.println(name + " does not have a toilet.");
    		}
    	}
    	else if (name.equals(s3.name)) {
    		if (s3.isToilet == true) {
    			System.out.println(name + "does have a toilet costing " + s3.cost + "p"); 
    		}
    		else {
    			System.out.println(name + " does not have a toilet.");
    		}
    	}
    	else if (name.equals(s4.name)) {
    		if (s4.isToilet == true) {
    			System.out.println(name + "does have a toilet costing " + s4.cost + "p"); 
    		}
    		else {
    			System.out.println(name + " does not have a toilet.");
    		}
    	}
    	else { //if station name is not valid
    		System.out.println("Is " + name + " a London Underground Station? Check your spelling."); //print out that station name is not valid.
    	}
		
    } // END stationDetails   
	
} // END class stationinfo
class Station {
	String name; //declare variable for name of Station	
	boolean isToilet; //declare variable for whether or not station has toilet.
	int cost; //declare variable for cost of toilet
}
               

