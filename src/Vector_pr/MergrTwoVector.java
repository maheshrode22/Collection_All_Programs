package Vector_pr;
import java.util.*;
public class MergrTwoVector {

	public static void main(String[] args) {
		Vector<String> v=new Vector<>();
		
		v.add("mahesh");
		v.add("rushi");
		v.add("ajit");
		v.add("roahan");
		System.out.println(v.size());
		System.out.println(v);
		Vector <String>v1=new Vector<>();
		v1.add("aarti");
		v1.add("samu");
		v1.add("shruti");
		
		Vector<String> v3=new Vector<>();
	        v3.addAll(v);
	        v3.addAll(v3);
	        
	       
		
		System.out.println(v3);
		
		
	}

}

