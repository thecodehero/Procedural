/* ***************************************
   AUTHOR: Timothy Luckcock
		   The purpose of this program is to recursively pase expressions, input as strings, from the follining defined languages 
		   and calculates and prints out the answer to the calculations.			
	      ****************************************/
import java.util.*; //import java library
class recursivecalculator // ***THE WORD AFTER CLASS MUST BE THE NAME OF THE FILE (BEFORE the .java) YOU SAVE THIS IN
{
    public static void main (String[] param)
    {		
		String in = input("Please input the expression");
		int answer = evalAnswer(in);
		
		print("The answer is " + answer); //prints the answer to the recursive parsing calculation	
		System.exit(0);
		
    } // END main
	
	public static String input(String message) //method for entering input
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println(message); 
		return scanner.nextLine();
	}
	
	/* General print
   */
   public static void print(String message)
   {
      System.out.println(message);
   }
	
	public static int evalAnswer (String in)
	{
		int result;
		
		// Use the length as a simple way to decide whether its an expression or a digit
		int length = in.length();
    if (length == 1)
        result = evalDIGIT(in);
	else 
		result = evalEXP(in);

    return result;		
	}				
	
	/* digits are in hexadecimal. If they are not, they are not valid.*/
	public static int evalDIGIT(String in)
	{
		int result = -1;
		if (in.equals("0")) result = 0;
		else if (in.equals("1")) result = 1;
		else if (in.equals("2")) result = 2;
		else if (in.equals("3")) result = 3;
		else if (in.equals("4")) result = 4;
		else if (in.equals("5")) result = 5;
		else if (in.equals("6")) result = 6;
		else if (in.equals("7")) result = 7;
		else if (in.equals("8")) result = 8;
		else if (in.equals("9")) result = 9;
		else if (in.equals("A")) result = 10;
		else if (in.equals("B")) result = 11;
		else if (in.equals("C")) result = 12;
		else if (in.equals("D")) result = 13;
		else if (in.equals("E")) result = 14;
		else if (in.equals("F")) result = 15;
		else quit(); // Something wrong with the input so quit
		
		return result;
	}	
	
	//Used to check if expression is addition or calculating the sum of first n numbers.
	public static int evalEXP(String in)
	{			
		String first = nextToken(in);
		String rest = restToken(in);
		String second = nextToken(rest);
		int result = -1;
		if (first.equals("S")) 
		{			
			result = CheckSUM(rest);			
		}			
		else if(first.equals("+")) 
		{
			result = addition(0, rest);	
		}
		return result;
	}
	
	//Recursively evaluates SUM of the first n number expressions
	public static int CheckSUM(String in) 
	{		
		String first = nextToken(in);
		String rest = restToken(in);
		int result;
		int n;
		if (first.equals("+")) 
		{
			n = addition(0,rest);
			result = sumton(n);
		}
		else {			
		n = evalDIGIT(first);
		result = sumton(n);
		}
		return result;
	}	
	
	
	/* First Character of a string as a string
	*/
	public static String nextToken(String in)
	{
		return in.substring(0,1);
	}
	
	/* All but first Character of a string as a string
   */
	public static String restToken(String in)
	{
		return in.substring(1);
	}
	
	//method for adding numbers together (polish notaiton)
	public static int addition(int total, String in) 
	{				
		String first = nextToken(in);
		String rest = restToken(in);		
		int number = 0;
		if (first.equals("+"))
		{
			number = 0;
		}
		else if (first.equals("S"))
		{
			number = CheckSUM(rest);
			rest = restToken(rest);
		}
		else 
		{
			number = evalDIGIT(first);
		}				
		total = total + number;	
		int n = rest.length();
		if (n==0)
		{
			return total;
		}
		else 
		{
			return (addition(total, rest));
		}				
	}
	
	//Recursively evaluates SUM of the first n numbers expressions	
	public static int sumton(int n)	
	{	
		if (n==0)
			return 0;
		else
			return (n+ sumton(n-1));	
	}
	
	/* This just checks if the operator is the right symbol so nothing to return
	*/
	public static void checkOPERATOR (String in)
	{
		if (! (in.equals("+"))) quit();
	}
	
	// Something wrong with the input
  public static void quit()
  {
        print("What you typed isn't an expression in this language");
        System.exit(0);
   }	
} // END class recursive calculator
               
