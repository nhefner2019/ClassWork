/**
*This program has five different functions
*One function checks to see if a string contains a digit
*The other four functions are different methods to check to see if a string is a palindrome
*@author Nate Hefner
*@version 1.0
*/
public class Exercise
{
	/**
	*This is the main method of the program
	*calls each function in the program
	*
	*/
	public static void main(String[] args)
	{
		System.out.println(hasDigit("abc23"));
		System.out.println(hasDigit("abc"));
		System.out.println("-------------------");
		System.out.println(palindromeRecursive("racecar"));
		System.out.println(palindromeRecursive("apples"));
		System.out.println("-------------------");
		System.out.println(palindromeIterative("racecar"));
		System.out.println(palindromeIterative("apples"));
		System.out.println("-------------------");
		System.out.println(noCharRecursive("racecar"));
		System.out.println(noCharRecursive("apples"));
		System.out.println("-------------------");
		System.out.println(noCharIterative("racecar"));
		System.out.println(noCharIterative("apples"));
		
	}
	/**
	*This function checks to see if a string str 
	*contains a digit using a for loop, looping through
	*and checking ascii number of each character
	*@param str the string previously inputted in the main function
	*
	*/
	public static boolean hasDigit(String str)
	{
		for(int i = 0; i < str.length(); i++)
		{
			int x = (int)str.charAt(i);
			if (x < 57 && x > 48)
			{
				return true;
			}
		
		}
		return false;
			
	}
	/**
	*This function checks a string s to see if it is a palindrome
	*using recursion, checks to see if the first and last are the same, then 2nd and 2nd to last, etc. 
	*and continues until this is not true. if it is palindrome it will return true
	*if it is not, will return false
	*@param s the string being checked if it is a palindrome
	*
	*/
	public static boolean palindromeRecursive(String s)
	{
		if(s.charAt(0) != s.charAt(s.length()-1))
		{
			return false;
		}
		else if(s.length() == 0 || s.length() == 1)
		{
			return true;
		}
		return palindromeRecursive(s.substring(1,s.length()-1));
	}
	/**
	*This function checks a string s to see if it is a palindrome
	*using an iterative for loop, looping through to 
	*check to see if the first and last are the same, then 2nd and 2nd to last, etc. 
	*and continues until this is not true. if it is a palindrome it will return true
	*if it is not, will return false
	*@param s the string being checked for a palindrome
	*
	*/
	public static boolean palindromeIterative(String s)
	{
		for(int i = 0; i < (s.length()/2); i++)
		{
			if (s.charAt(i) != s.charAt(s.length()-i-1))
			{
				return false;
			}
		}
		return true;
	}
	/**
	*Function checks to see if a string s is a palindrome 
	*using recursion without using the charAt(). 
	*It uses s.substring( , ) instead
	*@param s the string being checked for a palindrome
	*
	*/
	public static boolean noCharRecursive(String s)
	{
		if(!s.substring(0,1).equals(s.substring(s.length()-1)))
		{
			return false;
		}
		else if(s.length() == 0 || s.length() == 1)
		{
			return true;
		}
		return palindromeRecursive(s.substring(1,s.length()-1));
	}
	/**
	*Function checks to see if a string s is a palindrome 
	*using an iterative loop without using the charAt(). 
	*It uses s.substring( , ) instead
	*@param s the string being checked for a palindrome
	*
	*/
	public static boolean noCharIterative(String s)
	{
		for(int i = 0; i < (s.length()/2); i++)
		{
			if (!s.substring(i,i+1).equals(s.substring(s.length()-i-1,s.length()-i)))
			{
				return false;
			}
		}
		return true;
	}

}