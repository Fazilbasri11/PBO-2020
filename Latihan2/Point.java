
/**
 * Write a description of class Point here.
 *
 * @author FazilBasri
 * @version (a version number or a date)
 */
public class Point
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;

    /**
     * Constructor for objects of class Point
     */
    public Point()
    {
        // initialise instance variables
        x=0;
        y=0;
    }
    
    public Point (int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public int getx(){
        return this.x;
    }
    
    public void setX(int x){
        this.x=x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public void setY(int Y){
        this.y=y;
    }
    
    public String toString(){
        return "Nilai x adalah" +x+ "dan nilai y adalah" +y;
    }
}

 
