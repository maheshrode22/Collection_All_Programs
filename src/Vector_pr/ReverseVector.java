package Vector_pr;
import java.util.*;

public class ReverseVector {

	public  static void main(String x[]) {
		Scanner sc=new Scanner(System.in);
		Vector v=new Vector();
		System.out.println("Eneter a value");
		for(int i=0;i<5;i++)
		{ 
			int a=sc.nextInt();
			
			v.add(a);
			
		}
		
		System.out.println("before reverse vector\n"+v);
	
		int end=v.size()-1;

		System.out.println("After reverse vector\n");
		
		for(int i=end;i>=0;i--)
		{
			
			System.out.print(v.get(i)+" ");

		
		}
	
		
	}

}
