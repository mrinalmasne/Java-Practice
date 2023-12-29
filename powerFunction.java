import java.util.*;
public class powerFunction {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x:");
		int x=sc.nextInt();
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int result=1;
		for(int i=0; i<n; i++) {
	           result = result * x;
	       }
 System.out.println("x to the power n is : "+ result);
	   }   


	}


