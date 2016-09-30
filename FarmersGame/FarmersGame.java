/**
*
*<description project>
*@author
*
*
*/

public class FarmersGame
{
	//global scope
	public static boolean cabb;
	public static boolean sheep;
	public static boolean wolf;
	public static boolean human;
	public static void main(String[] args)
	{
		welcome();
		displayGameStatus();
	}
	
	/**
	*
	*
	*/
	public static void welcome ()
	{
		System.out.println("Farmer's Game");
	}
	
	/**
	*
	*
	*
	*/
	public static void displayGameStatus()
	{
		String bank0 = "    ";
		String bank1 = "    ";
		
		if (!cabb)
			bank0 += "C   ";
		else
			bank1 += "C   ";
			
		if (!sheep)
			bank0 += "S   ";
		else
			bank1 += "S   ";
			
		if (!wolf)
			bank0 += "W   ";
		else
			bank1 += "W   ";

		if (!human)
			bank0 += "H   ";
		else
			bank1 += "H   ";
			
		System.out.println(bank0);
		System.out.println("------------------------");
		System.out.println("\n \n \n");
		System.out.println("------------------------");	
		System.out.println(bank1);
			
		
	}
}