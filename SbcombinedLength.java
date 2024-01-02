//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.(Using StringBuilder)
import java.util.*;
public class SbcombinedLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:");
        int size=sc.nextInt();
        String[] arr=new String[size];
        
       StringBuilder sb=new StringBuilder();
        for(int i=0;i<size;i++)
        {
        	arr[i]=sc.next();
        	
        }
        for (int i=0;i<arr.length;i++) {
            sb.append(arr[i]);
        }
        System.out.println("Length is");
        
	    System.out.println(sb.length());
	}

}
