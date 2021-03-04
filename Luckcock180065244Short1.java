/* AUTHOR Timothy Luckcock
This program demonstrates the use of concatenating strings.
ie sticking them together. This program prints my initials "TJL" down the page in block letter use the same letter to draw it out.
A blank line separates the initials.
*/

import javax.swing.*;

class initials //class name of file
{
    public static void main (String[] param)
    {		
        T();	//Calls method T
	J();	//Calls method J
	L();	//Calls method L
        System.exit(0);
		
    } // END main


	
   /* ***************************************************
      
   */
	
    public static void T() { //method for printing letter T
	System.out.println("TTTTTT");
	System.out.println("  TT  ");
	System.out.println("  TT  ");
	System.out.println("  TT  "); 
        System.out.println("");          
     } // END T
    public static void J() { //method for printing letter J
	System.out.println("JJJJJJ");
	System.out.println("   J  ");
	System.out.println("   J  ");
	System.out.println("JJJJ"); 
	System.out.println("");                  
     } // END J
public static void L() { //method for printing letter L
	System.out.println("LL");
	System.out.println("LL");
	System.out.println("LL");
	System.out.println("LLLLLLL");          
     } // END L
} // END class initials
