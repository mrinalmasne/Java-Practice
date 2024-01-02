//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
import java.util.*;
public class stringcombinedLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter array size:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String arr[]=new String[size];
		int totLength=0;
		System.out.println("Enter array elements:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.next();
			totLength+=arr[i].length();
		}
		System.out.println("Combined length :"+totLength);
	}

}
