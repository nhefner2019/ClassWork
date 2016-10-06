/**
*printNum function
*@author Nate Hefner
*@version 1.0
*
*/
public class printNum
{
	public static void main(String[] args)
	{
		printNumber(5);
		
	}
	/**
	*This method prints the integers form
	*0 to n both inclusive, on separate lines
	*using recursion
	*@param n the largest integer printed on screen
	*
	*/
	public static void printNumber(int n)
	{
		if(n==0)
			System.out.println(0);
		else
		{
			printNumber(n-1);
			System.out.println(n);
		}
	}
}