
/**
 * Write a description of class Point3D here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Point3D extends Point
{
    // instance variables - replace the example below with your own
    private int z;

    /**
     * Constructor for objects of class Point3D
     */
    public Point3D()
    {
        // initialise instance variables
        super ();
        z = 12;
    }
    
    public Point3D(int x,int y, int Z){
        super(x,y);
        this.z=z;
    }
    
    public int getZ(){
        return this.z;
    }
    
    public void setZ(int Z){
        this.z=z;
    }
    
    public String toString(){
        return super.toString() + " dan nilai Z Adalah" + z;
    }
} 

   