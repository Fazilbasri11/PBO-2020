
/**
 * Write a description of class Lines here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lines
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Lines
     */
    public Lines(int x1, int y1, int x2, int y2)
    {
        // initialise instance variables
        begin= new Point(x1, y1);
        end = new Point(x2,y2);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
