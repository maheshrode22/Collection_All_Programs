package Vector_pr;
import java.util.*;

class arraylistCollection{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList al =new ArrayList();
				
		do {
			System.out.println(
					"1. Add 10 Values In Arraylist.\r\n"
					+ "		2. Display All Values In Arraylist.\r\n"
					+ "		3. Add New Value In Arraylist.\r\n"
					+ "		4. Search Value In Arraylist.\r\n"
					+ "		5. Sort All Values In Ascending Order In Arraylist.\r\n"
					+ "		6. Sort All Values In Descending Order In Arraylist.\r\n"
					+ "		7. Find Max Value In Arraylist.\r\n"
					+ "		8. Find Min Value In Arraylist.\r\n"
					+ "		9. Update Value In Arraylist.\r\n"
					+ "		10. Delete Value In Arraylist.\r\n"
					+ "11. exit");
					int ch=sc.nextInt();
					
					switch(ch)
					{
					case 1:
						
							System.out.println("Eneter a 10 Value in ArrayList ");
							for(int i=0;i<5;i++)
							{
								int a=sc.nextInt();
								al.add(a);
							}
						
						break;
						
					case 2:
						
							System.out.println("All Arralist \n"+al);
							break;
							
						
					case 3:
					
							System.out.println("Eneter a value to add arrayList");
							int addNew=sc.nextInt();
							al.add(addNew);
				
						break;
						
					case 4:
						System.out.println("Enter a element to search arrayList");
						int serchElement=sc.nextInt();

							if(al.contains(serchElement))
							{
								System.out.println("found The element ");
							}else
							{
								System.out.println("not found");
							}
						
						break;
						
					case 5:
						System.out.println("before sorting "+al);
						Collections.sort(al);
						
						System.out.println("after sorting "+al);
						
						break;
						
					case 6:
						System.out.println("before sorting "+al);
						Collections.sort(al,Collections.reverseOrder());
						
						System.out.println("after sorting Descending order "+al);
						
						break;
		
					case 7:
						int  max = (int)al.get(0);
						for(int i =0; i<al.size();i++)
						{
							  if (max <(int) al.get(i))
							  {
								  max = (int)al.get(i);  
							  }
						}
						System.out.println(max);
					break;
					
					
					case 8:
						 int min=(int)al.get(0);
						 for(int i=0;i<al.size();i++)
						 {
							if(min>(int)al.get(i))
							{
								min=(int)al.get(i);
								
							}
							 
						 }
						 System.out.println(min);
						 break;
						 
					case 9:
						System.out.println("Eneter update value and and index value: ");
						
						int update=sc.nextInt();
						int ind=sc.nextInt();
							al.set(ind, update);
						break;
						
					case 10:
						System.out.print("enter a delet element");
						int delete=sc.nextInt();
						for(int i=0;i<al.size();i++)
						{
							if(delete == (int)al.get(i))
							{
								al.remove(i);
								break;
				
							}
						}
						break;
						
					case 11:
						System.exit(ch);
						break;
						
						default :
							System.out.println("Enter a correct option ");
					}
		}while(true);
		

	}

}
