/* ***************************************
   AUTHOR: Timothy Luckcock		  
	   
	   This is a program that tells people the price of different kinds of snacks for a vending machine. 
	   The program display choices to the user with letters representing each and the users enters the 
	   letter next to the drink that they want. The program should know the snacks and prices of each
	   letter. If an incorrect choice is typed a message informing the user that their is nothing for that 
	   choice available should be printed. 
   ****************************************/
import java.util.Scanner; //import the scanner class
class vendingmachine { //name of class is the same as name of file.
    public static void main (String[] param)
    {				
		snackPrice(userChoice()); 		
		System.exit(0);
		
    } // END main    

	public static String userChoice() { //method for asking user for choice and returning number chosen 
    	String choice;
    	Scanner scanner = new Scanner(System.in); // create a scanner object
    	System.out.println("Choose from A: Packet of Crisps; B: Health Bar, C: Bar of Chocolate)?"); 
    	//print out possible choices
    	choice =  scanner.nextLine(); //read user input    
    	scanner.close();
    	return choice; //returns the choice chosen    	
    	}  
	
   public static void snackPrice(String choice) { //method for printing price of snack. Pass parameter choice
    	if (choice.equals("A")) { //if condition: user chooses A
    		System.out.println("A Packet of Crisps costs 1.50"); //prints price of Packet of Crisps
    	}
    	else if (choice.equals("B")) { //if condition: user chooses B
    		System.out.println("A Health Bar costs 1.20"); //prints price of Health Bar
    	}    	
    	else if (choice.equals("C")) { //if condition: user chooses C
    		System.out.println("A Bar of Chocolate costs 2.00"); //prints price of Chocolate
    	}    	
    	else { //if condition: incorrect choice is typed. 
    		System.out.println("I do not have anything for choice " + choice); //tells user that incorrect choice is typed.
    	}    	
    } // END snackPrice    
	        
} // END class vendingmachine
               // ***DONT FORGET TO CHANGE 'template' HERE TO YOUR CLASS NAME FROM THE TOP


