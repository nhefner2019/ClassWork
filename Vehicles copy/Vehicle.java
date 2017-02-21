
/**
 * Write a description of class Vehicle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vehicle
{
   // instance variables - replace the example below with your own
    private int wheels;
    private String color;

    /**
     * Constructor for objects of class Animal
     */
    public Vehicle()
    {
        // initialize instance variables
        this(4,"red");
    }
    
    public Vehicle(int w,String s)
    {
        wheels = w;
        color = s;
    }
    
    public String getColor()
    {
        return color;
    }
    
    public int getWheels()
    {
        return wheels;
    }
    
    public void setColor(String s)
    {
        color = s;
    }
    
    public void setWheels(int w)
    {
        wheels = w;
    }
    
    public void setDescription(int w, String s)
    {
        wheels = w;
        color = s;
    }
    
    public boolean equals(Vehicle v)
    {
        return ((this.wheels==v.wheels)&&(this.color==v.color));
    }
    
    public String toString()
    {
        return "The vehicle is " + color + ". The vehicle has " + wheels + " wheels.";
    }
    
    public String costRange()
    {
        return "The vehicle cost will range from $20 to $4.5 million.";
    }
   
}
