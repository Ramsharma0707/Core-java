package in.com.Constructor;

public class Bike {
String Color;
int Price;
int Ave;

public Bike (String Color,int Price,int Ave) {
	this.Color=Color;
	this.Price=Price;
	this.Ave=Ave;
}


public String getColor() {
	return Color;
}

public void setColor(String color) {
	Color = color;
}

public int getPrice() {
	return Price;
}

public void setPrice(int price) {
	Price = price;
}

public int getAve() {
	return Ave;
}

public void setAve(int ave) {
	Ave = ave;
}
	


}
