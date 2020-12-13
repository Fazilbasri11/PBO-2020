/**
 * Write a description of class Circle here.
 * 
 * @author Fazil
 * @version (a version number or a date)
 */
public class Circle
{
    // instance variables - replace the example below with your own
    private double radius;
    private String color;

    /**
     * Constructor for objects of class Circle
     */
    public Circle()
    {
        // initialise instance variables
        radius = 1.0;
        color = "red";
    }
    
    /**
     * Constructor for objects of class Circle
     */
    public Circle(double radius)
    {
        // initialise instance variables
        this.radius = radius;
        this.color = "red";
    }

    /**
     * Method getRadius untuk mengembalikan jari-jari lingkaran
     * 
     * @return     nilai jari-jari (radius)
     */
    public double getRadius()
    {
        return radius;
    }
    
	/**
     * Method setRadius untuk mengubah jari-jari lingkaran
     * 
     * @param     nilai jari-jari (radius)
     */
    public void setRadius(double radius)
    {
        this.radius = radius;
    }	
	
    /**
     * Method getArea untuk mengembalikan luas lingkaran
     * 
     * @return     luas lingkaran
     */
    public double getArea()
    {
        // put your code here
        return 3.14*radius*radius;
    }
    
    public String toString(){
        return "Lingkaran dgn radius: "+this.radius;
    }
       
    public static void main(String arg[]){
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(3);
        System.out.println(c1.toString());
        System.out.println(c1.getRadius());
        System.out.println(c2.getRadius());
    }
}