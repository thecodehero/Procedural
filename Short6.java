	
/* ***************************************
   AUTHOR: Timothy Luckcock 
		Short Exercise 6: This program use a for loop to input 5 films and ask the user to say how much each has made so far
		at the box office (in millions of pounds). This comma separated format is suitable for input to a spreadsheet program.
		It should finally give the total amount all 5 films have taken. 			
	      ****************************************/
import java.util.Scanner; //import scanner library

class filmprofit // ***THE WORD AFTER CLASS MUST BE THE NAME OF THE FILE (BEFORE the .java) YOU SAVE THIS IN
{
	static final int norfilm = 5;
   	public static void main (String[] param)
    	{
		
		String[] film = {"","","","",""}; //declare array for films
		int[] boxoffice = {1,2,3,4,5}; //declare array for boxoffice.
		System.out.println("You need to enter " + norfilm + " films");
		
		String filmname; //declare variable filmname		
		int filmamount; //declare variable for storing amount made in millions of pounds for film		
		for (int i = 0; i < 5; i++) //for loop for inputting 5 films
		{			
			filmname = input("Film: "); // calls function inputfilm() and stores returned value in variable filmname
			film[i] = filmname; //store name of film in array.	
			filmamount = inputInt("How much money did " + filmname + " take in millions of pounds?"); //calls function filmgross and stores returned value in variable filmamount
			boxoffice[i] = filmamount; //stores money made in millions for film in array.		
		}	
			
		System.out.println("The films and the amount they made are:");
		int total = 0; //declares variable total for storing total box office amount of the 5 films.  
		for (int j = 0; j < 5; j++) 
		{
		System.out.println(film[j] + ", " + boxoffice[j] + "000000"); //prints out film name with its corresponding amount in millions of pounds made at the box office.
		total = total + boxoffice[j]; //adds all the box office amounts of the 5 films together to get a total.
		}		
		System.out.println("Together these " + norfilm + " films took " + total + " million pounds at the box office."); 
				
		System.exit(0);
		
    	} // END main	
	
    	public static String input(String message)      
	{ //function for entering input 
		Scanner scanner = new Scanner(System.in); //creates scanner object.		
		System.out.println(message); //prints message asking user to enter film					
		return scanner.nextLine(); //returns film name entered by user						
    	} // END input   

	public static int inputInt(String message)
	{
		return Integer.parseInt(input(message));
	} //End inputInt      
	         
} // END class filmprofit 
              
