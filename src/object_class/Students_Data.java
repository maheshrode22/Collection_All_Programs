package object_class;
import java.util.*;

public class Students_Data {

	

	public static void main(String[] args) {
		Vector v=new Vector();
		Student s=new Student();
		s.setId(1);
		s.setName("mahesh");
		
		Student s1=new Student();
		s1.setId(2);
		s1.setName("Om");
	
		v.add(s);
		v.add(s1);

			Iterator i= v.iterator();
			
	while(i.hasNext())
	{
		Object obj=i.next();
		Student ss=(Student)obj;
		System.out.println(ss.getId()+" "+ss.getName());
	}
			
		 
		
		
	}

}
