//Write a program to find if a number is a power of 2 or not.
import java.util.*;
public class BitMPower2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter no:");
          int n=sc.nextInt();
          int check1=n &(n-1);
          if(check1==0)
          {
        	  System.out.println(n+" is Power of 2");
          }
          else
          {
        	  System.out.println(n+" is not Power of 2");
          }
        	  
	}

}
