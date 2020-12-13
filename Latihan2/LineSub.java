
/**
 * Write a description of class LineSub here.
 *
 * @author Fazil Basri
 * @version (a version number or a date)
 */

public class LineSub extends Point{
   
 // instance variables - replace the example below with your own
    
    private Point end;
 
    public LineSub(int x1, int y1, int x2, int y2)
    { 
 // initialise instance variables
        super(x1,y1);
        end = new Point (x2,y2);     
    }
    
    public LineSub(Point begin, Point end){
        super(begin.getx(), begin.getY());
        this.end = end;
    }
    
    public Point getEnd(){
        return this.end;
    }
     
    public void setEnd(Point end){
        this.end = end;
    }
     
    public Point getBegin(){
       return this; //begin 
    }
     
    public void setBegin(Point begin){
        super.setX(begin.getx());
        super.setY(begin.getY());
    }

    public int getBeginX(){ 
        return super.getx();
    }
   
    public void setBeginX(int x){
        super.setX(x);   
    }
       
    public int getBeginY(){
        return super.getY();
    }
       
    public void setBeginY(int y){
        super.setY(y);
    }
       
    public void setBeginXY(int x, int y){
       super.setX(x);
       super.setY(y);
    }
      
    public int getEndX(){
        return end.getx();
    }
      
    public void setEndX(int x){
        end.setX(x);
    }
     
    public int getEndY(){
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
        return "LineSub (begin=" + super.toString() + ",end=" + end + ")";   
    } 
   
    public double getLength(){   
        int xL = super.getx() - end.getx();
        int yL = super.getY() - end.getY();
        
        return Math.sqrt(Math.pow(xL,2) + Math.pow(yL,2) );
    }
       
}
