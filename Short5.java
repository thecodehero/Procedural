	
/* ***************************************
   AUTHOR: Timothy Luckcock		   
		This program uses a for loop to print versions of the 10 in the bed rhyme, but for an initial number in the bed
		given by the user. The program is split into methods. 
			
	      ****************************************/
import java.util.Scanner; //import scanner library

class ninthebed // name of class is same as the name of the file
{
    public static void main (String[] param)
    {		
		int bednumber = numberBed();
		for (int i = bednumber; i > 0; i--) 
		{   //for loops which starts from number inputted by user of initials number in bed. 
		currentnumberBed(i);  //calls the procedure currentnumberBed passing the current bed number as the parameter
		}	
		System.exit(0);
		
    } // END main	
	
    public static int numberBed() //method for asking and returning number in the bed to start with.
    {
	Scanner scanner = new Scanner(System.in);
	System.out.println("How many are there in the bed?");
	int bednumber = scanner.nextInt();	
	scanner.close();
	return bednumber;	
    } // END numberBed            

	
    public static void currentnumberBed(int i) 	 //method takes the currnent number in the bed as argument and prints a single verse.
	{
	if (i > 1)
	{
		System.out.println("They were " + i + " in the bed and the little one said.");
		System.out.println("Roll over, Roll Over");
		System.out.println("So they all rolled over and one fell out");				
	}
	else {
		System.out.println("There was 1 in the bed and the little one said.");	
		System.out.println("Good night");
	}	       
		
    } // END currentnumberBed
	
} // END class ninthebed 
               
