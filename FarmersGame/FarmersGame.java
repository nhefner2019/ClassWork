/**
*This is the Farmer's Game
*The object of the game is to get every animal across the river safely without them eating each other
*This program uses a user input and boolean functions to move the animals
*
*@author Nate Hefner
*@version 1.0
*
*/
import java.util.Scanner;

public class FarmersGame
{
	//global scope
	public static boolean cabb;
	public static boolean sheep;
	public static boolean wolf;
	public static boolean human;
	
	/**
	*This is the main method that the java interpreter calls
	*It calls a welcome function, which welcomes the user and tells them how to play the game
	*It calls a display game function, which displays the two sides of the river for the game and the animals
	*It calls a game function, which executes the game for the user
	*
	*/
	
	public static void main(String[] args)
	{
		System.out.println();
		welcome();
		displayGameStatus();
		game();
	}
	
	/**
	*
	*This welcome function welcomes the user and tells them how to play the Farmer's Game
	*It tells them the object of the game and the scenarios in which they would lose
	*
	*/
	public static void welcome ()
	{
		System.out.println("Farmer's Game");
		System.out.println("The object of the game is to get every animal across the river safely without them eating eachother");
		System.out.println("The sheep will eat the cabbage, the wolf will eat the sheep.");
		System.out.println("Only the human can operate the boat and the human can only take one animal.");
		System.out.println("Do not leave an animal alone with something they will eat");
		System.out.println("Good luck!\n");
		
	}
	
	/**
	*This function displays the game for the user
	*It shows the two sides of the river and the animals on each side
	*If the animal's value is 0, then they will be on bank 0
	*If the animal's value is 1, then they will be on bank 1
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
	
	/**
	*This function checks to see if the user chose an animal to go to the other side, 
	*but they left two animals together in which one would eat the other
	*if this is the case, the function will return false
	*If not, it will return true
	*This function is executed using if and else statements
	*
	*/
	public static boolean lose()
	{
		if(human==cabb && sheep == wolf && human != wolf)
		{
			System.out.println("You lose. The wolf ate the sheep.");
			return false;
		}
		if(human == wolf && sheep == cabb && human != sheep)
		{	System.out.println("You lose. The sheep ate the cabbage.");
			return false;
		}
		else
			return true;
	}
	
	/**
	*This is the main function that executes most of the game
	*It takes the user input of which animal they want to move, and then changes that animal's value
	*If a wolf, sheep, or cabbage is chosen and the human is on the same side, the human will go with the chosen animal. 
	*It then calls the display game function
	*Then checks to see if all animal values are true
	*If they are, then the user wins
	*
	*/
	public static void game()
	{
		Scanner keyboard = new Scanner(System.in);
		
		while (lose() && !(cabb && wolf && sheep && human))
		{
			System.out.print("Which animal would you like to move? ");
			String animal = keyboard.nextLine();
			
			
			if(animal.equalsIgnoreCase("W") && human == wolf)
			{
				wolf = !wolf;
				human = !human;
			}
			if(animal.equalsIgnoreCase("S") && human == sheep)
			{
				sheep = !sheep;
				human = !human;
			}
			if(animal.equalsIgnoreCase("C") && human == cabb)
			{
				cabb = !cabb;
				human = !human;
			}
			if(animal.equalsIgnoreCase("H"))
			{
				human = !human;
			}
			displayGameStatus();
			if((wolf && sheep && cabb && human))
				System.out.println("You win!");
		}
	}
}