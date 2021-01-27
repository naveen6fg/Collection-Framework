package Car;

public class Car
{
		   private String cName;
		   private String cColor;
		   private double cPrice;
		 
		 public Car(String cName, String cColor, double cPrice)
		  {
			this.cName = cName;
			this.cColor = cColor;
			this.cPrice = cPrice;
		 
		  }
		public String getcName()
		{
			return cName;
		}
		public void setcName(String cName)
		{
			this.cName = cName;
		}
		public String getcColor()
		{
			return cColor;
		}
		public void setcColor(String cColor)
		{
			this.cColor = cColor;
		}
		public double getcPrice()
		{
			return cPrice;
		}
		public void setcPrice(double cPrice)
		{
			this.cPrice = cPrice;
		}
		
		@Override
		public String toString()
		{
			//"Name\t\tColor\t\tPrice"
			
			return cName+"\t\t\t"+cColor+"\t\t\t"+cPrice ;
		}
}
