import java.util.*;
public class nameArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size:");
		int size=sc.nextInt();
		String name[]=new String[size];
		System.out.println("Enter names in array:");
		for(int i=0;i<size;i++) {
			name[i]=sc.next();
			
		}
		System.out.println("Names are:");
		for(int i=0;i<name.length;i++)
		{
			System.out.println(name[i]);
			
		}
		

	}

}
