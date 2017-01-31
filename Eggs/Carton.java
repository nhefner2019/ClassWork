








public class Carton
{

  //class fields (encapsulation)
	private Egg e1;
	private Egg e2;
	
	public Carton()
	{
		this(new Egg(), new Egg(3, 4));
	}
	
	public Carton(Egg a, Egg b)
	{
		e1 = a;
		this.e2 = b;
	}
	
	//accessors
	public Egg getE1()
	{
		return e1;
	}
	
	public Egg getE2()
	{
		return e2;
	}
	
	
	//modifiers
	
	public void setE1(Egg e)
	{
		e1 = e;
	}
	
	public void setE2(Egg e)
	{
		e2 = e;
	}
	
	//toString method
	
	public String toString()
	{
		return (e1.toString() + e2.toString());
	}
	
	//other methods
	public String getName()
	{
		return e1.getName() + e2.getName();
	}
	
  

}
