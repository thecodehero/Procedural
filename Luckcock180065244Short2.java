	
/* ***************************************
   AUTHOR: Timothy Luckcock
		   ***WRITE A SHORT DESCRIPTION OF WHAT YOUR MODIFIED PROGRAM DOES HERE.
		The purpose of this program is to help a floorboard salesperson quickly calculate the area of flooring material
		to order. The salespersonwill input length and width of the room in centimetres, and the the two values be multiplied	
		together to get the area of the room. This should be then converted into metres squared. An extra 10% will be added to the area	
		to allow for wastage. The final area to be ordered will be printed.
			
	      ****************************************/
import java.util.Scanner; //import scanner library

class flooringmaterial // ***THE WORD AFTER CLASS MUST BE THE NAME OF THE FILE (BEFORE the .java) YOU SAVE THIS IN
{
    public static void main (String[] param)    {			
		
		float roomArea; //variable for storing area in cm^2
		float roomArea2; //variable for storing area in m^2
		float extraArea; //variable for storing area with wastage added
		float totalArea; //variable for storing total area 
		System.out.println("Only positive integer and decimals values will be accepted. Negative values and non-numerical characters like letters and symbols will not be accepted");
		roomArea = length() * width(); //calculating area of room in cm^2
		roomArea2 = roomArea / 10000; //calculating area of room in m^2
		extraArea = roomArea2/10 ; //calculate extra area to allow for wastage
		totalArea = roomArea2 + extraArea; //calculate total area of room including wastage
		System.out.println("Your room area is " + roomArea2 + " m2"); //print area of room 
		System.out.println("The extra you need for wastage is " + extraArea + " m2."); //print extra area needed for wastage
		totalArea = totalArea * 10; //rounds total area to one decimal place. Multiply by 10
		totalArea = (int) totalArea; //Rounds result using the integer cast operator (int)
		totalArea = totalArea / 10; //Dividing the result by 10 to get rounded totalArea.		
		System.out.println("The total flooring area to order is: " + totalArea + " m2."); //print total flooring area for room
		System.exit(0);
		
    } // END main

	
	/* ***************************************
	*
	*	***PUT A COMMENT HERE TO EXPLAIN WHAT THIS METHOD IS FOR
	*/
	
    public static float length() //This method is for letting the user input the length of the room in cm
    {
	float length;	
	Scanner scanner = new Scanner(System.in);	
	System.out.println("Length of the room in (in cm)?"); //asks user to enter length of room in cm
	length = scanner.nextFloat(); //reads input and stores in variable length.	
	return length;		
    } // END lengthMethod     
	    
	public static float width() //this method is for letting user input the width of the room in cm
    {
	float width;
 	Scanner scanner = new Scanner(System.in);
        System.out.println("Width of the room (in cm)?"); //asks user to enter width of room in cm
	width = scanner.nextFloat(); //reads input and stores in variable width.
	return width;	
		
    } // END widthMethod      
} // END exercise2 template  
               // ***DONT FORGET TO CHANGE 'template' HERE TO YOUR CLASS NAME FROM THE TOP
