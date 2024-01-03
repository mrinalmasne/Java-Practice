//Write a program to count the number of 1’s in a binary representation of the number.
import java.util.*;
public class countbinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no:");
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int count=0;
         while(n!=0)
         {
        	  count+=n&1;
        	  n>>=1;
         }
         System.out.println("Ones are:");
         System.out.println(count);
         
	}

}
