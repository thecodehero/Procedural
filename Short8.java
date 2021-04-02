	
/* ***************************************
   AUTHOR: Timothy Luckcock
		This is a program that stores information about different cars in a salesroom giving make and whether that make is electric or not.
		A new type ocalled Car can be created (a record type) and each separate piece of information about a car should be store in a separate
		field.  			
	      ****************************************/
import java.util.Scanner; //import scanner library

class carsales
{
	public static void main (String[] param)
	{
		String userChoice = inputString("What car do you need to know about?"); //asks user to enter what car they need to know about
		carRecord(userChoice);	//calls function carRecord
		System.exit(0);		
   	 } // END main	
	
	public static String inputString(String message) {  //function for inputting values
    		Scanner scanner = new Scanner(System.in); //create scanner object
		System.out.println(message); //message to tell user to enter an input
		String answer = scanner.nextLine(); //reads input entered by user		
		scanner.close(); //close scanner	
		return answer;	//return value
    	} // END inputString 

	public static void carRecord(String choice) { //declares initialisation method for creating records.
	
	Car c1 = new Car(); //create records for each car model. 
	c1.carMake = "Triumph";
	c1.electric = "NOT electric";

	Car c2 = new Car();
	c2.carMake = "Focus";	
	c2.electric = "NOT electric";
	
	Car c3 = new Car();
	c3.carMake = "Mini E";
	c3.electric = "electric";

	if (choice.equals(getcarMake(c1))) 
		{
		System.out.println("The " + getcarMake(c1) +  " is " + getElectric(c1));	
		} 
	else if(choice.equals(getcarMake(c2))) 
		{
		System.out.println("The " + getcarMake(c2) +  " is " + getElectric(c2));
		}
	else if(choice.equals(getcarMake(c3)))
		{
		System.out.println("The " + getcarMake(c3) +  " is " + getElectric(c3));
		}		
	else 
		{
		System.out.println("I do not know that make");
		}		
	} 
	public static String getcarMake(Car c) { //declare function for car makes
		return c.carMake;
	}
	public static String getElectric(Car c) { //declare function for returning whether car is electric or not.
		return c.electric;
	}
	
} // END class carsales
    
class Car { 
	String carMake; //declares field for car make of record.
	String electric; //declares field for whether or not car is electric. 	
} //END class carDetails



