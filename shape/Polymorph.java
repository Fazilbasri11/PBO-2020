
/**
 * Write a description of class Polymorph here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class Polymorph {
   public static void main(String argv[]) {
      Shape scribble[] = new Shape[2];
      scribble[0] = new Rectangle(10, 20, 5, 6);
      scribble[1] = new Circle(15, 25, 8);

      for (int i = 0; i < scribble.length; i++) {
         scribble[i].draw();
         scribble[i].rMoveTo(100, 100);
         scribble[i].draw();
         
      Rectangle arect = new Rectangle(0, 0, 15, 15);
      arect.setWidth(30);
      arect.draw();
      }
    }
}
