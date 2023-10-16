package SetGet_method;

public class Bike {
	String Color;
	int Prize;
	int Average;
	public Bike(String Color,int Prize,int Average) {
		this.Color=Color;
		this.Prize=Prize;
		this.Average=Average;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getPrize() {
		return Prize;
	}
	public void setPrize(int prize) {
		Prize = prize;
	}
	public int getAverage() {
		return Average;
	}
	public void setAverage(int average) {
		Average = average;
	}
	
}
