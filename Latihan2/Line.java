
/**
 * Write a description of class Line here.
 *
 * @author Fazil Basri
 * @version (a version number or a date)
 */
public class Line
{
    private Point begin;
    private Point end;

    /**
     * Constructor for objects of class LineSub
     */
    
    public Line(int x1, int y1, int x2, int y2)
    {
        begin = new Point(x1, y1); 
        end = new Point (x2, y2); 
    }
    
    public Line(Point b, Point e)
    {
        this.begin = b;
        this.end = e;
    }
    
    public Point getBegin()
    {
        return this.begin;
    }

    public void setBegin(Point b)
    {
        this.begin = b;
    }
    
    public Point getEnd(){
        return this.end;
    }
    
    public void setEnd (Point e) {
        this.end = e;
    }
    
    public int getBeginX() {
        return begin.getx(); 
    }
    
    public void setBeginX (int x) {
        begin.setX(x);
    }
    
    public int getBeginY() {
        return begin.getY();
    }
    
    public void setBeginY (int y) {
        begin.setY(y);
    }
    
    public void setBeginXY (int x, int y){
        begin.setX(x);
        begin.setY(y); 
    }

    public int getEndX (){
        return end.getx(); 
    }
    
    public void setEndX(int x){
        end.setX(x);
    }
    
    public int getEndY (){
        return end.getY(); 
    }
    
    public void setEndY(int y){
        end.setY(y);
    }
    
    public void setEndXY(int x, int y){
        end.setX(x);
        end.setY(y);
    }
    
    public String toString(){
        return "Garis dengan titik 1=" +begin.toString()+ "titik 2=" +end.toString();
    }
    
    public double getLength() {
        return Math.sqrt(Math.pow((end.getx() - begin.getx()), 2) + Math.pow((end.getY() - begin.getY()), 2));
    }
}
