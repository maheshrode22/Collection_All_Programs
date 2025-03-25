package collection_basics;

import java.util.*;

public class Fetch_data_Iterator {


	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		
		Iterator i=al.iterator();
		while(i.hasNext())
		{
			Object obj=i.next();
			System.out.print(obj+" ");
			
		}
			
		boolean b=al.contains(10);
		if(b)
		{
			System.out.println("true");
		}else
		{
			System.out.println("false");
		}
			
		

	}

}
