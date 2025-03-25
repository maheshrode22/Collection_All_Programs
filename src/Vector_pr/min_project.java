package Vector_pr;
import java.util.*;
public class min_project {

	public static void main(String[] args) {
	
		Vector v=new Vector();
		
		do{
			Scanner sc=new Scanner(System.in);
			System.out.println("1. Add 10 Values In Vector.\r\n"
					+ "2. Display All Values In Vector.\r\n"
					+ "3. Add New Value In Vector.\r\n"
					+ "4. Search Value In Vector.\r\n"
					+ "5. Sort All Values In Ascending Order In Vector.\r\n"
					+ "6. Sort All Values In Descending Order In Vector.\r\n"
					+ "7. Find Max Value In Vector.\r\n"
					+ "8. Find Min Value In Vector.\r\n"
					+ "9. Update Value In Vector.\r\n"
					+ "10. Delete Value In Vector.\r\n"
					+"11. exit \r\n");
				int ch=sc.nextInt();
				switch(ch)
				{
				case 1:
					
					System.out.println("Add 10 values in vector");
					for(int i=0;i<10;i++)
					{
						int d=sc.nextInt();
						boolean b=v.add(d);

					}
										
					break;
				case 2:
					System.out.println("Display All Values In Vector.");	
					System.out.println(v);
					break;
				case 3:
					System.out.println("Add New Value In Vector.");				
					int d=sc.nextInt();
					boolean b=v.add(d);
					 break;
				case 4:
					
				}
				
					
			
		}while(true);

	}

}
