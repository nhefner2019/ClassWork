//import array list
import java.util.ArrayList;

/**
*This program is meant to practice the use of array Lists
*
*/
public class ArrayListEx
{
	/**
	*This is the main method that practices using array lists
	*with two functions
	*/
	public static void main(String[] args)
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		System.out.println(a.size());
		a.add(3);
		a.add(4);
		System.out.println(a.size());
		System.out.println(a);
		
		Integer i = new Integer(5);
		a.add(i);
		System.out.println(a);
		i = 6;
		System.out.println(i);
		System.out.println(a);
		a.add(0,-3);
		System.out.println(a);
		a.add(a.size()-1, 6);
		System.out.println(a);
		
		a.set(0,-2);
		
		System.out.println(a.size());
		System.out.println(a);
		
		a.remove(0);
		
		System.out.println(a.size());
		System.out.println(a);
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(2);
		arr.add(0);
		arr.add(-2);
		arr.add(4);
		arr.add(2);
		removeInt(arr,2);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("eye");
		list.add("abc");
		list.add("elephant");
		replace(list);
		
	}	
	
	/**
	*this function takes in an array list and checks if there are 
	*any occurrences of n, then removes them from the array list
	*@param a the integer array list being checked
	*@param n the integer that is compared to if there are any occurrences of it in array list a
	*/
	public static void removeInt(ArrayList<Integer> a, int n)
	{
		int counter = 0;
		while(counter < a.size())
		{
			if(n == a.get(counter))
				a.remove(counter);
			else
				counter ++;
				
		}
		System.out.println(a);
	}
	
	/**
	*This function takes in a string array list and checks if each string in the array list
	*has any occurrences of the letter e, and then replaces the e with an x
	*@param a the String array list being checked if there are any occurrences of the letter e
	*/
	public static void replace(ArrayList<String> a)
	{
		String str = "";
		String letter = "";
		String replace = "";
		for(int i = 0; i < a.size(); i++)
		{
			str = a.get(i);
			for(int j = 0; j < str.length(); j++)
			{
				letter = str.substring(j,j+1);
				if(letter.equals("e"))
					replace += "x";
				else
					replace += letter;	
			}
			a.set(i,replace);
			replace = "";
		}
		System.out.println(a);
	}
}