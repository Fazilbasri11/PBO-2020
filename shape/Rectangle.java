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
	public double getlength(){
		return length;
	}
	public  void setlength(double length){
		this.length=length;
	}
	public double getwidth(){
		return width;
	}
	public void setwidth(double width){
		this.width=width;
	}
	public String getcolor(){
		return color;
	}
	public double getarea(){
		return width*length;
	}
	public String toString(){
		return length+" ("+color+")at" +width;
	}
}