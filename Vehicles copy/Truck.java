
/**
 * Write a description of class Aircrafts here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Truck extends Vehicle
{
   private int doors;
    public Truck()
   {
       super(12, "black");
       doors = 2;
   }
   
   public Truck(int w, String s, int d)
   {
       super(w,s);
       doors = d;
   }
   
   public int getDoors()
   {
       return doors;
   }
   
   public void setDoors(int d)
   {
       doors = d;
   }
   
   public void setDescription(int w, String s, int d)
   {
       super.setDescription(w,s);
       doors = d;
   }
   
   public boolean equals(Truck t)
   {
       return this.doors==t.doors;
   }
   
   public String toString()
   {
       return "The truck is " + getColor() + ". The truck has " + getWheels() + " wheels." + "The truck has" + doors + " doors."; 
   }
   
   public String costRange()
   {
       return "The truck cost will range from $9,000 to $150,000";
   }
}
