import java.util.Scanner;
/**
*This is a program that runs a two player tic tac toe game, with the size of the board decided by the user
*It is a two player game, where players can decide their symbols and decide where they want to place it
*by inputting a number on the board. If one of the player wins, or the game ends in a tie, a message will be printed 
*that reveals the results, and then the game ends
*@author Nate Hefner
*@version 1.0
*/
public class ticTac
{
	/**
	*Main method that calls upon all other methods, initiates the game, and asks for
	*the user’s input using scanner. Checks that each user input is valid for that situation
	*by calling upon error handling and checking if it meets the specifications (if & while)
	*/
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
	
		System.out.println("Hi! Welcome to our tic-tac-toe game. ");


		
		System.out.print("What symbol would you like player 1? ");
		String symbol1 = kb.nextLine();
		symbol1 = errorHandlingSymbols(symbol1);
	
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


		
		System.out.print("What symbol would you like player 2? ");
		String symbol2 = kb.nextLine();
		symbol2 = errorHandlingSymbols(symbol2);
		while(symbol1.equals(symbol2))
		{
			System.out.print("That symbol is already taken. Choose another: ");
			symbol2 = kb.nextLine();
		}

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


		System.out.print("How many rows to you want your board to have? "); 
		String rows = kb.nextLine();
		rows = errorHandlingRows(rows);
		int boardSize = Integer.valueOf(rows);
		
		String[][] board = initBoard(boardSize);
		printBoard(board, boardSize);
		
		int player = (int)(Math.random()*2+1);
		String symbol = "";
		
		int tie = 1;
		for(int i = 0; i < boardSize * boardSize; i++)
		{
			if(player == 1)
			{
				player = 2;
				symbol = symbol2;
			}
			
			else
			{
				player = 1;
				symbol = symbol1;
			}
				
			System.out.print("Player " + player + ", what spot would you like to fill? ");
			String spot = kb.nextLine();
			
			while(!(inRange(board,spot,boardSize)))
			{
				System.out.print("That is not a valid number on the board. Try again. ");
				spot = kb.nextLine();
			}
			
			playSymbol(board, spot, symbol, boardSize);
			printBoard(board,boardSize);
			
			if(checkAcross(board, symbol, boardSize) || checkDown(board, symbol, boardSize) || checkDiagonal(board, symbol, boardSize))
			{
				i = boardSize * boardSize;
				tie = 0;
				System.out.println("Player " + player + " won! Great job!");
			}
				
	
		}
		
		if(tie == 1)
			System.out.println("This game ended in a tie. Good game, though.");
	}
	
	/**
	*This method uses a for loop to initialized and populated a 2d String array of the 
	*inputted size for the tic tac toe game. For example, if 3 is inputted, 1 - 9 would
	*populated a 2d array (3 by 3)
	*@param int n  size of 2d string array to be initiated for the tic tac toe board
	*@return String[][] board  initialized with inputted size for tic tac toe board
	*/
	public static String[][] initBoard(int n)
	{
		String[][] board = new String[n][n];
		int num = 1;
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<n; j++)
			{
				String s = num + "";
				board[i][j] = s;
				num++;
				
			}
		
		
		}
		return board;	
	}
	
	/**
	*This method prints out the board on the screen from the 2s String array made by 
	*initBoard. Uses a for loop and a nested for loop to go through each “row” and “column”
	*in the array and print it. 
	*@param String[][] board  tic tac toe board to be printed on the screen
	*@param int n board size inputted by user
	*/
	public static void printBoard(String[][] board, int n)
	{
		int num = 0;
		int length = board[n-1][n-1].length();
		String spaces = "";
		String line = "";
		
		for(int i = 0; i < n * (length+1); i++)
			line += "-";
		System.out.println(line);
			
		for(int row = 0; row < board.length; row++)
		{
			for(int col = 0; col < board[row].length; col++)
			{
				num = board[row][col].length();
				while(num < length)
				{
					spaces += " ";
					num += 1;
				}
				System.out.print(board[row][col] + spaces + "|");
				spaces = "";
			}
			System.out.println();
			System.out.println(line);
		}
	}
	
	/**
	*This method puts the user's symbol, into the designated spot on the board that they picked.
	*uses a nested loop to find the spot inside of the 2d array, and then changes the
	*string in that spot to the users symbol
	*@param a is the 2d list holding the contents of the board
	*@param symbol is the user’s symbol who is up currently
	*@param spot is the spot the user chose to place their symbol on
	*@param boardSize is the size of the board that the game is being played on
	*/
	public static void playSymbol(String[][] a, String spot, String symbol,int boardSize)
	{
		int index = 0;
		while(index < boardSize)
		{
			int index2 = 0;
			while(index2<boardSize)
			{
				if(a[index][index2].equals(spot))
				{
					a[index][index2] =  symbol;
				}
				index2 ++;
			}
		
			index++;
		}
	}
	
	/**
	*This method checks if the player currently going has won going across the board.
	*It uses nested for loops to check if the symbol is in the spot that the loop is currently on *and then the counter increases by one depending on if it is or not. If the counter equals *the amount of rows then this method will return true but if not then it will return false
	*@param board is the current board for the game with symbols and numbers in it
	*@param symbol is the symbol the user has picked
	*@param n is the number of rows in the board
	*@return true is there is a winner by going across
	*@return false if there is no winner
	*/
	public static boolean checkAcross(String[][] board, String symbol, int n)
	{
		int counter = 0;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(board[i][j].equals(symbol))
					counter ++;
			}
			if(counter == n)
			return true;
			
			counter = 0;
			
		}
		
		return false;
	}
	
	/**
	*This method checks if the current player has won by getting n in a row going down. 
	*Uses 2 nested for loops to check the contents of the 2D array. If it finds a symbol, the counter goes up.
	*At the end, if the counter equals n, then it returns true
	*@param board the 2D array that represents the tic tac toe board and its contents
	*@param symbol the current string symbol of the player that just inputted a number on the board
	*@param n the integer that decides the size of the board. The board size will be n*n
	*@return bool value that tells if the player won going down, true if they did, false if they didn't
	*/
	public static boolean checkDown(String[][] board, String symbol, int n)
	{
		int counter = 0;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(board[j][i].equals(symbol))
					counter ++;
			}
			counter = 0;
		}
		if(counter == n)
			return true;
		else
			return false;
	}
	
	/**
	*This method checks if the current player has won by getting n in a row going down. 
	*Uses for loops to check the contents of the 2D array. If it finds a symbol, the counter goes up.
	*At the end, if the counter equals n, then it returns true
	*Has to check both diagonals, left to right and right to left
	*@param board the 2D array that represents the tic tac toe board and its contents
	*@param symbol the current string symbol of the player that just inputted a number on the board
	*@param n the integer that decides the size of the board. The board size will be n*n
	*@return true if the player won diagonally
	*@return false if there is still no winner in the game
	*/
	public static boolean checkDiagonal(String[][] board, String symbol, int n)
	{
		int counter = 0;
		for(int i = 0; i < n; i++)
		{
			if (board[i][i].equals(symbol))
				counter += 1;
		}
		if (counter == n)
			return true;
		
			
		counter = 0;
		int x = 0;
		for(int j = 0; j < n; j++)
		{
			x = ((n-1) - j);
			if (board[j][x].equals(symbol))
				counter += 1;
		}
		if(counter == n)
			return true;
		
		else
			return false;
	}
	
	/**
	*Makes sure the spot selection of each player is valid
	*Checks to make sure the spot is a number first by comparing ascii chars
	*Comparing the value of the int, makes sure the spot is no less than 1 and no greater 
	*than the board’s size
	*Makes sure the spot is not already taken by comparing to a list of spots already used
	*@param the desired user inputted location to place their symbol
	*@param the list of spots already occupied
	*@param the size of a side of the board
	*@return false if spot is invalid, true if valid
	*/
	public static boolean inRange(String[][] a, String spot, int size)
	{
		int index1 = 0;
		int s = (int) (spot.charAt(0));
		if(s<48 || s>57)
		{
			return false;
		}
		int numb = 0;
		while(index1<size)
		{
			int index2 = 0;
			while(index2<size)
			{
				if(a[index1][index2].equals(spot))
					numb = 1;
				index2++;
			}
			index1++;
		}
		if(numb!=1)
			return false;


		int userChoice = Integer.parseInt(spot);
		if (userChoice < 1 || userChoice > size * size)
			return false;
		else
			return true;
	}

	
	/**
	*Makes sure user inputted symbol has a length of 1 and makes sure it is not a number
	*Uses an if and else if statement to check both conditions
	*userSymbol.length() to check length
	*converts symbol to ascii, makes sure it is not a number based on comparing ascii chars
	*If the user’s symbol doesn’t follow the criteria, they are asked to input a different one
	*@param the user’s inputted symbol
	*@return user symbol if fits criteria, if not, the newly inputted symbol once approved
	*/
	public static String errorHandlingSymbols(String userSymbol)
	{
		Scanner kb = new Scanner(System.in);
		if (userSymbol.length() < 1)
		{
			System.out.print("Your symbol is not one character long, please re-pick:");
			String userPick = kb.nextLine();
			return errorHandlingSymbols(userPick);
		}	
		int s = (int) (userSymbol.charAt(0));
		if(userSymbol.length()>1)
		{
			System.out.print("Your symbol is not one character long, please re-pick:");
			String userPick = kb.nextLine();
			return errorHandlingSymbols(userPick);
		}
		
		else if(s>47 && s<58)
		{
			System.out.print("Your symbol cannot be a number, please re-pick:");
			String userPick1 = kb.nextLine();
			return errorHandlingSymbols(userPick1);
		}
		else	
			return userSymbol;
	}
	
	/**
	*This method makes sure that the users input of the amount of rows is a number.
	*It does it by turning userRows into the ascii value and then making sure that they
	*are in between 0 and 9 on the ascii table
	*@param userRows is the users input on the amount of rows they would like to have
	*@return userRows if it is a number or else the code will be called again
	*/
	public static String errorHandlingRows(String userRows)
	{
		Scanner kb = new Scanner(System.in);
		int index = 0;
		while(index < userRows.length())
		{
			int s = (int) (userRows.charAt(index));
			if(s<48 || s>57)
			{
				System.out.print("Please choose a number:");
				String newUserRows = kb.nextLine();
				return errorHandlingRows(newUserRows);
		
			}
			index++;
		}
		
		return userRows;
	
	}

}