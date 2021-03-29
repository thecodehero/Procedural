	
/* ***************************************
   AUTHOR: Timothy Luckcock
		The purpose of this program is to count how many buses arrive at a particular bus stop. It should use a while loop 
		to repeatedly ask for the user to name the number of the bus that just passed. It should stop when the special code
		is entered, and give the number of buses seen and the how late the latest bus is. 			
	      ****************************************/
import java.util.Scanner; //import scanner library

class buscount // the word after class is the same as the name of the file "buscount"
{
    public static void main (String[] param) //main method  
{ 
		
		int buspass; //declares variable for storing bus number that passed. 
		int buscount = 0; //declares variable for storing how many buses arrive at a particular bus stop. 
		int minslate; //declare variable for storing value for how late bus entered by user was
		int latestmin = 0; //declare variable for storing how late the latest bus was.
		int latestbus = 0; //declare variable for storing number of the latest bus.	
		Scanner scanner = new Scanner(System.in); //create scanner object
		do { 
			System.out.println("Which bus just passed?"); //asks the user what bus just passed.
			buspass = scanner.nextInt(); //reads input from user.	
			if (buspass == 0) { 
				break; //leaves loop.
			}
			buscount = buscount + 1; //increments number of buses that passed by 1			  		
			System.out.println("How many minutes late was it?"); //asks the user how many minutes late the bus was.
			minslate = scanner.nextInt(); //reads input from user.
			if (minslate >= latestmin) { //execute code below if current minutes late entered is the greater than all other current minutes late entered.
				latestmin = minslate; //assigns the number of minutes late to the variable for storing minutes late for latest bus. 
				latestbus = buspass; //stores bus number of latest bus in variable latestbus. 						
			}}
		while (buspass != 0); //loop while buscount is not equal to zero. 
		System.out.println(buscount + " buses passed. The most delayed bus was " + latestmin + " minutes late on route " + latestbus + "."); /* print out the number of buses that passed
		the worst delay seen so far and its number. */ 	
		scanner.close(); //closes scanner. 
		
		System.exit(0);
		
    } // END main 
	
} // END class buscount 
  
