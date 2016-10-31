/**
*
*
*@author Nate Hefner
*@version 1.0
*
*/
public class Index
{

	public static void main(String[] args)
	{
		System.out.println(findString("racecar","car",0));
		System.out.println(findString("abcabcdabc","abc",2));
		System.out.println(findString("abcd","ef",1));
		
		System.out.println("----------------------");
		System.out.println(countStrings("racecar","car"));
		System.out.println(countStrings("abcabcdabc","abc"));
		System.out.println(countStrings("abcd","ef"));
		System.out.println("----------------------");
		System.out.println(convertItalics("This is _very_ good."));
		System.out.println(convertItalics("This is very_ good."));
		
	}
	/**
	 * Finds the first instance of s in line,
	 * starting at the position start
	 * @param o the orignal string 
	 * @param s the string to find 
	 * @param start the position to start searching.
	 * Guaranteed to be in the string line. (precondition)
	 * @return the index of the first single instance of
	 * s if the string is found OR -1 if it is not found.
	 */
	public static int findString(String o, String s, int start)
	{
		String n = o.substring(start);
		int first = n.indexOf(s);
		if(first == -1)
			return -1;
		else
			first += start;
			return first;
	}
	/**
	 * Count the number of times instances of s appear in
	 * the line.
	 * @param o the original string
	 * @param s the string to find.
	 * @return the number of times the string appears in the line
	 */
	public static int countStrings(String o, String s)
	{
		int total = 0;
		int i = findString(o,s,0);
		while(i!= -1)
		{
			o = o.substring(0,i) + o.substring(i+s.length());
			i = findString(o,s,0);
			total += 1;
		}
		return total;
	}
	/**
	 * Replace all instances of underscores in the line given by
	 * line with italics tags.  There must be an even number of underscores
	 * in the line, and they will be replaced by <I>, </I>, alternating.
	 * @param line a string with 0 or more underscores
	 * @return the line that has underscores replaced with <I> </I> tags or 
	 * the original line if there are not an even number of underscores.
	 */
  	public static String convertItalics(String line)
  	{  
  		int u = countStrings(line, "_");
  		String[] a = new String[line.length()];
  		int counter = 0;
  		if(u%2 != 0)
  		{
  			return line;
  		}
  		else
  		{
  			for(int i = 0; i < line.length(); i++)
  			{
  				a[i] = line.substring(i,i+1);
  			}
  			
  			for(int j = 0; j < line.length(); j++)
  			{
  				if(line.substring(j,j+1).equals("_"))
  				{
  					if(counter%2==0)
					a[j] = "<I>";
				
				
					else
				
						a[j] = "</I>";
					
					counter+=1;
  				}
  			}
  		String convert = "";
		for(int x = 0; x<line.length(); x++)
			convert+= a[x];
		
		return convert;
  		}	
  	}
}