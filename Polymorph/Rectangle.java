public class Rectangle extends Shape
{
    // instance variables - replace the example below with your own
    private double length;
    private double width;
    private String color;

    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle()
    {
        this.length = 9.0;
        this.width = 4.0;
        this.color = "green";
    }
    
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    
    public double getLength()
    {
        return this.length;
    }
    
    public void setLength(double length)
    {
       this.length = length;
    }
    
    public double getWidth()
    {
        return this.width;
    }
    
    public void setWidth(double width)
    {
        this.width = width;
    }
    
    public String getColor()
    {
        return this.color;
    }
    
    public double getArea()
    {
        return length*width;
    }
    
    public String toString()
    {
        return length+" ("+color+") at"+width;
    }
}