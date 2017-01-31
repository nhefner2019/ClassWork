public class EggRunner
{
	public static void main(String[] args)
	{
		
		Egg e1 = new Egg();
		Egg e2 = new Egg(3, 4);
		Egg e3 = new Egg((int) 3.5, 1, "B");
		System.out.println(e1.getWeight());
		e2.setWeight(4);
		System.out.println(e2.getWeight());
		e3.setName("E");
		System.out.println(e3.getName());
		
		System.out.println(e2);
		
		System.out.println(Egg.getNumEggs());
		
		Carton c1 = new Carton();
		System.out.println(c1);
		System.out.println(c1.getE1());
		System.out.println(c1.getE2());
	}
}