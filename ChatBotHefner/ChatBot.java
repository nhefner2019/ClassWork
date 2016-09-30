import java.util.Scanner;

/**
 *This is the class for the chatbot. It uses the main method.
 *@author Nate Hefner
 *@version 1.0
 */
 public class ChatBot
 {	
 	/**
 	 *This is the main method that the java interpreter calls
 	 *@param args This is a command line argument
 	 */
 	 public static void main (String[] args)
 	 {
 	 	int z = 0;
 	 	while (z == 0)
		{	//create/construct a Scanner object do
			Scanner x = new Scanner(System.in);//system.in means input from the keyboard
			//x is the name of the scanner
			System.out.print("Please enter your name: ");
			String name = x.nextLine();//goes to the next newline in your buffer and returns it
			if (name.equalsIgnoreCase("Bye"))
			{
				z = 1;
			}
			else
			{
				System.out.print("Hi " + name + "!. How are you doing today?: ");
				String input = x.nextLine(); //recycling input, you do not want to redefine 'String', nextLine includes newLine character
				if (input.equalsIgnoreCase("Bye"))
				{
					z = 1;
				}
				else
				{
					System.out.println("Your answer is " + "'" + input + "'");
					System.out.print("How old are you?: ");
					String age = x.nextLine();
					if (age.equalsIgnoreCase("Bye"))
					{
						z = 1;
					}
					else
					{	
						String stringAge = age;
						int intAge = Integer.parseInt(stringAge);
						if(intAge > 40) 	 	
						{
							System.out.println(name + ", you are old!");
						}
						else
						{
							System.out.println(name +", you are young!");
						}
						System.out.print("How tall are you: ");
						String height = x.nextLine();
						if (height.equalsIgnoreCase("Bye"))
						{
							z = 1;
						}
						else
						{
							String stringHeight = height;
							double doubleHeight = Double.parseDouble(stringHeight);
							if (doubleHeight > 6.0)
							{
								System.out.println(name + ", you are tall!");
							}
							else if (doubleHeight > 5.0)
							{
								System.out.println(name + ", you're average!");
							}
							else
							{
								System.out.println(name + ", you are short!");
							}
							
							
							System.out.print("What is your favorite color: ");
							String color = x.nextLine();
							if (color.equalsIgnoreCase("Bye"))
							{
								z = 1;
							}
							else
							{
								System.out.println(color + " is your favorite color!");
							}	
						}
					}
				}
			}
		}
 	 }
 	 
 	 
}