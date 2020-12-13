public class Rectangle{
	private double length;
	private double width;
	private String color;

	public Rectangle(){
		this.length= 8;
		this.width= 5;
		this.color= "green";
	}
	public Rectangle(double length, double width){
		this.length=length;
		this.width=width;
	}
	public double getLength(){
		return length;
	}
	public  void setLength(double length){
		this.length=length;
	}
	public double getWidth(){
		return width;
	}
	public void setWidth(double width){
		this.width=width;
	}
	public String getColor(){
		return color;
	}
	public double getArea(){
		return width*length;
	}
	public String toString(){
		return length+" ("+color+")at" +width;
	}
}