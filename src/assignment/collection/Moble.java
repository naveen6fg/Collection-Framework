package assignment.collection;

public class Moble
{
  String color;
  double price;
public Moble(String color, double price) {
	super();
	this.color = color;
	this.price = price;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

public String toString()
{
	return color+"\t\t"+price;
}
}
