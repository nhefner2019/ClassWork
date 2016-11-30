/**
*This program practices using 2D arrays using methods that create the arrays
*and print them out nicely
*@author Nate Hefner
*@version 1.0
*/
public class TwoDArrayPractice
{
	/**
	*This is the main method of the program.
	*initializes 2D arrays, creates a 2D array from 1 to 16 using create2d method, and tests the param2D method with a parameter
	*uses printArray and printNice methods to print 2D int arrays nicely
	*/
	public static void main(String[] args)
	{
		int[][] arr = new int[3][4];
		printArray(arr);
		
		String[][] arr1 = new String[3][3];
		printArray1(arr1);
		
		int[][] a = create2D();
		printArray(a);
		
		int[][] ar = param2D(10);
		printNice(ar, 10);
		
	}
	
	/**
	*This method prints an 2D int array nicely, instead of printing a memory address of the array. 
	*uses nested for loops to print each row and column of array with each number
	*@param a the 2D int array that is being printed
	*
	*/
	public static void printArray(int[][] a)
	{	
		for(int row = 0; row < a.length; row++)
		{
			for(int col = 0; col < a[row].length; col++)
			{
				System.out.print(a[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	/**
	*This method prints an 2D String array nicely, instead of printing a memory address of the array. 
	*uses nested for loops to print each row and column of array with each String
	*@param a the 2D String array that is being printed
	*/
	public static void printArray1(String[][] a)
	{	
		for(int row = 0; row < a.length; row++)
		{
			for(int col = 0; col < a[row].length; col++)
			{
				System.out.print(a[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	/**
	*creates a 2D array that is numbered 1 through 16, with 4 numbers in each row
	*uses parameter num to keep track of the numbers being put in the 2D array a
	*uses nested loop to execute creating the 2D array
	*@return a the 2D int array created
	*/
	public static int[][] create2D()
	{
		int num = 1; 
		int[][] a = new int [4][4];
		for(int row = 0; row < 4; row++)
		{
			for(int col = 0; col < 4; col++)
			{
				a[row][col] = num;
				num++;
			}
		}
		
		return a;
	}
	
	/**
	*creates a 2D array using the int parameter n
	*the array is numbered 1 to n*n, with n numbers in each row
	*uses nested loop to make 2D array
	*@param n the integer that dictates the size of the 2D array a
	*@return a the 2D int array created based on int n
	*/
	public static int[][] param2D(int n)
	{
		int num = 1; 
		int[][] a = new int [n][n];
		for(int row = 0; row < n; row++)
		{
			for(int col = 0; col < n; col++)
			{
				a[row][col] = num;
				num++;
			}
		}
		
		return a;
	}
	
	/**
	*prints a 2D int array nicely, dividing each number with a '|'
	*and divides each row with a line of dashes. Uses a helper function numDigits
	*to help determine how many digits each number has, and then, using this info, 
	*decides how many spaces will go after the number being printed before a '|' is printed
	*@param a the 2D int array being printed nicely
	*@param n the integer that decided the size of the 2D int array
	*
	*/
	public static void printNice(int[][] a, int n)
	{	
		int num = 0;
		int maxDigit = numDigits(n*n);
		String spaces = "";
		String line = "";
		
		for(int i = 0; i < n * (maxDigit+1); i++)
			line += "-";
		System.out.println(line);
			
		for(int row = 0; row < a.length; row++)
		{
			for(int col = 0; col < a[row].length; col++)
			{
				num = numDigits(a[row][col]);
				while(num < maxDigit)
				{
					spaces += " ";
					num += 1;
				}
				System.out.print(a[row][col] + spaces + "|");
				spaces = "";
			}
			System.out.println();
			System.out.println(line);
		}
		

	}
	
	/**
	*this function takes in an int n and returns how many
	*digits n has
	*@param n the integer being tested to see how many digits it has
	*@return count - the integer of how many digits a number has
	*/
	public static int numDigits(int n)
	{
		int count = 1;
		while(n > 9)
		{
			n = n/10;
			count ++;
		}
		return count;
	}
}