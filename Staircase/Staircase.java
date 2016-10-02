/**
*This program prints stars in the format of an upside down staircase
*and a right-side up staircase using a predetermined variable n
*to decide how many stars there will be
*@author Nate Hefner
*@version 1.0
*
*/
public class Staircase
{
	/**
	*This is the main method the java interpreter calls
	*It calls two functions needed to run the program
	*
	*/
	public static void main(String []args)
	{
		upsidedownLoop(4);
		rightsideupLoop(4);
	}
	/**
	*Purpose of function: To print an upside down staircase of stars 
	*
	*Algorithm: This function uses a nested for loop
	*Loops through the first then second loop, and prints however many
	*stars needed on the top. Then looping through again, it will print one less
	*because value of counter is subtracted by 1
	*
	*/
	public static void upsidedownLoop(int n)
	{
		int counter = n;
		for(int i = 0; i < counter;)
 		{
 			for(int j = 0; j < counter; j++)
 			{
 				System.out.print("*");
 				
 			}
 			System.out.println();
 			counter -= 1;
 		}
	}
	/**
	*Purpose of function: To print a rightside up staircase of stars
	*
	*Algorithm: Uses nested for loops, checks to see if y is less than or equal to x, then prints *
	*then increments x. Repeats this until x is greater than n
	*
	*
	*/
	public static void rightsideupLoop(int n)
	{
		for(int x = 1; x <= n; x++)
		{
			for(int y = 1; y <= x; y++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}