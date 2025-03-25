package Vector_pr;
import java.util.*;

public class RemoveDuplicateElementVector {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector<Integer> v=new Vector<>();
		System.out.println("enter a value");
		for(int i=0;i<6;i++)
		{
			int a=sc.nextInt();
			v.add(a);
		}
		
		 for (int i = 0; i < v.size(); i++) {
            for (int j = i + 1; j < v.size(); j++) {
                if (v.get(i).equals(v.get(j))) {
                    v.remove(j);
                    j--; 
                }
		System.out.println(v);

	}
		 }
}
}



//
//package Vector_pr;
//import java.util.*;
//
//public class RemoveDuplicateElementVector {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Vector<Integer> v = new Vector<>();
//        
//        System.out.println("Enter 6 values:");
//        for (int i = 0; i < 6; i++) {
//            int a = sc.nextInt();
//            v.add(a);
//        }
//
//        // Using LinkedHashSet to remove duplicates while maintaining order
//        Set<Integer> uniqueElements = new LinkedHashSet<>(v);
//        v.clear();
//        v.addAll(uniqueElements);
//
//        System.out.println("Vector after removing duplicates: " + v);
//        
//        sc.close();
//    }
//}
