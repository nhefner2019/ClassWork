/**
*This class takes in as a field an array of type eggs and creates a new type of carton. This type will then have accessors, modifiers
*and a toString method.
*@author Joseph Beatty, Nathan Hefner, Ethan Malzberg, Jack Gambello
*@version 1.0
*
*/
public class Carton
{

  //class fields (encapsulation)
	private Egg[] cart;
	
	  /**
  *Conostructor that takes in no parameters and makes a new type which is an array of 12 eggs
  */
	public Carton()
	{
		cart = new Egg[12];
		for (int i = 0; i < 12; i++)
		{
			cart[i] = new Egg();
		}
	}
    
/**
  *constructor that takes in the starting height and weight of the first egg and then increments by one every egg.
  *@param int x is the height
  *@param int y is the weight
  */
  public Carton(int x, int y)
	{
		cart = new Egg[12];
		for (int i = 0; i < 12; i++)
		{
			cart[i] = new Egg(x, y);
		}
	}
    /**
  *Constructor that takes in height weight and name as a parameter
  *@param int x is the height
  *@param int y is the weight
  *@param String s is the name of the egg
  */
   public Carton(int x, int y, String s)
	{
		cart = new Egg[12];
		for (int i = 0; i < 12; i++)
		{
			cart[i] = new Egg(x, y, s);
		}
	}
  

	//accessors
	  /**
  *accesor that takes in the index and returns the egg in the carton at that index
  *@param int i index
  *@return cart[i]
  */
	public Egg getEggi(int i)
  	{
  	return cart[i];
  	}
  
  
	//modifiers
	  /**
  *modifier that takes in the index and an egg and changes the egg at that index into the parameter egg
  *@param int i index
  *@param Egg e is the egg that will replace other eggs
  */
  	public void setEggi(int i, Egg e)
  	{
  		cart[i] = e;	
  	}
  

	
	//toString method
		/**
  *This method prints out the cart of eggs by utilising the Egg class toString method
  *@return output that holds all printing values of the eggs in the cart
  */
	public String toString()
	{
  		String output = "";
  		for (int i = 0; i < 12; i++)
   	 	{
    		output+= cart[i].toString() + ", ";
  	 	}
   	 	return output;
	}
	
}
