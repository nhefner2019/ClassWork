/**
*This method simulates a Monty Hall game and returns
*1 if switch win and returns 0 otherwise
*
*/

public class MontyHallSimulation
{
	public static void main(String[] args)
	{
		String input = (args[0]);
		
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
	
	public static double format(double d)
	{
		int temp = (int)(d *100);
		return temp / 100.0;
	}
	/**
	*
	**@return int return 1 if switch win, return 0 otherwise
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