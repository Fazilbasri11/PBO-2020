
/**
 * Write a description of class TesShape here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TesShape extends Shape
{
    public static void main(String[] args){
        Shape s = new Shape();
        System.out.println(s.getArea());
        s = new Circle();
        System.out.println(s.getArea());
        s = new CylinderS();
        System.out.println(s.getArea());
        s = new Rectangle();
        System.out.println(s.getArea());
    }
}   
