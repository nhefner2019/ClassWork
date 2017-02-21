
/**
 * Write a description of class Car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Car extends Vehicle
{
   private int doors;
    public Car()
   {
       super(4, "red");
       doors = 4;
   }
   
   public Car(int w, String s, int d)
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
   
   public boolean equals(Car c)
   {
       return super.equals(c) && this.doors==c.doors;
   }
   
   public String toString()
   {
       return "The car is " + getColor() + ". The car has " + getWheels() + " wheels." + "The car has" + doors + " doors."; 
   }
   
   public String costRange()
   {
       return "The car cost will range from $15,000 to 4.5 million dollars";
   }
}
