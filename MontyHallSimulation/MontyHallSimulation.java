import java.util.Scanner;
/**
*This method simulates a Monty Hall game and returns
*1 if switch win and returns 0 otherwise
*@author Nate Hefner
*@version 1.0
*
*/


public class MontyHallSimulation
{
	/**
	*This is the main method that the java interpreter calls
	*It simulates the Monty Hall game how many times the user wants 
	*and returns the percentages of winning a new car by 
	*switching and staying
	*
	*/
	public static void main(String[] args)
	{
		String input = args[0];
		
		int numSim = Integer.parseInt(input);
		System.out.println(numSim);
		
		int switchWin = 0;
		
		for(int i = 0; i < numSim; i++)
			switchWin += game();
			
		double percentSwitchWin = format((double) switchWin / numSim *100);
		double percentStayWin = format( 100 - percentSwitchWin);
		
		System.out.println("Percentage of switch_win: " + percentSwitchWin);
		System.out.println("Percentage of stay_win: " + percentStayWin); 
	}
	
	/**
	*This methods takes in a double and truncates all of the numbers besides the first two decimal places
	*@param d the double input to be truncated
	*@return double formatted to 2 decimal places
	*/
	
	public static double format(double d)
	{
		int temp = (int)(d *100);
		return temp / 100.0;
	}
	/**
	*
	*This function picks random ints between 1 and three for car and userPick, then sees if they are equal
	*If they are equal, that means that the stay wins
	*If they are not equal, that means the switch wins
	*/
	
	public static int game()
	{
		int car = (int) (Math.random() * 3 + 1);
		int userPick = (int) (Math.random() * 3 + 1);
		
		if (car == userPick)
			return 0;
		else
			return 1;
	}
}