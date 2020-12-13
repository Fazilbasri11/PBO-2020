/**
 * Write a description of class Shape here.
 *
 * @author (fazil basri)
 * @version (a version number or a date)
 */
public abstract class Shape 
{ 
    private String color;

    public Shape()
    {
        color = "red";
    }
    
    public Shape(String c){
        this.color = c;
    }

    public String getColor(){
        return color;
    }
    
    public void setColor(String c){
        this.color = c;
    }
    
    public abstract double getArea();
   
    
}