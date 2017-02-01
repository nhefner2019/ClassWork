public class Carton
{

  //class fields (encapsulation)
	private Egg[] cart;
	
	public Carton()
	{
		cart = new Egg[12];
		for (int i = 0; i < 12; i++)
		{
			cart[i] = new Egg();
		}
	}
  
  public Carton(int x, int y)
	{
		cart = new Egg[12];
		for (int i = 0; i < 12; i++)
		{
			cart[i] = new Egg(x, y);
		}
	}
  
   public Carton(int x, int y, String s)
	{
		cart = new Egg[12];
		for (int i = 0; i < 12; i++)
		{
			cart[i] = new Egg(x, y, s);
		}
	}
  

	//accessors
	public Egg getEggi(int i)
  	{
  	return cart[i];
  	}
  
  
	//modifiers
	
  	public void setEggi(int i, Egg e)
  	{
  		cart[i] = e;	
  	}
  

	
	//toString method
	
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
