/**
*
*
*
*/
public class Staircase
{
	public static void main(String []args)
	{
		upsidedownLoop(4);
		rightsideupLoop(4);
	}
	
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