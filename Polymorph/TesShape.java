
/**
 * Write a description of class Polymorph here.
 *
 * @author (fazil basri)
 * @version (a version number or a date)
 */
public class TesShape{
   public static void main(String[] args) {
      //Shape s = new Shape();
      //System.out.println(s.getArea());
      Shape s = new Circle();
      System.out.println(s.getArea());
      s = new Cylinder ();
      System.out.println(s.getArea());
      s = new Rectangle();
      System.out.println(s.getArea());
   }
}
