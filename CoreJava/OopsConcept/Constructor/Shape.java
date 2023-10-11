package Constructor;

public class Shape {
String Color=null;
int Borderwidth=0;
public Shape(String Color,int Borderwidth) {//parameterrised constructor
	this.Color=Color;
	this.Borderwidth=Borderwidth;
}
public String getColor() { //method
	return Color;
}
public void setColor(String color) {
	Color = color;
}
public int getBorderwidth() {
	return Borderwidth;
}
public void setBorderwidth(int borderwidth) {
	Borderwidth = borderwidth;
}
	
	
}


