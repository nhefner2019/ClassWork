
/**
 * Write a description of class Motorcycle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Motorcycle extends Vehicle
{
   private int hbLength;
   
   public int getHBLength()
    {
        return hbLength;
    }
    
    public int compareTo(Motorcycle m)
    {
        if(super.compareTo(m) == 0)
        {
            if(m.getHBLength() == this.getHBLength())
                return 0;
            else if(m.getHBLength() < this.getHBLength())
                return -1;
            else
                return 1;
        }
        
        else
            return super.compareTo(m);
    }
}
