import java.util.*;
public class fibonacci {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int f0=0,f1=1;
		int res=0;
		System.out.print(f0+" "+f1+" ");
		 for (int i = 2; i < n; i++) {

	            res = f0 + f1;
	            f0 = f1;
	            f1 = res;
	            System.out.print(res+" ");
		 }	
		
}
}


