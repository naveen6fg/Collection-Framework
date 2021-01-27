package assignment.collection;

public class student20
{
	int id;
	String name;
	double marks;
	public student20(int id, String name, double marks)
	{
		
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	
	
	@Override
	public String toString()
	{
	 return id+"\t\t"+name+"\t\t"+marks; 	
	}
	
	 public int hashCode()
	 {
	        int hashcode = 0;
	        hashcode = id*20;
	        hashcode =hashcode +name.hashCode();
	        return hashcode;
	 }
	     
	    public boolean equals(Object obj)
	    {
	        
	        if (obj instanceof student20 ) {
	        	student20 pp = (student20) obj;
	            return (pp.name.equals(this.name) && pp.id == this.id);
	        } 
	        else
	        {
	            return false;
	        }
	    }
	
}
