/**
 * Class Cylinder merupakan turunan dari class Circle
 * 
 * @author (basri) 
 * @version (a version number or a date)
 */
public class Cylinder extends Circle
{
    // instance variables - replace the example below with your own
    private double height;

    /**
     * Constructor for objects of class Cylinder
     */
    public Cylinder()
    {
        // initialise instance variables
        super(1.0);
        this.height = 4.0;
    }
    
    /**
     * Constructor for objects of class Cylinder
     */
    public Cylinder(double radius)
    {
        // initialise instance variables
        super(radius);
        this.height = 4.0;
    }
    
    /**
     * Constructor for objects of class Cylinder
     */
    public Cylinder(double radius, double height)
    {
        // initialise instance variables
        super(radius);
        this.height = height;
    }

    /**
     * Method getHeight untuk mengembalikan tinggi cylinder
     * 
     * @return     tinggi cylinder
     */
    public double getHeight()
    {
        // put your code here
        return this.height;
    }
    
    /**
     * Method getVolume untuk mengembalikan volume cylinder
     * 
     * @return     volume cylinder
     */
    public double getVolume()
    {
        // put your code here
        //return 3.14 * super.getRadius() * super.getRadius() * height;
        return super.getArea() * height;
    }
}