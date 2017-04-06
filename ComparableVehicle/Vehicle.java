
/**
 * Abstract class Vehicle - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Vehicle implements Comparable<Vehicle>
{
    private int numWheels;
    private int maxSpeed;
    private int mpg;
    
    public int getNumWheels()
    {
        return numWheels;
    }
    
    public int getMaxSpeed()
    {
        return maxSpeed;
    }
    
    public int getMpg()
    {
        return mpg;
    }
    
    public int compareTo(Vehicle n)
    {
       if(n.getNumWheels() == this.getNumWheels() && n.getMaxSpeed() == this.getMaxSpeed() && n.getMpg() == this.getMpg())
          return 0;
       else if(n.getNumWheels() < this.getNumWheels() || n.getMaxSpeed() < this.getMaxSpeed() || n.getMpg() < this.getMpg())
          return -1;
       else
          return 1;
    }
}
