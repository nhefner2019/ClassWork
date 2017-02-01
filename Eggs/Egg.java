public class Egg
{
	//class fields
	private int weight; //ounces
	private int height; //centimeters
	private String name;
  
  //static fields
	private static int numEggs = 0;
	
  //constructors
  
  	/**
 	* Constructor which sets a default value for height, weight, and name of the egg.
  	*/
  	public Egg()
  	{
		this((int)2.5,6,"0");
	}
	
  /**
  * Constructor which takes in weight/height of egg and initializes the fields,
  * names the egg "A"
  *increments numEggs
  * @param int x weight of egg
  * @param int y height of egg
  */
	public Egg(int x, int y)
	{
		this.weight = x;
		this.height = y;
		name = "A";
		
		numEggs++;
	}
	
	/**
	*Constructor which takes in height/weight and name of the egg and initializes the fields
	*increments numEggs
	*@param int a weight of egg
	*@param int b height of egg
	*@param String s name of egg
	*/
	public Egg(int a, int b, String s)
	{
		weight = a;
		height = b;
		name = s;
		
		numEggs++;
	}
  
  //accessors 
  /**
  *Accessor which accesses the weight of the egg
  */
  	public int getWeight()
	{
		return weight;
	}
	
	/**
  	*Accessor which accesses the height of the egg
  	*/
	public int getHeight()
	{
		return height;
	}
	
	/**
  	*Accessor which accesses the name of the egg
 	*/
	public String getName()
	{
		return name;
	}
  
  	/**
 	*Accessor which accesses the weight of the egg
 	*/
  	public static int getNumEggs()
	{
		return numEggs;
	}
	
	//modifiers
	
	/**
  	*Modifier which takes in an int a and sets the weight of the egg
  	*to be a
  	*@param int a the number the weight is being set to
  	*/
	public void setWeight(int a)
	{
		weight = a;
	}
	
	/**
  	*Modifier which takes in an int height and sets the height of the egg to the int
  	*@param int a the number the weight is being set to
  	*/
	public void setHeight(int height)
	{
		height = height;
	}
	
	/**
  	*Modifier which takes in a String and sets the name of the egg to the string
  	*@param int a the number the weight is being set to
  	*/
	public void setName(String s)
	{
		name = s;
	}

	/**
	*This method returns a message that displays the name of the egg, its weight in ounces, 
	*and its height in inches
  	*@return the statement with all of the eggs credentials
  	*/
	public String toString()
	{
		return name + ": Weight = " + weight + " ounces, Height = " + height + " inches";
	}

}