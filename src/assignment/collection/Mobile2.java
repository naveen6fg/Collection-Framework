package assignment.collection;

public class Mobile2
{
  String brand;
  long price;
public Mobile2(String brand, long price)
{
	super();
	this.brand = brand;
	this.price = price;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public long getPrice() {
	return price;
}
public void setPrice(long price) {
	this.price = price;
}

public String toString()
{
  return brand+"\t\t"+price;
}
}
