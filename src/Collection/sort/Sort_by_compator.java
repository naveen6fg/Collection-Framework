package Collection.sort;

import java.util.Comparator;

class Sort_by_compator implements Comparator<Student1>
{
	
	@Override
	public int compare(Student1 s1,Student1 s2)
	{
		if(s1.name.equals(s2.name))
		{
			return s1.name.compareTo(s2.name);
		}
		else
		{
		return ((Integer)s1.id).compareTo(s2.id);	
		}
	}

	
}
