
/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Vehicle
{
    private int doors;
    
    public int getNumDoors()
    {
        return doors;
    }
    
    public int compareTo(Car c)
    {
        if(super.compareTo(c) == 0)
        {
            if(c.getNumDoors() == this.getNumDoors())
                return 0;
            else if(c.getNumDoors() < this.getNumDoors())
                return -1;
            else
                return 1;
        }
        
        else
            return super.compareTo(c);
    }
}
