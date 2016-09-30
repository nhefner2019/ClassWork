import java.util.Scanner;

public class MontyHallGame
{
	public static void main (String[] args)
	{
		welcome();
		
		game();
	}
	
	public static void welcome()
	{
		System.out.println("This is the Monty Hall Game");
		System.out.println("Pick a door number first. ");
		System.out.println("You will have a chance to switch ");
		System.out.println("after a door has been revealed. ");
	}
	
	public static void game()
	{
		Scanner keyboard = new Scanner(System.in);
		int car = (int)(Math.random() * 3 + 1);
		
		//testing
		//System.out.println(car);
		
		System.out.print("Please choose a door (1, 2, or 3): ");
		int userPick = keyboard.nextInt();
		keyboard.nextLine();
		
		//testing
		System.out.println("You chose door # " + userPick);
		
		int reveal = doorToReveal(car, userPick);
		System.out.println("I just revealed that Door # " +reveal+ " has one of the goats");
		
		//asks the user if they want to switch
		System.out.print("Do you want to switch?: ");
		String answer = keyboard.nextLine();
		
		//testing
		System.out.println("Does the user want to switch?: " + answer);
		
		if(answer.equalsIgnoreCase("yes"))
		{
			userPick = doorToReveal(userPick,reveal);
		}
		
		if (car == userPick)
			System.out.println("Congratulations! You win a BRAND NEW CAR!");
		else
			System.out.println("Sorry! You get a goat.");
				
	}
	/**
	*Purpose of function: To Reveal a door that was not chosen by the user and that does not have a car
	*
	*Algorithm: With while loop, checks each door to see if it is the user's choice OR has a car, 
	*hence variables c (car) and u (user choice)
	*if i is equal to either of these, it stays in the loop
	*if i is not equal to either c or u, that is the number the function returns
	*/
	public static int doorToReveal(int c, int u)
	{
		int i = 1;
		while(i==c||i==u)
		{
			i += 1;
		}
		return i;
	}
	
	/**
	*Purpose of function: 
	*
	*
	*/
	
	public static int goatReveal1(int c, int u)
	{
		for(int i = 1; i < 4; i++)
		{
			if (i !=c && i !=u)
				return i;
		}
		return -1;
	}
}