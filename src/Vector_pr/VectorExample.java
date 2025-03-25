package Vector_pr;
import java.util.*;

public class VectorExample {

	public static void main(String x[]) {
		Vector<String> v= new Vector<>();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a value for vector: ");
		for(int i=0;i<4;i++)
		{
			String s=sc.nextLine();
			v.add(s);

			
		}
	System.out.println("before insert element vector"+v);
		System.out.println("Eneter a value to add  index or value");
		int i=sc.nextInt();
		 sc.nextLine();
		String ss=sc.nextLine();
			
		v.add(i, ss);
		System.out.println("after insert element vector"+v);
	}

}
