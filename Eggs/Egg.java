public class Egg
{
	//class fields
	private int weight; //ounces
	private int height; //centimeters
	private String name;
  
  //static fields
	private static int numEggs = 0;
	
  //constructors
  
  public Egg()
  {
		this((int)2.5,6,"0");
	}
	
	public Egg(int x, int y)
	{
		this.weight = x;
		this.height = y;
		name = "A";
		
		numEggs++;
	}
	
	public Egg(int a, int b, String s)
	{
		weight = a;
		height = b;
		name = s;
		
		numEggs++;
	}
  
  //accessors 
  
  public int getWeight()
	{
		return weight;
	}
	
	
	public int getHeight()
	{
		return height;
	}
	
	public String getName()
	{
		return name;
	}
  
  public static int getNumEggs()
	{
		return numEggs;
	}
	
	public void setWeight(int a)
	{
		weight = a;
	}
	
	public void setHeight(int height)
	{
		height = height;
	}
	
	public void setName(String s)
	{
		name = s;
	}

	public String toString()
	{
		return name + ": Weight = " + weight + " ounces, Height = " + height + " inches";
	}

}