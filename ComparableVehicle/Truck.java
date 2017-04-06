
/**
 * Write a description of class Truck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Truck extends Vehicle
{
    private int windows;
    
    public int getNumWindows()
    {
        return windows;
    }
    
    public int compareTo(Truck t)
    {
        if(super.compareTo(t) == 0)
        {
            if(t.getNumWindows() == this.getNumWindows())
                return 0;
            else if(t.getNumWindows() < this.getNumWindows())
                return -1;
            else
                return 1;
        }
        
        else
            return super.compareTo(t);
    }
}
